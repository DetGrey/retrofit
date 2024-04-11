package com.example.user

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface UsersApi {
    /* POST Exercise A
    Create an API interface, Model / DTO and retrofit instance such that:

    You can POST an email and password and receive a response for registration

        If successful: Print the response to the console
        If unsuccessful: Print the response to the console

    Create an API interface, Model / DTO and retrofit instance such that:

    You can POST an email and password and receive a response for login

        If successful: Print the response to the console
        If unsuccessful: Print the response to the console

    Reference: https://github.com/nicklasdean/retrofit-basic/tree/main/app/src/main/java/com/example/reqresPOSTexample
     */

    @Headers("Content-Type: application/json")
    @POST("usekhvr")
    fun register(@Body userData: User): Call<ResponseBody>
}