package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.R
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.CharacterLoreBinding

class CharacterLoreFragment(
    private val _statistics: String,
    private val _quotes: List<String>
) : Fragment() {
    private lateinit var _binding: CharacterLoreBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = CharacterLoreBinding.inflate(inflater, container, false)

        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(_binding) {
            val arrAdapter = ArrayAdapter<String>(view.context, R.layout.quote, R.id.tv_quote, _quotes)
            tvStatistics.text = _statistics
            lvQuotes.adapter = arrAdapter
        }
    }
}