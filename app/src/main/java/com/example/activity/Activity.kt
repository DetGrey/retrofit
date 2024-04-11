package com.example.activity

import com.google.gson.annotations.SerializedName

data class Activity(
    @SerializedName("activity")
    val activity: String?,
    @SerializedName("accessibility")
    val accessibility: Double,
    @SerializedName("type")
    val type: String,
    @SerializedName("participants")
    val participants: Int,
    @SerializedName("price")
    val price: Double,
    @SerializedName("link")
    val link: String,
    @SerializedName("key")
    val key: String,
)

/*
{
	"activity": "Learn Express.js",
	"accessibility": 0.25,
	"type": "education",
	"participants": 1,
	"price": 0.1,
	"link": "https://expressjs.com/",
	"key": "3943506"
}
 */