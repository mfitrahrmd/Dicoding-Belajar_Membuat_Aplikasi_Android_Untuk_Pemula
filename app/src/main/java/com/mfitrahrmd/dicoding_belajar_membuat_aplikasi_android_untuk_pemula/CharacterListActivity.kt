package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.adapters.CharacterListAdapter
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Buff
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Character
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.CharacterDataProvider
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Skill
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Skin
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Weapon
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.ActivityCharacterListBinding

class CharacterListActivity : AppCompatActivity() {
    private lateinit var _characterListBinding: ActivityCharacterListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _characterListBinding = ActivityCharacterListBinding.inflate(layoutInflater)
        setContentView(_characterListBinding.root)
        setSupportActionBar(_characterListBinding.appToolbar)

        with(_characterListBinding.rvCharacters) {
            val characterListAdapter = CharacterListAdapter(CharacterDataProvider.allCharacters)

            characterListAdapter.setOnItemClickCallback { c ->
                startActivity(Intent(this@CharacterListActivity, CharacterDetailActivity::class.java).putExtra(CharacterDetailActivity.EXTRA_CHARACTER, c))
            }

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.about_page -> startActivity(Intent(this@CharacterListActivity, AboutActivity::class.java))
        }

        return super.onOptionsItemSelected(item)
    }
}