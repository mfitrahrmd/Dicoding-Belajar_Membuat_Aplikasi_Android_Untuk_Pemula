package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Character(
    val name: String,
    val specialities: Array<String>,
    val info: String,
    val health: Int,
    val armor: Int,
    val energy: Int,
    val damage: Int,
    val color: Int,
    val buff: Buff,
    val skins: Array<Skin>,
    val weapons: Array<Weapon>
) : Parcelable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Character

        if (!specialities.contentEquals(other.specialities)) return false
        if (!skins.contentEquals(other.skins)) return false
        if (!weapons.contentEquals(other.weapons)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = specialities.contentHashCode()
        result = 31 * result + skins.contentHashCode()
        result = 31 * result + weapons.contentHashCode()
        return result
    }
}
