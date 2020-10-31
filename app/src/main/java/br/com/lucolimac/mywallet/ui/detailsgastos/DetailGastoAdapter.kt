package br.com.lucolimac.mywallet.ui.detailsgastos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.lucolimac.mywallet.R
import br.com.lucolimac.mywallet.domain.Gasto

class DetailGastoAdapter(private val listaEntrada: List<Gasto>) :
    RecyclerView.Adapter<DetailGastoAdapter.DetailGastoViewHolder>() {
    class DetailGastoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvDescricao: TextView = itemView.findViewById(R.id.tvDescricao)
        val tvCategoria: TextView = itemView.findViewById(R.id.tvCategoria)
        val tvDiaHora: TextView = itemView.findViewById(R.id.tvDiaHora)
        val tvValor: TextView = itemView.findViewById(R.id.tvValor)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DetailGastoAdapter.DetailGastoViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_gasto, parent, false)
        return DetailGastoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DetailGastoAdapter.DetailGastoViewHolder, position: Int) {
        val currentItem = listaEntrada[position]
        holder.tvDescricao.setText(currentItem.descricao)
        holder.tvCategoria.setText(currentItem.categoria)
        holder.tvDiaHora.setText(currentItem.dataHora)
        holder.tvValor.setText(currentItem.valor.toString())
    }

    override fun getItemCount(): Int {
        return listaEntrada.size
    }
}