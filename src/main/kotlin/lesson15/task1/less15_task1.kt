package org.example.lesson15.task1

fun main() {
    val carp = Carp()
    carp.swim()

    val seagull = Seagull()
    seagull.swim()
    seagull.fly()

    val duck = Duck()
    duck.swim()
    duck.fly()

}

class Carp : Swimable {
    override val name: String = "Carp"

    override fun swim() {
        println("$name плывет")
        println()
    }
}

class Seagull : Swimable, Flyable {
    override val name: String = "Seagull"
    override fun fly() {
        println("$name летит")
        println()
    }

    override fun swim() {
        println("$name плывет")
    }
}

class Duck : Swimable, Flyable {
    override val name: String = "Duck"

    override fun fly() {
        println("$name летит")
    }

    override fun swim() {
        println("$name плывет")
    }
}

