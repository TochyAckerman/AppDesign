package com.example.appdesign.Splash

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.appdesign.R

class SplashFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Handler().postDelayed({
            val action = SplashFragmentDirections.actionSplashFragmentToLoginCreateFragment()
            findNavController().navigate(action)
        } , 3000)
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }


}