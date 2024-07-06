package org.example.lesson18

fun main() {
    val animals: List<Animal> = listOf(Fox("Лиса"), Dog("Собака"), Cat("Кошка"))

    for (animal in animals) {
        animal.eat()
        animal.sleep()
    }
}

open class Animal(val name: String) {
    open fun eat() {}
    fun sleep() {
        println("[$name] -> [спит]")
    }
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("[$name] -> [ест ягоды]")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("[$name] -> [грызет кости]")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("[$name] -> [ест рыбу]")
    }
}

