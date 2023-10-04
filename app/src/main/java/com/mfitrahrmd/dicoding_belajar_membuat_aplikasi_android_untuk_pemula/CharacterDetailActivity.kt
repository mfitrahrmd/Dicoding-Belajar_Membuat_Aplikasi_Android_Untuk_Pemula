package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.adapters.CharacterInfoViewPagerAdapter
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.adapters.CharacterSkinInfoViewPagerAdapter
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Skin
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.ActivityCharacterDetailBinding

class CharacterDetailActivity : AppCompatActivity() {
    private lateinit var _binding: ActivityCharacterDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityCharacterDetailBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        // Instantiate Horizontal View Pager Character Info

        val characterStatsFragment = CharacterStatsFragment()

        val characterInfoPages = arrayOf(
            CharacterInfoViewPagerAdapter.CharacterInfoPage("Stats", characterStatsFragment)
        )

        _binding.vpCharInfo.adapter =
            CharacterInfoViewPagerAdapter(characterInfoPages, supportFragmentManager, lifecycle)

        // Setup tab layout for character info
        TabLayoutMediator(_binding.vpCharInfoTab, _binding.vpCharInfo) { tab, position ->
            tab.text = characterInfoPages[position].title
        }.attach()

        // Instantiate horizontal view pager character skins

        val characterSkins = arrayOf(
            Skin("Holy White", R.drawable.priestess_0, null),
            Skin("Boyi the Valor", R.drawable.priestess_7, null),
            Skin("Virgo", R.drawable.priestess_17, R.drawable.priestess_art_17),
        )

        val characterSkinVPA = CharacterSkinInfoViewPagerAdapter(characterSkins)

        _binding.vpCharSkin.adapter = characterSkinVPA

        // Also slide weapon view pager whenever skin view pager is slided
        _binding.vpCharSkin.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                characterStatsFragment.setWeaponViewPagerPosition(position) // slide weapon view pager
            }
        })
    }
}