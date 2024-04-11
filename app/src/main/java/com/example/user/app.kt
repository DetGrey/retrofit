package com.example.user

import com.example.activity.RetrofitInstanceBoredApi
import kotlinx.coroutines.runBlocking
import retrofit2.awaitResponse

fun main() {
    runBlocking {
        val instance = RetrofitInstanceUsers()
        /*
        Read the documentation to the following API POST CREATE request: https://reqres.in/

        Register - Successful
        Register - Unsuccessful
        Login - Successful
        Login - Unsuccessful
         */
        println("Register")
        println("Enter your email")
        val email = readlnOrNull()

        println("Enter your password")
        val password = readlnOrNull()
        val register = instance.apiService.register(User(email, password)).awaitResponse()
        println(register.body()?.string())

        val email2 = "eve.holt@reqres.in"
        val pass2 = "cityslicka"
        val login = instance.apiService

    }
}