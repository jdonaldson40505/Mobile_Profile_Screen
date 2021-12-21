package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.ProfileBinding


import android.widget.TextView




class profile: Fragment() {
    private var _binding: ProfileBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = ProfileBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.name.setOnClickListener {
            findNavController().navigate(R.id.to_name)
        }
        binding.phoneNumber.setOnClickListener{
            findNavController().navigate(R.id.to_Phone)
        }
        binding.email.setOnClickListener{
            findNavController().navigate(R.id.to_Email)
        }
        binding.description.setOnClickListener {
            findNavController().navigate(R.id.to_Description)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}