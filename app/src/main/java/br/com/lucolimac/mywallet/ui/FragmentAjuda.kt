package br.com.lucolimac.mywallet.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.lucolimac.mywallet.R

class FragmentAjuda : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ajuda, container, false)
    }


    companion object {
        @JvmStatic
        fun newInstance() = GastosFragment()
    }
}