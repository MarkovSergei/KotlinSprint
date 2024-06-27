package org.example.lesson16

fun main() {
    val newOrder = Order()
    newOrder.managerSend("получен")
}

class Order {
    private val idOrder = 431
    private var orderStatus = "отправлен"

    fun managerSend(changeStatusOrder: String) {
        changeStatus(changeStatusOrder)
    }

    private fun changeStatus(orderStatusNew: String) {
        orderStatus = orderStatusNew
        println("Новый статус заказа № $idOrder: $orderStatus")
    }
}