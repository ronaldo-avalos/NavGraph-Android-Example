package mx.vecinio.navexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import mx.vecinio.navexample.R

class IntroFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val root = inflater.inflate(R.layout.fragment_intro, container, false)


       root.findViewById<Button>(R.id.login).setOnClickListener {

           findNavController().navigate(R.id.action_introFragment_to_loginFragment)
       }
        root.findViewById<Button>(R.id.singup).setOnClickListener {

            findNavController().navigate(R.id.action_introFragment_to_singUpFragment)
        }

        return root
    }

}