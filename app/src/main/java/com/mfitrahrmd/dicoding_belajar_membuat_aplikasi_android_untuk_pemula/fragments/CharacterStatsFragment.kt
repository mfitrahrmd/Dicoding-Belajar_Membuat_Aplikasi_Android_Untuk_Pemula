package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.adapters.WeaponInfoViewPagerAdapter
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Character
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.CharacterStatsBinding


class CharacterStatsFragment(
    private val _character: Character
) : Fragment() {
    private lateinit var _binding: CharacterStatsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = CharacterStatsBinding.inflate(inflater, container, false)

        _binding.tvBuffDesc.text = _character.buff.description
        _binding.ivBuff.setImageResource(_character.buff.imageId)

        _binding.tvCharHlth.text = _character.health.toString()
        _binding.tvCharArmr.text = _character.armor.toString()
        _binding.tvCharEnrgy.text = _character.energy.toString()
        _binding.tvCharDmg.text = _character.damage.toString()

        _binding.vpWeap.adapter = WeaponInfoViewPagerAdapter(_character.weapons)

        return _binding.root
    }

    fun setWeaponViewPagerPosition(position: Int) {
        _binding.vpWeap.setCurrentItem(position, true)
    }
}