package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Skin
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.CharacterBinding

class CharacterSkinInfoViewPagerAdapter(
    private val _pages: Array<Skin>,
) : RecyclerView.Adapter<CharacterSkinInfoViewPagerAdapter.CharacterViewHolder>() {
    private lateinit var _binding: CharacterBinding

    class CharacterViewHolder(binding: CharacterBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        _binding = CharacterBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return CharacterViewHolder(_binding)
    }

    override fun getItemCount(): Int = _pages.size

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {

        with(holder) {
            with(_pages[position]) {
                _binding.ivCharImage.setImageResource(imageId)
                _binding.tvCharName.text = name
            }
        }
    }
}
