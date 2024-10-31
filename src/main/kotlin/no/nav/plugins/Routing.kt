package no.nav.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        get("/internal/isAlive") {
            call.respondText("Alive!!!")
        }
        get("/internal/isReady") {
            call.respondText("Ready!!!")
        }
    }
}
