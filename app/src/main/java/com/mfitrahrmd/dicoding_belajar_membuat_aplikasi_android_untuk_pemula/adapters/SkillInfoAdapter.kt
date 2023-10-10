package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.R
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Skill
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.SkillBinding

class SkillInfoAdapter(private val _skills: List<Skill>) : RecyclerView.Adapter<SkillInfoAdapter.SkillViewHolder>() {
    class SkillViewHolder(val _binding: SkillBinding) : RecyclerView.ViewHolder(_binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkillViewHolder {
        val binding = SkillBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return SkillViewHolder(binding)
    }

    override fun getItemCount(): Int = _skills.size

    override fun onBindViewHolder(holder: SkillViewHolder, position: Int) {
        with(holder._binding) {
            with(_skills[position]) {
                tvSkillName.text = holder.itemView.context.getString(R.string.skill_name, (position + 1).toString(), name)
                tvSkillBasics.text = basicInfo
                tvSkillDetails.text = detailInfo
                Glide.with(holder.itemView.context).load(imageUrl).into(ivSkill)
            }
        }
    }
}