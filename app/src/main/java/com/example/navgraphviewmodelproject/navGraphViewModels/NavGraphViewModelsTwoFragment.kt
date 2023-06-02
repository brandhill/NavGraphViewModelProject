package com.example.navgraphviewmodelproject.navGraphViewModels

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.navGraphViewModels
import com.example.navgraphviewmodelproject.R
import com.example.navgraphviewmodelproject.activityViewModels.ActivityViewModel
import com.example.navgraphviewmodelproject.databinding.FragmentNavGraphViewModelsTwoBinding


class NavGraphViewModelsTwoFragment : Fragment(R.layout.fragment_nav_graph_view_models_two) {

    private lateinit var binding: FragmentNavGraphViewModelsTwoBinding
    private val navGraphViewModel by navGraphViewModels<NavGraphViewModel>(R.id.navigation_sub_navgraph) {
        defaultViewModelProviderFactory
    }

    private val activityVM by activityViewModels<ActivityViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentNavGraphViewModelsTwoBinding.bind(view)

        navGraphViewModel.sampleText.observe(viewLifecycleOwner) {
            binding.tvVm.text = it
        }

        activityVM.sampleText.observe(viewLifecycleOwner) {
            binding.tvActivityVm.text = it
        }

    }


}