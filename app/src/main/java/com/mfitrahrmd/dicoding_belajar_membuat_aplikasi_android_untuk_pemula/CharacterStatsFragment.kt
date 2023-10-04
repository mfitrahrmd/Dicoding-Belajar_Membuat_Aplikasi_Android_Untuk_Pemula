package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.adapters.WeaponInfoViewPagerAdapter
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Weapon
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.CharacterStatsBinding


class CharacterStatsFragment : Fragment() {
    private lateinit var _binding: CharacterStatsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = CharacterStatsBinding.inflate(inflater, container, false)

        _binding.vpWeap.adapter = WeaponInfoViewPagerAdapter(
            arrayOf(
                Weapon("Wooden Cross", "Staff", 4, 2, 0, 5, R.drawable.priestess_weapon_0),
                Weapon("Wooden Cross", "Staff", 4, 2, 0, 5, R.drawable.priestess_weapon_7),
            )
        )

        return _binding.root
    }

    fun setWeaponViewPagerPosition(position: Int) {
        _binding.vpWeap.setCurrentItem(position, true)
    }
}