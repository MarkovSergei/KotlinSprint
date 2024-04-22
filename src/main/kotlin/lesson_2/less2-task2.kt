package org.example.lesson_2

fun main(){
    val workers = 50
    val workerSalary = 30000
    val workersExpenses = workers * workerSalary

    val trainees = 30
    val traineesSalary = 20000
    val traineesExpenses = trainees * traineesSalary

    val workersAndTrainneesExpenses = workersExpenses + traineesExpenses
    val workersAndTrainees = workers + trainees

    val middleSalaryAll = (workersExpenses + workersExpenses) / workersAndTrainees

    println(workersExpenses)
    println(workersAndTrainneesExpenses)
    println(middleSalaryAll)

}

