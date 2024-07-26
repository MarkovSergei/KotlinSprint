package org.example.lesson21

fun main() {
    val skills = mapOf(
        "Сила" to 10,
        "Ловкость" to 15,
        "Выносливость" to 15
    )
    val maxSkill = skills.maxCategory()
    println("Максимальный опыт: $maxSkill")
}

fun <K, V : Comparable<V>> Map<K, V>.maxCategory(): K? {
    val entries = this.entries.toList()
    if (entries.isEmpty()) return null

    val maxEntry = entries.maxByOrNull { it.value } ?: return null
    return maxEntry.key
}