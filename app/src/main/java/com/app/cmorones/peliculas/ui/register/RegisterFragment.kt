package com.app.cmorones.peliculas.ui.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.app.cmorones.peliculas.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {

    private lateinit var binding: FragmentRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding)
        {
            btnRegister.setOnClickListener {
                if( validaForm() ){
                    Toast.makeText(context,"¡All fields are correct!",Toast.LENGTH_SHORT).show()
                }
                else {
                    Toast.makeText(context,"¡Error to validate the form!",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }


    private fun validaForm() : Boolean {
        if( validateName() && validateEmail() && validatePassword() ) return true
        else return false
    }

    private fun validateName() : Boolean {
        if(binding.name.text.toString() != "" ) return true
        else {
            binding.name.error = "The name not be empty"
            binding.name.requestFocus()
            return false
        }
    }

    private fun validatePassword(): Boolean {
        val passwordPattern = "^(?=.*[0-9])(?=.*[a-z]).{6}\$"
        if( binding.password.text.toString().matches(passwordPattern.toRegex())) return true
        else {
            binding.password.error = "The password must be 6 characters, at least one letter and one number"
            binding.password.requestFocus()
            return false
        }
        /*
        Password Pattern
        ^                 # start-of-string
        (?=.*[0-9])       # a digit must occur at least once
        (?=.*[a-z])       # a lower case letter must occur at least once
        .{6}             # anything, at least six characters
        $                 # end-of-string

         */
    }

    private fun validateEmail(): Boolean {
        //Paso 0. Reg Pattern
        val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"

        //Paso 1. Compares Pattern with input
        if ( binding.email.text.toString().matches(emailPattern.toRegex()) ) return true
        else {
            binding.email.error = "Not valid email"
            binding.email.requestFocus()
            return false
        }
    }
}