package org.example.lesson14

abstract class CelestialBody {
    abstract val name: String
    abstract val atmosphere: Boolean
    abstract val isLandAble: Boolean
}

class Planet(
    override val name: String,
    override val atmosphere: Boolean,
    override val isLandAble: Boolean,
) : CelestialBody() {
    val satellites = mutableListOf<CelestialBody>()
}

class Satellite(
    override val name: String,
    override val atmosphere: Boolean,
    override val isLandAble: Boolean,
) : CelestialBody()

fun main() {
    val earth = Planet(name = "Земля", atmosphere = true, isLandAble = true)
    earth.satellites.add(Satellite(name = "Спутник1", atmosphere = false, isLandAble = true))
    earth.satellites.add(Satellite(name = "Спутник2",atmosphere = false, isLandAble = false))
    println("Спутники планеты ${earth.name}: ${earth.satellites.joinToString { it.name }}.")
}