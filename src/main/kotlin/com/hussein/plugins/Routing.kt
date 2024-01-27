package com.hussein.plugins

import com.hussein.sendMessage
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        sendMessage()
    }
}
