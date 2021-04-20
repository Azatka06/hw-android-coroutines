package com.sagutdinov.coroutines

import io.ktor.client.HttpClient
import io.ktor.client.features.json.GsonSerializer
import io.ktor.client.features.json.JsonFeature
import io.ktor.http.ContentType

object Api {
    const val url =
        "https://raw.githubusercontent.com/Azatka06/NCMserver/master/posts.json  https://raw.githubusercontent.com/Azatka06/Coroutines/origin/DataInJSON/listPosts.json"
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
