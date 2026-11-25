package com.example.pokemon.recyclerview
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemon.R

/**
 * Adapter que crea ViewHolder (MyViewHolder),
 * indica quants elements hi ha i demana que es "pintin" amb bind().
 */
class PokemonAdapter(
    private val items: List<Pokemon>,
    private val onItemClick: (Pokemon) -> Unit
) : RecyclerView.Adapter<PokemonViewHolder>() {

    /**
     * Crea (infla) la vista de la fila i construeix el ViewHolder.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_pokemon, parent, false)
        return PokemonViewHolder(view, onItemClick)
    }

    /**
     * Retorna quants elements hi ha a la llista de dades.
     */
    override fun getItemCount(): Int = items.size

    /**
     * Demana al ViewHolder que mostri les dades de la posició donada.
     */
    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }
}