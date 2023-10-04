package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Character(
    val name: String,
    val specialities: ArrayList<String>,
    val info: String,
    val image: Int,
    val color: Int
) : Parcelable
