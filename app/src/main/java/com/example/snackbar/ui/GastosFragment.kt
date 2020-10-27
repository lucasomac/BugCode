package com.example.snackbar.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doOnTextChanged
import com.example.snackbar.R
import com.example.snackbar.domain.CadastrarGastos
import kotlinx.android.synthetic.main.fragment_gasto.view.*
import java.sql.Date
import java.text.NumberFormat
import java.util.*

class GastosFragment : Fragment() {
    private var current: String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_gasto, container, false)
        view.cadastrarButton.setOnClickListener {
            var date = Date(view.datahoratext.text.toString())
            var valor =  view.valorText.text.toString()

            val gastos = CadastrarGastos(view.descricaoText.text.toString(),view.categoriaText.text.toString()
            , date, valor)
        }

        view.valorText.doOnTextChanged { s,
            start,
            before,
            count
            ->
                if (s.toString() != current) {

                    val cleanString: String = s!!.replace("""[R$,.]""".toRegex(), "")
                    val parsed = cleanString.toDouble()
                    val formatted = NumberFormat.getCurrencyInstance().format((parsed / 100))

                    current = formatted
                    view.valorText.setText(formatted)
                    view.valorText.setSelection(formatted.length)

                }
            }

        return view
    }

    companion object{
        fun newInstance() = GastosFragment()
    }
}