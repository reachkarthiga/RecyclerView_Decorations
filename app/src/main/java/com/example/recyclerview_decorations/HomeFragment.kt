package com.example.recyclerview_decorations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.recyclerview_decorations.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentHomeBinding.inflate(layoutInflater, container, false)

        binding.verticalButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_vertical_Fragment)
        }

        binding.horizontalButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_horizontal_Fragment)
        }

        return binding.root

    }

}