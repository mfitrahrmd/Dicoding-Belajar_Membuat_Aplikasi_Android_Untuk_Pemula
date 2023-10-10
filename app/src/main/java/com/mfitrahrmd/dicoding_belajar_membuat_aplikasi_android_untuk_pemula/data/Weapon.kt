package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Weapon(
    val name: String,
    val type: String,
    val damage: Int,
    val energyCost: Int,
    val critChance: Int,
    val inaccuracy: Int,
    val imageUrl: String
) : Parcelable
