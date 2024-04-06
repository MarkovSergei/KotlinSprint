package org.example.lesson3

fun main() {
    var whereFrom = "E2"
    var where = "E4"
    var strokeNumber = 1
    println("$whereFrom-$where;$strokeNumber")

    whereFrom = "D2"
    where = "D3"
    strokeNumber ++
    println("$whereFrom-$where;$strokeNumber")
}