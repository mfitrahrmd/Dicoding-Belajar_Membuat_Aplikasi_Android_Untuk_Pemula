package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Character
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.ItemCharacterBinding

class CharacterListAdapter(val characters: ArrayList<Character>) :
    RecyclerView.Adapter<CharacterListAdapter.CharacterListViewHolder>() {
    private var _onItemClickCallback: ((Character) -> Unit)? = null

    class CharacterListViewHolder(val itemCharacterBinding: ItemCharacterBinding) :
        RecyclerView.ViewHolder(itemCharacterBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterListViewHolder {
        val itemCharacterBinding: ItemCharacterBinding =
            ItemCharacterBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return CharacterListViewHolder(itemCharacterBinding)
    }

    override fun getItemCount(): Int = characters.size

    override fun onBindViewHolder(holder: CharacterListViewHolder, position: Int) {
        with(holder.itemCharacterBinding) {
            with(characters[position]) {
                tvCharName.text = name
                tvCharSpecialities.text = specialities.joinToString(", ")
                tvCharInfo.text = info
                Glide.with(holder.itemView.context).load(skins.first().imageUrl).into(ivChar)
                if (color != null) {
                    cardChar.setCardBackgroundColor(color)
                }
            }
        }
        holder.itemView.setOnClickListener {
            _onItemClickCallback?.invoke(characters[position])
        }
    }

    fun setOnItemClickCallback(onItemClick: (Character) -> Unit) {
        _onItemClickCallback = onItemClick
    }
}