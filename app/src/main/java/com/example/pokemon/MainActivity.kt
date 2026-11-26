package com.example.pokemon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pokemon.databinding.ActivityMainBinding
import com.example.pokemon.recyclerview.PokemonAdapter
import com.example.pokemon.recyclerview.PokemonSource

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    fun initRecyclerView() {
        // Usamos ViewBinding en lugar de findViewById, ya que el binding ya existe
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = PokemonAdapter(PokemonSource.pokemonList) { pokemon ->
            // Handle item click here (e.g., show a Toast or open a detail screen)
            // val name = pokemon.title
        }
    }
}
