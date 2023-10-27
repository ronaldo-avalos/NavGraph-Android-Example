package mx.vecinio.navexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class SingUpFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         val root  = inflater.inflate(R.layout.fragment_singup, container, false)

        root.findViewById<Button>(R.id.singuptointro).setOnClickListener{
            findNavController().popBackStack()
        }
        return root
    }

}