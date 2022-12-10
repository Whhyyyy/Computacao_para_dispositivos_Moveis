package com.example.lfilmes.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lfilmes.databinding.ActivityFilmesBinding
import com.example.lfilmes.databinding.ItemFilmeBinding
import com.example.lfilmes.model.Filme

class AdapterFilme(private val context: Context, private val listaFilmes: MutableList<Filme>) :
    RecyclerView.Adapter<AdapterFilme.FilmeViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {
        val itemLista = ItemFilmeBinding.inflate(LayoutInflater.from(context),parent,false)
        return FilmeViewHolder(itemLista)
    }

    override fun onBindViewHolder(holder: FilmeViewHolder, position: Int) {
        holder.capaFilme.setImageResource(listaFilmes[position].capa!!)
        holder.tituloFilme.text = listaFilmes[position].titulo
        holder.itemView.setOnFocusChangeListener { v, b ->
            if(b){
                holder.itemSelecionavel.setBackgroundColor(Color.parseColor("#ffffff"))
            }else{
                holder.itemSelecionavel.setBackgroundColor(Color.parseColor("#000000"))
            }
        }




    }

    override fun getItemCount() = listaFilmes.size



    inner class FilmeViewHolder(binding: ItemFilmeBinding): RecyclerView.ViewHolder(binding.root) {
        val capaFilme = binding.capaFilme
        val tituloFilme = binding.tituloFilme
        val itemSelecionavel = binding.itemSelecionavel
    }


}