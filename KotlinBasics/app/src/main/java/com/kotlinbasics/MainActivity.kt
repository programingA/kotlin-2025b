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
        week02Variable()
        week02Functions()
    }
}

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