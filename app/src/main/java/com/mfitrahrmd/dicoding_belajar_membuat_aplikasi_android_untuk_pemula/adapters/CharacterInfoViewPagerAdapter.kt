package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.adapter.FragmentViewHolder

class CharacterInfoViewPagerAdapter(
    private val _pages: List<CharacterInfoPage>,
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = _pages.size

    override fun createFragment(position: Int): Fragment {
        return _pages[position].fragment
    }

    override fun onBindViewHolder(
        holder: FragmentViewHolder,
        position: Int,
        payloads: MutableList<Any>
    ) {
        super.onBindViewHolder(holder, position, payloads)
    }

    data class CharacterInfoPage(
        val title: String, // title used by tab layout
        val fragment: Fragment
    )
}
