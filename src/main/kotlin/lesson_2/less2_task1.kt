package org.example.lesson_2

fun main(){
    val allStudent = 4f
    val student1Assessment = 3
    val student2Assessment = 4
    val student3Assessment = 3
    val student4Assessment = 5

    val middleAssessment: Float = (
            student1Assessment.toFloat() +
                    student2Assessment.toFloat() +
                    student3Assessment.toFloat() +
                    student4Assessment.toFloat())/allStudent

    print(middleAssessment)

}