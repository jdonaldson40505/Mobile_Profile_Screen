package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.ProfileBinding


import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel


class profile: Fragment() {
    private var _binding: ProfileBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val stringViewModel: Storage by activityViewModels()





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ProfileBinding.inflate(inflater, container, false)
        val phone = binding.phoneNumber
        stringViewModel.currentPhone.observe(viewLifecycleOwner,{
            phone.text = it.toString()
        })
        val email = binding.email
        stringViewModel.currentEmail.observe(viewLifecycleOwner,{
            email.text = it.toString()
        })
        val name = binding.name
        stringViewModel.currentName.observe(viewLifecycleOwner,{
            name.text = it.toString()
        })
        val desc = binding.description
        stringViewModel.currentDescription.observe(viewLifecycleOwner,{
            desc.text = it.toString()
        })

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


