package com.srg.plugin.knetwork

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform