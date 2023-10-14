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
    val meleeDamage: Int,
    val color: Int?,
    val buff: Buff,
    val skins: List<Skin>,
    val weapons: List<Weapon>,
    val skills: List<Skill>,
    val statistics: String,
    val quotes: List<String>
) : Parcelable {
    fun formattedString(): String {
        return """Character Name: $name
            |Specialities : ${specialities.joinToString(", ")}
            |Info : $info
            |Max Health : $health
            |Max Armor : $armor
            |Max Energy : $energy
            |Melee Damage : $meleeDamage
            |Buff : ${buff.description}
            |Skins : ${skins.map { it.name }.joinToString(", ")}
            |Starting Weapon : ${weapons.first().name}
            |Skills : ${skills.map { "\n- ${it.name} (${it.basicInfo})" }}
            |Statistics : $statistics
            |Quotes : ${quotes.joinToString(", ")}
        """.trimMargin()
    }
}
