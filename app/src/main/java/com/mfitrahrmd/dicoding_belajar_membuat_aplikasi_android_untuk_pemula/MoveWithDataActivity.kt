package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.ActivityMoveWithDataBinding

class MoveWithDataActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_AGE = "extra_age"
    }

    private lateinit var _moveWithDataBinding: ActivityMoveWithDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _moveWithDataBinding = ActivityMoveWithDataBinding.inflate(layoutInflater)
        setContentView(_moveWithDataBinding.root)

        _moveWithDataBinding.tvData.text = "Your Name : ${intent.getStringExtra(EXTRA_NAME)}, Your Age : ${intent.getIntExtra(
            EXTRA_AGE, 0)}"
    }
}