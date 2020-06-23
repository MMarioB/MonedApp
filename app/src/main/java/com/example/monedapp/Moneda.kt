package com.example.monedapp

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.Gravity.CENTER
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_moneda.*

class Moneda : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moneda)
        onCoinTap()

        volver.setOnClickListener {

            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun onCoinTap() {
        iv_moneda.setOnClickListener {
            val randomNumber = (1..2).random()

            if (randomNumber == 1) {
                flipTheCoin(R.mipmap.ic_cara, "Cara")
            } else {
                flipTheCoin(R.mipmap.ic_cruz, "Cruz")
            }
        }
    }

    private fun flipTheCoin(imageId: Int, coinSide: String) {

        iv_moneda.animate().apply {
            duration = 1000
            rotationYBy(1000f)
            iv_moneda.isClickable = false
        }.withEndAction {
            iv_moneda.setImageResource(imageId)
            val _mToast =
                Toast.makeText(this, coinSide, Toast.LENGTH_SHORT)
            _mToast.setGravity(CENTER or Gravity.RIGHT, 425, 450)
            _mToast.show()

            iv_moneda.isClickable = true
        }.start()
    }
}
