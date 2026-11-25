package com.example.pokemon.recyclerview// MyViewHolder.kt
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemon.R

/**
 * ViewHolder responsable d'una fila del RecyclerView.
 * Encapsula la vista de la fila i sap com "pintar-hi" un Pokemon.
 */
class PokemonViewHolder(
    itemView: View,
    private val onItemClick: (Pokemon) -> Unit
) : RecyclerView.ViewHolder(itemView) {

    val photo = itemView.findViewById<ImageView>(R.id.photo)
    val title = itemView.findViewById<TextView>(R.id.title)
    val type = itemView.findViewById<TextView>(R.id.type)
    val text = itemView.findViewById<TextView>(R.id.text)


    /**
     * Actualitza les vistes de la fila amb les dades de Pokemon
     * i configura els listeners d'esdeveniments.
     */
    fun bind(item: Pokemon) {
        title.text = item.title
        type.text = item.type
        text.text = item.text

        // Exemple de gestió de clic sobre tota la fila
        itemView.setOnClickListener {
            onItemClick(item)
        }
    }
}