package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.ActivityMoveForResultBinding

class MoveForResultActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_SELECTED_VALUE = "extra_selected_value"
        const val RESULT_CODE = 110
    }

    private lateinit var _moveForResultBinding: ActivityMoveForResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _moveForResultBinding = ActivityMoveForResultBinding.inflate(layoutInflater)
        setContentView(_moveForResultBinding.root)

        _moveForResultBinding.btnSelect.setOnClickListener {
            if (_moveForResultBinding.rgNumber.checkedRadioButtonId > 0) {
                val value = when (_moveForResultBinding.rgNumber.checkedRadioButtonId) {
                    R.id.rb150 -> 150
                    R.id.rb200 -> 200
                    R.id.rb250 -> 250
                    else -> 0
                }

                val resultIntent = Intent()
                resultIntent.putExtra(EXTRA_SELECTED_VALUE, value)
                setResult(RESULT_CODE, resultIntent)
                finish()
            }
        }
    }
}