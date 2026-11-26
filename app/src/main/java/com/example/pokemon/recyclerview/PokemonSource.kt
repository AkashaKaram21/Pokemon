package com.example.pokemon.recyclerview

import com.example.pokemon.R

class PokemonSource {
    companion object {
        val pokemonList = listOf(
            Pokemon(
                title = "Meowth",
                subtitle = "Pokémon Gato Araña",
                photo = R.mipmap.meowth, // Antes meowth_round: usamos la misma versión que el resto
                type = "Normal",
                text = "Le encantan las cosas redondas y brillantes, sobre todo las monedas. Duerme durante el día y por la noche sale a buscar objetos que brillen para llevárselos."
            ),
            Pokemon(
                title = "Bulbasaur",
                subtitle = "Pokémon Semilla",
                photo = R.mipmap.bulbasur,
                type = "Grass",
                text = "Lleva una semilla en el lomo desde que nace. La semilla crece poco a poco absorbiendo la luz del sol, y Bulbasaur puede pasar días sin comer gracias a la energía que almacena en ella."
            ),
            Pokemon(
                title = "Charmander",
                subtitle = "Pokémon Lagartija",
                photo = R.mipmap.charmander,
                type = "Fire",
                text = "La llama de la punta de su cola indica su estado de salud y su humor. Si está contento, la llama arde con fuerza; si se apaga, el Pokémon podría morir."
            ),
            Pokemon(
                title = "Squirtle",
                subtitle = "Pokémon Tortuguita",
                photo = R.mipmap.squirtle,
                type = "Water",
                text = "Su caparazón le protege de los ataques y le ayuda a nadar rápido. Cuando se siente amenazado, se esconde dentro y dispara chorros de agua a presión por la boca."
            ),
            Pokemon(
                title = "Pikachu",
                subtitle = "Pokémon Ratón",
                photo = R.mipmap.pikachu,
                type = "Electric",
                text = "Almacena electricidad en las bolsas de sus mejillas. Cuando se enfada o se siente en peligro, libera descargas eléctricas capaces de dejar fuera de combate a sus rivales."
            ),
            Pokemon(
                title = "Eevee",
                subtitle = "Pokémon Evolución",
                photo = R.mipmap.eeve,
                type = "Normal",
                text = "Tiene un código genético inestable que le permite evolucionar de muchas formas distintas según el entorno o las piedras evolutivas que se le apliquen."
            ),
            Pokemon(
                title = "Jigglypuff",
                subtitle = "Pokémon Globo",
                photo = R.mipmap.jigglypuff,
                type = "Fairy",
                text = "Canta una melodía relajante que duerme a quien la escucha. Se enfada mucho si alguien se duerme antes de que termine su canción."
            ),
            Pokemon(
                title = "Gengar",
                subtitle = "Pokémon Sombra",
                photo = R.mipmap.gengar,
                type = "Ghost",
                text = "Se esconde en las sombras y le gusta asustar a las personas. Se dice que la temperatura baja de golpe cuando un Gengar está cerca."
            ),
            Pokemon(
                title = "Snorlax",
                subtitle = "Pokémon Dormir",
                photo = R.mipmap.snorlax,
                type = "Normal",
                text = "Se pasa el día comiendo y durmiendo. Puede comer cientos de kilos de comida al día y, cuando duerme, es tan grande que puede bloquear caminos enteros."
            ),
            Pokemon(
                title = "Gyarados",
                subtitle = "Pokémon Atrocidad",
                photo = R.mipmap.gyardo,
                type = "Water",
                text = "Evoluciona a partir de Magikarp, uno de los Pokémon más débiles. Es extremadamente agresivo y, cuando se enfurece, puede destruir ciudades enteras."
            )
        )
    }
}