package br.com.lucolimac.mywallet.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import br.com.lucolimac.mywallet.R
import kotlinx.android.synthetic.main.fragment_profile.view.*

class FragmentProfile : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_profile, container, false)
        view.btnAjuda.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentProfile3_to_fragmentAjuda2)
        }
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() = GastosFragment()
    }

}