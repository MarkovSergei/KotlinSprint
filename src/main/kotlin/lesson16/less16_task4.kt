package org.example.lesson16

fun main() {
    val newOrder = Order()
    newOrder.changeStatus(managerSend("Получен"))
}

fun managerSend(changeStatusOrder: String): String {
    return changeStatusOrder
}

class Order {
    private val idOrder = 431
    private var orderStatus = "отправлен"

    fun changeStatus(orderStatusNew: String) {
        orderStatus = orderStatusNew
        println("Новый статус заказа № $idOrder: $orderStatus")
    }
}