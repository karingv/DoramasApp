package com.karin.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.karin.navigationcomponent.adapter.DoramasAdapter
import com.karin.navigationcomponent.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFirstBinding.inflate(layoutInflater)

        val btnEnviar = binding.btnEnviar
        btnEnviar.setOnClickListener {
            findNavController().navigate(
                FirstFragmentDirections.actionFirstFragmentToSecondFragment(
                    text =
                    "HOLAS"
                )
            )
        }


        binding.rvDoramas.layoutManager = GridLayoutManager(context, 2)
        binding.rvDoramas.adapter = DoramasAdapter(DoramasProvider.doramasModelLists)

        return binding.root

    }


}