package com.example.pokemon.recyclerview// MyViewHolder.kt
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemon.databinding.ItemPokemonBinding

/**
 * ViewHolder responsable d'una fila del RecyclerView.
 * Encapsula la vista de la fila i sap com "pintar-hi" un Pokemon.
 */
class PokemonViewHolder(
    itemView: View,
    private val onItemClick: (Pokemon) -> Unit
) : RecyclerView.ViewHolder(itemView) {
    val binding = ItemPokemonBinding.bind(itemView)

    /**
     * Actualitza les vistes de la fila amb les dades de Pokemon
     * i configura els listeners d'esdeveniments.
     */
    fun bind(item: Pokemon) {
        binding.title.text = item.title
        // Ahora también mostramos el subtítulo (antes no se usaba)
        binding.subtitle.text = item.subtitle
        binding.type.text = item.type
        binding.text.text = item.text
        binding.photo.setImageResource(item.photo)

        // Exemple de gestió de clic sobre tota la fila
        itemView.setOnClickListener {
            onItemClick(item)
        }
    }
}