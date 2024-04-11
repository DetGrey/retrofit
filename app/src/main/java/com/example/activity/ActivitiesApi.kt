package com.example.activity

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ActivitiesApi {

    /* Exercise A
    Without using the android framework (empty project - as seen in the reference project)

    Create an API interface, Model / DTO and retrofit instance such that:

    You can fetch a single random event and print its properties to the console
     */
    @GET("activity")
    suspend fun getActivity(): Activity

    /* Exercise B
    Without using the android framework (empty project - as seen in the reference project)

    Expand the project with another API call with parameters

    The program takes a number of participants as parameter and returns a random activity with a given number of participants

    The user inputs the parameters by standard input: readLine()
     */
    @GET("activity")
    suspend fun getParticipants(
        @Query("participants") participants: Int
    ): Activity


    /* Exercise C
    The program takes a specified accessibility in an inclusively constrained range of price (min / max price)

    The user inputs the parameters by standard input: readLine()

    Implement with a call instead of returning the Activity object

    If the response is successful print the activity

    If the response if not successful print "failure"
     */

    @GET("activity")
    suspend fun getAccessibility(
        @Query("accessibility") accessibility: Double,
        @Query("minprice") minPrice: Double,
        @Query("maxprice") maxPrice: Double,
    ): Activity
}