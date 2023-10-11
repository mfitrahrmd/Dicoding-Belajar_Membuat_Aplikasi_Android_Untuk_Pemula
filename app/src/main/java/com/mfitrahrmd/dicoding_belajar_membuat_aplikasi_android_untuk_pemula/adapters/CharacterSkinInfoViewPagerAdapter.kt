package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
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
        with(_pages[position]) {
            Glide.with(holder.itemView.context).load(if (showArt && skin.artImageUrl != null) {
                skin.artImageUrl
            } else {
                skin.imageUrl
            }).into(_binding.ivCharImage)
            _binding.tvCharName.text = skin.name

            // for debug purpose
            _binding.root.setOnClickListener {
                Log.d("position", position.toString())
            }
        }
    }

    // TODO : BUG! change image art more than one skin causes the position swapped unexpectedly
    fun toggleArt(position: Int) {
        with(_pages[position]) {
            showArt = !showArt
        }
        notifyItemChanged(position)
    }
}
