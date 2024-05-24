package org.example.lesson11.less11_task4

fun main() {

}

class Category(
    val id: Int,
    val name: String,
    val description: String?,
) {

}

class Ingredients(
    val id: Int,
    val name: String,
    val category: String,
    val numbersOfPortion: Int,
    val inFavorites: Boolean,
    val ingredients: MutableList<IngredientsMutableList>
) {

}

class Recipe(
    val id: Int,
    val numberOfParagraph: Int,
    val recipe: List<String>,
) {

}

class IngredientsMutableList(
    val name: String,
    val numbers: Int,
)