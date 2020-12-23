package com.example.appdesign.login_create

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.appdesign.R
import com.example.appdesign.Splash.SplashFragmentDirections


class LoginCreateFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.login_create_fragment, container, false)
        val button1 = view.findViewById<Button>(R.id.login_button)
        val button2 = view.findViewById<Button>(R.id.createButton)

        button1.setOnClickListener{
            val action = LoginCreateFragmentDirections.actionLoginCreateFragmentToLoginFragment()
            findNavController().navigate(action)
        }

        button2.setOnClickListener{
            val action = LoginCreateFragmentDirections.actionLoginCreateFragmentToSignUpFragment()
            findNavController().navigate(action)
        }
        return view
    }

}