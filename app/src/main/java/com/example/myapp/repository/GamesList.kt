package com.example.myapp.repository

import com.example.myapp.model.Game

fun getAllGames(): List<Game> {
    return listOf(
        Game(id = 1, title = "Getting Started Guide\n" +
                "Elden Ring", studio = "Tips", releaseYear = "Easy"),
        Game(
            id = 2, title = "Any% Speedrun Route\n" +
                    "Hollow Knigh", studio = "Speedrun", releaseYear = "Expert"
        ),
        Game(
            id = 3, title = "Advanced Combat Techniques\n" +
                    "Devil May Cry 5", studio = "Combat", releaseYear = "Hard"
        ),
        Game(
            id = 4, title = "Malenia Boss Strategy\n" +
                    "Elden Ring", studio = "Boss Fights", releaseYear = "Expert"
        ),
        Game(
            id = 5, title = "Meta Mage Build\n" +
                    "Diablo 4", studio = "Character Builds", releaseYear = "Medium"
        ),
        Game(
            id = 6, title = "Hidden Ending Requirements\n" +
                    "Baldur's Gate 3", studio = "Secrets", releaseYear = "Hard"
        ),
        Game(
            id = 7, title = "100% Completion Guide\n" +
                    "God of War Ragnarök", studio = "Achievements", releaseYear = "Medium"
        ),
        Game(
            id = 8, title = "PvP Meta Strategies\n" +
                    "Street Fighter 6", studio = "Multiplayer", releaseYear = "Hard"
        ),
        Game(
            id = 9, title = "Efficient Resource Guide\n" +
                    "Stardew Valley", studio = "Farming", releaseYear = "Easy"
        ),
        Game(
            id = 10, title = "Hidden Mario Reference\n" +
                    "The Legend of Zelda: TOTK", studio = "Easter Egg", releaseYear = "Medium"
        )
    )
}

fun getGamesByStudio(studio: String): List<Game> {
    return getAllGames().filter {
        it.studio.startsWith(prefix = studio, ignoreCase = true)
    }
}