package com.example.lfilmes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.GridLayoutManager
import com.example.lfilmes.adapter.AdapterFilme
import com.example.lfilmes.databinding.ActivityFilmesBinding
import com.example.lfilmes.model.Filme


class Filmes : AppCompatActivity() {

    private lateinit var binding: ActivityFilmesBinding
    private lateinit var adapterFilme: AdapterFilme
    private val filmes: MutableList<Filme> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilmesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val recyclerViewFilmes = binding.recyclerViewFilmes
        recyclerViewFilmes.layoutManager = GridLayoutManager(this,3)
        recyclerViewFilmes.setHasFixedSize(true)
        adapterFilme = AdapterFilme(this,filmes)
        recyclerViewFilmes.adapter = adapterFilme
        getFilmes()
    }

    private fun getFilmes(){
        val filme1 = Filme(R.drawable.filme1,"Thor Amor e Trovão")
        filmes.add(filme1)

        val filme2 = Filme(R.drawable.filme3,"Coringa")
        filmes.add(filme2)

        val filme3 = Filme(R.drawable.filme5,"Homem Aranha Sem Volta Pra Casa")
        filmes.add(filme3)

        val filme4 = Filme(R.drawable.encanto,"Encanto")
        filmes.add(filme4)

        val filme5 = Filme(R.drawable.dotorestranho,"Doutor Estranho")
        filmes.add(filme5)

        val filme6 = Filme(R.drawable.adaonegro,"Adão Negro")
        filmes.add(filme6)

        val filme7 = Filme(R.drawable.matrix,"Matrix")
        filmes.add(filme7)

        val filme8 = Filme(R.drawable.malevola,"Malevola")
        filmes.add(filme8)


    }

}