package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.adapters.CharacterInfoViewPagerAdapter
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.adapters.CharacterSkinInfoViewPagerAdapter
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.adapters.SkillInfoAdapter
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Character
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.ActivityCharacterDetailBinding
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.fragments.CharacterLoreFragment
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.fragments.CharacterStatsFragment

class CharacterDetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_CHARACTER = "extra_character"
    }

    private lateinit var _binding: ActivityCharacterDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityCharacterDetailBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        val character = getCharacterFromIntent()

        if (character != null) {

            // Update view
            _binding.tvCharName.text = character.name

            // Instantiate vertical recycler view character skills
            val characterSkillAdapter = SkillInfoAdapter(character.skills)

            _binding.rvSkills.layoutManager = LinearLayoutManager(this)

            _binding.rvSkills.adapter = characterSkillAdapter

            // Instantiate horizontal view pager character info
            val characterStatsFragment = CharacterStatsFragment(character)
            val characterLoreFragment = CharacterLoreFragment(character.statistics, character.quotes)

            val characterInfoPages = listOf(
                CharacterInfoViewPagerAdapter.CharacterInfoPage("Status", characterStatsFragment),
                CharacterInfoViewPagerAdapter.CharacterInfoPage("Lore", characterLoreFragment)
            )

            _binding.vpCharInfo.adapter =
                CharacterInfoViewPagerAdapter(characterInfoPages, supportFragmentManager, lifecycle)

            // Setup tab layout for character info
            TabLayoutMediator(_binding.vpCharInfoTab, _binding.vpCharInfo) { tab, position ->
                tab.text = characterInfoPages[position].title
            }.attach()

            // Instantiate horizontal view pager character skins
            val characterSkinVPA = CharacterSkinInfoViewPagerAdapter(character.skins)

            _binding.vpCharSkin.adapter = characterSkinVPA

            // Setup tab layout for character skin
            TabLayoutMediator(_binding.vpCharTab, _binding.vpCharSkin) { tab, position ->
            }.attach()

            _binding.btnSwitchImage.setOnClickListener {
                characterSkinVPA.toggleArt(_binding.vpCharSkin.currentItem) // toggle show character skin illustration art
            }

            _binding.vpCharSkin.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    if (character.skins[position].artImageUrl != null) {
                        _binding.btnSwitchImage.visibility = View.VISIBLE
                    } else {
                        _binding.btnSwitchImage.visibility = View.GONE
                    }

                    characterStatsFragment.selectWeaponPage(position)
                }
            })
        }
    }

    private fun getCharacterFromIntent(): Character? {
        return if (Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra(EXTRA_CHARACTER, Character::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra(EXTRA_CHARACTER)
        }
    }
}