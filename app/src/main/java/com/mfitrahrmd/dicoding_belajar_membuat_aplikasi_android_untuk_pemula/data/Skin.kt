package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Skin(
    val name: String,
    val imageUrl: String,
    val artImageUrl: String?
) : Parcelable
