package org.example.lesson19

enum class AmmoType(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank {
    private var currentAmmo: AmmoType? = null

    fun loadAmmo(ammo: AmmoType) {
        currentAmmo = ammo
    }

    fun fire() {
        if (currentAmmo != null) {
            println("Выстрел: $currentAmmo, урон: ${currentAmmo?.damage}")
        } else {
            println("Танк не заряжен")
        }
    }
}

fun main() {
    val tank = Tank()

    tank.loadAmmo(AmmoType.BLUE)
    tank.fire()

    tank.loadAmmo(AmmoType.GREEN)
    tank.fire()

    tank.loadAmmo(AmmoType.RED)
    tank.fire()
}