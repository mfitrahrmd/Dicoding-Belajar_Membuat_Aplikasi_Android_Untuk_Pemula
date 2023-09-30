package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var _mainBinding: ActivityMainBinding

    private val resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        if (it.resultCode == MoveForResultActivity.RESULT_CODE) {
            if (it.data != null) {
                val selectedValue = it.data?.getIntExtra(MoveForResultActivity.EXTRA_SELECTED_VALUE, 0)

                _mainBinding.tvResult.text = "Hasil : $selectedValue"
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_mainBinding.root)

        _mainBinding.btnMove.setOnClickListener {
            move(this@MainActivity)
        }

        _mainBinding.btnMoveWithData.setOnClickListener {
            moveWithData(this@MainActivity)
        }

        _mainBinding.btnMoveWithObject.setOnClickListener{
            moveWithObject(this@MainActivity)
        }

        _mainBinding.btnDialNumber.setOnClickListener {
            val phoneNumber = "081234567890"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

        _mainBinding.btnMoveForResult.setOnClickListener {
            moveForResult(this@MainActivity)
        }
    }

    private fun moveForResult(ctx: Context) {
        val moveForResultIntent = Intent(ctx, MoveForResultActivity::class.java)
        resultLauncher.launch(moveForResultIntent)
    }

    private fun moveWithObject(ctx: Context) {
        val moveWithObjectIntent = Intent(ctx, MoveWithObjectActivity::class.java)
        moveWithObjectIntent.putExtra(MoveWithObjectActivity.EXTRA_PERSON, Person("John Doe", 23))
        startActivity(moveWithObjectIntent)
    }

    private fun moveWithData(ctx: Context) {
        val moveWithDataIntent = Intent(ctx, MoveWithDataActivity::class.java)
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "John Doe")
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 23)
        startActivity(moveWithDataIntent)
    }

    private fun move(ctx: Context) {
        val moveIntent = Intent(ctx, MoveActivity::class.java)
        startActivity(moveIntent)
    }

}