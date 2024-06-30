package org.example.lesson15

fun main() {

    val instruments = listOf(
        Instrument("Гитара", 10),
        Instrument("Барабаны", 5),
        Instrument("Фортепиано", 2)
    )
    val accessories = listOf(
        Accessory("Медиаторы", 100),
        Accessory("Барабанные палочки", 50),
        Accessory("Струны", 20)
    )
    val instrumentSearcher = InstrumentSearcher(instruments)
    val accessorySearcher = AccessorySearcher(accessories)

    instrumentSearcher.search("гитара")
    accessorySearcher.search("медиаторы")

}

interface MusicStore {
    val name: String
    val quantityInStock: Int
}

class Instrument(
    override val name: String,
    override val quantityInStock: Int
) : MusicStore

class Accessory(
    override val name: String,
    override val quantityInStock: Int
) : MusicStore

interface Searcable {
    fun search(query: String): List<MusicStore>
}

class InstrumentSearcher(private val instruments: List<Instrument>) : Searcable {
    override fun search(query: String): List<MusicStore> {
        println("Выполняется поиск...")
        return instruments.filter {
            it.name.contains(query)
        }
    }
}

class AccessorySearcher(private val accessories: List<Accessory>) : Searcable {
    override fun search(query: String): List<MusicStore> {
        println("Выполняется поиск...")
        return accessories.filter {
            it.name.contains(query)
        }
    }
}