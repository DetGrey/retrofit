package com.example.activity

import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val instance = RetrofitInstanceBoredApi()

//        val activity = instance.apiService.getActivity()
//        println(activity)
//        println()
//
//        print("How many participants are coming to the activity? ")
//        val participantResponse = readln().toInt()
//        val participants = instance.apiService.getParticipants(participantResponse)
//        println(participants)
//        println()
//
//        // The program takes a specified accessibility in an inclusively constrained range of price (min / max price)
//        println("Please specify accessibility between 0.0 and 1.0:")
//        val accessibility = readln().toDouble()
//        println("Please specify minimum price between 0.0 and 1.0:")
//        val minPrice = readln().toDouble()
//        println("Please specify maximum price between 0.0 and 1.0:")
//        val maxPrice = readln().toDouble()
//
//        val getAccessibility = instance.apiService.getAccessibility(accessibility, minPrice, maxPrice)
//
//        if (getAccessibility.activity == null) {
//            println("Failure: No activity found")
//        }
//        else {
//            println(getAccessibility)
//        }

    }
}