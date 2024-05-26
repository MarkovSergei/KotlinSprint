package org.example.lesson11.less11_task4

fun main() {

}

class Category(
    val id: Int,
    val name: String,
    val imageUrl: String? = null,
    val description: String?,
    val recipesList: List<String>
)

class Ingredients(
    val id: Int,
    val name: String,
    val category: String,
    val numbersOfPortion: Int,
    val inFavorites: Boolean,
)

class Recipe(
    val id: Int,
    val numberOfParagraph: Int,
    val imageUrl: String? = null,
    val recipe: List<String>,
    val ingredients: MutableList<String>,
)
