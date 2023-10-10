package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Skill(
    val name: String,
    val imageUrl: String,
    val basicInfo: String,
    val detailInfo: String
) : Parcelable
