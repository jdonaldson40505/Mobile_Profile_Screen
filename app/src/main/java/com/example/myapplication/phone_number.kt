package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.NameBinding
import com.example.myapplication.databinding.PhoneNumberBinding
import android.widget.EditText
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels

class phone_number: Fragment() {
    private var _binding: PhoneNumberBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val data: Storage by viewModels()




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = PhoneNumberBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.update.setOnClickListener {

            val text = binding.editTextPhone
            data.setPhone(text.text.toString())
            findNavController().navigate(R.id.to_profile)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}