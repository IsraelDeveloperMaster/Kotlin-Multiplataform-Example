package net.developermaster.kotlinmultiplataform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform