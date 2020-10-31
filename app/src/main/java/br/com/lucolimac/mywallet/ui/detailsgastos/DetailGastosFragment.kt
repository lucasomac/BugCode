package br.com.lucolimac.mywallet.ui.detailsgastos

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.lucolimac.mywallet.R
import br.com.lucolimac.mywallet.domain.Gasto
import kotlinx.android.synthetic.main.fragment_detail_gastos.view.*

class DetailGastosFragment : Fragment() {

    private var msg = 1
    private val listaGastos = getListaGasto()
    private val adapter = DetailGastoAdapter(listaGastos)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_detail_gastos, container, false)
//        view.tvTitleDetailGastos.text = msg.toString()
        view.rcListaGastos.adapter = adapter
        view.rcListaGastos.layoutManager = LinearLayoutManager(context)
        view.rcListaGastos.setHasFixedSize(true)
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        arguments?.getInt("key")?.let {
            msg = it
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(msg: Int) = DetailGastosFragment().apply {
            arguments = Bundle().apply {
                putInt("key", msg)
            }
        }
    }

    fun getListaGasto(): ArrayList<Gasto> {
        val gasto01 = Gasto("Perdi", "Perda", "23/08/1994", 41.56)
        val gasto02 = Gasto("Chocolate", "Alimento", "23/08/1994", 73.56)
        val gasto03 = Gasto("Mel", "Alimento", "23/08/1994", 214.56)
        val gasto04 = Gasto("Tênis", "Calçado", "23/08/1994", 7864.56)
        val gasto05 = Gasto("Calça", "Vestuário", "23/08/1994", 786.56)
        val gasto06 = Gasto("Cinema", "Lazer", "23/08/1994", 78.56)
        val lista = arrayListOf(gasto01, gasto02, gasto03, gasto04, gasto05, gasto06)
        return lista
    }
}