package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Character(
    val name: String,
    val specialities: List<String>,
    val info: String,
    val health: Int,
    val armor: Int,
    val energy: Int,
    val damage: Int,
    val color: Int,
    val buff: Buff,
    val skins: List<Skin>,
    val weapons: List<Weapon>,
    val skills: List<Skill>
) : Parcelable
