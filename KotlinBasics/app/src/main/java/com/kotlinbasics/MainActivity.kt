package com.kotlinbasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kotlinbasics.ui.theme.KotlinBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinBasicsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        //week02Variable()
        //week02Functions()
        //week03Classes()

        week03Collections()
    }
}

private fun week03Classes(){
    Log.d("KotlinWeek03", "== Kotlin Classes ==")

    class Person(val name: String, var age: Int){
        fun introduce(){
            Log.d("KotlinWeek03", "Hi, I'm $name and age $age old")
        }
        fun birthday(){
            age++
            Log.d("KotlinWeek03", "$name is birthday  now $age old")
        }
    }
    val person1 = Person("kim", 32)
    person1.introduce()
    person1.birthday()

    class Animal(var species: String){
        var weight: Double = 0.0
        constructor(species: String, weight: Double) : this(species){
            this.weight = weight
            Log.d("KotlinWeek03", "$species at weight : now $weight kg"
        }
        fun makeSound(){
            Log.d("KotlinWeek03", "$species yell")
        }
    }
    val puppy = Animal("puppy", 6.5)
    puppy.makeSound()

    class Dog(species: String, weight: Double, var breed: String) : Animal(species, weight){
        override  fun makeSound(){
            Log.d("KotlinWeek03", "$breed ($species) is WakWak")
        }
    }
}


//private fun week03Collections(){
//    Log.d("KotlinWeek03", "== Kotlin Collections ==")
//
//    val fruits = listOf("apple", "banana", "orange")
//    //fruits.add("kiwi") //error
//    val mutableFuits = mutableListOf("kiwi", "watermelon")
//    mutableFuits.add("banana")
//    Log.d("KotlinWeek03", "Fruits : $fruits")
//    Log.d("KotlinWeek03", "Mutable Fruits : $mutableFuits")
//
//    val score = mapOf("Kim" to 97, "Park" to 100, "Lee" to 99)
//    Log.d("KotlinWeek03", "$score")
//
//    for(fruit in fruits){
//        Log.d("KotlinWeek03", "Fruit : $fruit")
//    }
//    for(fruit in mutableFuits){
//        Log.d("KotlinWeek03", "Mutable Fruit : $fruit")
//    }
//
//    score.forEach{(name, score) -> Log.d("KotlinWeek03", "$name score : $score")}
//}

fun week02Variable(){
//    println("Week02 Variable")
//
//    val courseName = "Mobile Programming"
//    //courseName = "IoT Programming"
//    var week = 1
//    week = 2
//
//    println("Course : $courseName")
//    println("Week : $week")
    println("== Kotlin Variable ==")

    val name: String = "Android"
    var version: Double = 8.1
    println("Hello $name $version")

    val age: Int = 23
    val height: Double = 200.0
    val inStudent: Boolean = false

    println("Age : $age, Height : $height, Student : $inStudent")
}

private fun week03Classes(){
    println("== kotlin Classes ==")

    class Student{
        var name: String = ""
        var age: Int = 0

        fun introduce(){
            println("Hi, I'm $name and I'm $age years old")
        }
    }
    val student = Student()
    student.name = "Chen"
    student.age = 23
    student.introduce()

    data class Person(val name: String, val age: Int)

    val person1 = Person("lee", 24)
    val person2 = Person("lee", 24)
    //val person2 = Person("kim", 22)

    println("Person1 : $person1")
    //println("Equal? : $person1 == $person2")
    println("Equal? : ${person1 == person2}")
}

fun week02Functions(){
    println("Week02 Functions")

//    fun greet(name: String) = "Hello, $name!"
//    println(greet("Android Developer"))

    println("== Kotlin Functions ==")

    fun greet(name: String): String {
        return "Hello, $name"
    }

    fun add(a: Int, b: Int) = a + b

    fun introduce(name: String, age: Int = 19){
        println("my name is $name and I'm $age years old")
    }

    println(greet("Kotlin"))
    println("Sum : ${add(5, 2)}")
    introduce("Park")
    introduce("Kim", 20)
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinBasicsTheme {
        Greeting("Android")
    }
}