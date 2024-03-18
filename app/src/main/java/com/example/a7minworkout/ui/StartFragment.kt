package com.example.a7minworkout.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a7minworkout.R
import com.example.a7minworkout.common.BaseFragment
import com.example.a7minworkout.databinding.FragmentStartBinding


class StartFragment : BaseFragment<FragmentStartBinding>(
    onInflate = FragmentStartBinding ::inflate
) {
private val a=27

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }




}