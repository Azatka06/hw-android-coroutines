package com.sagutdinov.coroutines

import io.ktor.client.HttpClient
import io.ktor.client.features.json.GsonSerializer
import io.ktor.client.features.json.JsonFeature
import io.ktor.http.ContentType

object Api {
    const val url =
        "https://raw.githubusercontent.com/Azatka06/hw-android-coroutines/main/DataInJSON/listPosts.json?token=ANT3VGUNBSRP3JKLLISA7MTAP3BF2"
    val client = HttpClient {
        install(JsonFeature) {
            acceptContentTypes = listOf(
                ContentType.Text.Plain,
                ContentType.Application.Json
            )
            serializer = GsonSerializer()
        }
    }
}
