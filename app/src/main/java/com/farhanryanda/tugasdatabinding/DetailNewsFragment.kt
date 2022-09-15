package com.farhanryanda.tugasdatabinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.farhanryanda.tugasdatabinding.data.News
import com.farhanryanda.tugasdatabinding.databinding.FragmentDetailNewsBinding

class DetailNewsFragment : Fragment() {
    private var _binding: FragmentDetailNewsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailNewsBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val getData = arguments?.getSerializable("news") as News
        binding.imgPoster.setImageResource(getData.img)
        binding.tvJudul.text = getData.judul
        binding.tvTanggal.text = getData.tanggal
        binding.tvJurnalis.text = getData.jurnalis
        binding.tvDesc.text = getData.descNews
    }
}