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

fun Map<String, Int>.maxCategory(): String? {
    return this.maxByOrNull { it.value }?.key
}

