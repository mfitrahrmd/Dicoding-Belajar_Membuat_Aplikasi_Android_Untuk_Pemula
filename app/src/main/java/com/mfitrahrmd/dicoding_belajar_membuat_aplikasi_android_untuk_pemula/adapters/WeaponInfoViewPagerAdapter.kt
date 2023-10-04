package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Weapon
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.WeaponBinding

class WeaponInfoViewPagerAdapter(
    private val _pages: Array<Weapon>,
) : RecyclerView.Adapter<WeaponInfoViewPagerAdapter.WeaponViewHolder>() {
    private lateinit var _binding: WeaponBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeaponViewHolder {
        _binding = WeaponBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return WeaponViewHolder(_binding)
    }

    override fun getItemCount(): Int = _pages.size

    override fun onBindViewHolder(holder: WeaponViewHolder, position: Int) {
        with(holder) {
            with(_pages[position]) {
                _binding.ivWeapImage.setImageResource(imageId)
                _binding.tvWeapName.text = name
                _binding.tvWeapType.text = "($type)"
            }
        }
    }

    class WeaponViewHolder(binding: WeaponBinding): RecyclerView.ViewHolder(binding.root)
}
