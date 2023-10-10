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
    private var _first = true
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

        // disable weapon view pager swipe from user
        _binding.vpWeap.isUserInputEnabled = false

        return _binding.root
    }

    fun selectWeaponPage(position: Int) {
        // skip weapon view pager access for the first time, (because the _binding has not been initialize yet)
        if (position == 0 && _first) {
            _first = false
            return
        }
        _binding.vpWeap.currentItem = position
    }
}