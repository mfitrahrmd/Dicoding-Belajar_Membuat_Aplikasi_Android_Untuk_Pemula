package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Skin
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.CharacterBinding

class CharacterSkinInfoViewPagerAdapter(
    pages: List<Skin>,
) : RecyclerView.Adapter<CharacterSkinInfoViewPagerAdapter.CharacterViewHolder>() {
    private lateinit var _binding: CharacterBinding

    private val _pages = pages.map {
        object {
            var showArt = false
            val skin = it
        }
    }

    class CharacterViewHolder(binding: CharacterBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        _binding = CharacterBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return CharacterViewHolder(_binding)
    }

    override fun getItemCount(): Int = _pages.size

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {

        with(holder) {
            with(_pages[position]) {
                _binding.ivCharImage.setImageResource(
                    if (showArt && skin.artImageId != null) {
                        skin.artImageId
                    } else {
                        skin.imageId
                    }
                )
                _binding.tvCharName.text = skin.name
            }
        }
    }

    fun toggleArt(position: Int) {
        with(_pages[position]) {
            showArt = !showArt
        }
        notifyItemChanged(position)
    }
}
