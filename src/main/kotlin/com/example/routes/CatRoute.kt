package com.example.routes

import com.example.data.model.Cat
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://192.168.1.197:8080"
private val cats = listOf(
    Cat("Kitten","A baby ginger cat with single brain cell.","$BASE_URL/cats/cat1.jpg"),
    Cat("Triple Cats","A group of friends.","$BASE_URL/cats/cat2.jpg"),
    Cat("Sibling","Two ginger cats grooming their sibling.","$BASE_URL/cats/cat3.jpg"),
    Cat("Bengal","A beautiful bengal cat is chilling.","$BASE_URL/cats/cat4.jpg"),
    Cat("Black","Adorable black cat trying to catch the toy.","$BASE_URL/cats/cat5.jpg"),
)

fun Route.randomCat() {
    get("/random-cat") {
        call.respond(
            HttpStatusCode.OK,
            cats.random()
        )
    }
}