package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Hero(
    val name: String,
    val description: String,
    val photo: Int
) : Parcelable
