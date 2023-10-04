package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula

import android.annotation.SuppressLint
import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Character
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.ActivityCharacterListBinding
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.ItemCharacterBinding

class CharacterListAdapter(val characters: ArrayList<Character>) :
    RecyclerView.Adapter<CharacterListAdapter.CharacterListViewHolder>() {
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
                ivChar.setImageResource(image)
                cardChar.setCardBackgroundColor(color)
            }
        }
    }
}

class CharacterListActivity : AppCompatActivity() {
    private lateinit var _characterListBinding: ActivityCharacterListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _characterListBinding = ActivityCharacterListBinding.inflate(layoutInflater)
        setContentView(_characterListBinding.root)

        with(_characterListBinding.rvCharacters) {
            adapter = CharacterListAdapter(arrayListOf(
                Character("Priestess", arrayListOf("regen"), "She has blonde hair, aqua eyes, and is wearing a white hooded robe.", R.drawable.priestess_0, -8893),
                Character("Witch", arrayListOf("crowd control", "magic burst"), "She appears to be an amaranth-haired female wearing a bandana scarf of the same color, with a rust brown cloak and pointed hat. She also appears to wear a black blouse and boots.", R.drawable.witch_0, -3704256),
            ))
            layoutManager = LinearLayoutManager(this@CharacterListActivity)
            addItemDecoration(object : RecyclerView.ItemDecoration() {
                @SuppressLint("UseCompatLoadingForDrawables")
                override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
                    super.onDraw(c, parent, state)
                    val divider = getDrawable(R.drawable.list_character_divider)

                    divider?.draw(c)
                }
            })
        }
    }
}