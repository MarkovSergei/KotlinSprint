package org.example.lesson19

enum class Category {
    CLOTHES,
    STATIONERY,
    OTHER,
}
fun getCategoryName(category: Category): String {
    return when (category) {
        Category.CLOTHES -> "Одежда"
        Category.STATIONERY -> "канцелярские товары"
        Category.OTHER -> "разное"
    }
}

class Product(
    val name: String,
    private val id: Int,
    private val category: Category
) {
    fun info() {
        println("$name ($id) - ${getCategoryName(category)}")
    }
}

fun main() {
    val product1 = Product("Футболка", 1, Category.CLOTHES)
    val product2 = Product("Ручка", 2, Category.STATIONERY)
    val product3 = Product("Книга", 3, Category.STATIONERY)
    val product4 = Product("Игрушка", 4, Category.OTHER)

    product1.info()
    product2.info()
    product3.info()
    product4.info()
}