package org.example.lesson18

fun main() {
    val new = Order()
    new.newOrder(1,"Хлеб")
    new.newOrder(2, listOf("Молоко", "Сыр", "Творог"))

}

class Order {

    fun newOrder(
        orderId: Int,
        product: String,
    ){
        println("Заказ № $orderId. Заказан товар: $product")
    }

    fun newOrder(
        orderId: Int,
        product: List<String>,
    ){
        println("Заказ № $orderId. Заказаны следующие товары: $product")
    }
}
