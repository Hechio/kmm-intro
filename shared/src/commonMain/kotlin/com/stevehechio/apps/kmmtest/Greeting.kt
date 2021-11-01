package com.stevehechio.apps.kmmtest

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class Greeting {
    private val httpClient = HttpClient()

    suspend fun greeting(): String {
        return "Hello, ${Platform().platform}! \n ${getCountries()}"
    }

    private suspend fun getCountries(): String {
        val response: HttpResponse = httpClient.get("https://raw.githubusercontent.com/samayo/country-json/master/src/country-by-continent.json")
        return response.readText()
    }
}