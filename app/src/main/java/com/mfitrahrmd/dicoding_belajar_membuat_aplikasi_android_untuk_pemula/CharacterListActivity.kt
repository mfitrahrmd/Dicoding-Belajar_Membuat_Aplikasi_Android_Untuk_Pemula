package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula

import android.annotation.SuppressLint
import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Buff
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Character
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Skin
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Weapon
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.ActivityCharacterListBinding
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
                ivChar.setImageResource(skins.first().imageId)
                cardChar.setCardBackgroundColor(color)
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

class CharacterListActivity : AppCompatActivity() {
    private lateinit var _characterListBinding: ActivityCharacterListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _characterListBinding = ActivityCharacterListBinding.inflate(layoutInflater)
        setContentView(_characterListBinding.root)

        with(_characterListBinding.rvCharacters) {
            val characterListAdapter = CharacterListAdapter(arrayListOf(
                Character(
                    "Priestess",
                    arrayOf("regen"),
                    "The Priestess has good armor and energy, but bad health and melee damage",
                    3,
                    5,
                    200,
                    3,
                    R.color.priestess,
                    Buff("Improve potion efectiveness", R.drawable.buff_potioneffectiveness),
                    arrayOf(
                        Skin("Holy White", R.drawable.priestess_0, null),
                        Skin("Boyi the Valor", R.drawable.priestess_7, null),
                        Skin("Virgo", R.drawable.priestess_17, R.drawable.priestess_art_17)
                    ),
                    arrayOf(
                        Weapon("Wooden Cross", "Staff", 4, 2, 0, 5, R.drawable.priestess_weapon_0),
                        Weapon("Wooden Cross", "Staff", 4, 2, 0, 5, R.drawable.priestess_weapon_7),
                        Weapon("Stellar Whisper", "Staff", 4, 2, 0, 5, R.drawable.priestess_weapon_17),
                    )
                )
            ))

            adapter = characterListAdapter

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