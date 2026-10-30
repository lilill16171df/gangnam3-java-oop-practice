package com.survivalcoding.day18.datasource

import io.ktor.http.HttpStatusCode

class MyResponse(
    val statusCode: HttpStatusCode,
    val header: Map<String, String>,
    val body: String
)