package com.example.hermann.arch.core.api.dto

data class Address (
        val street: String,
        val suite: String,
        val city: String,
        val zipcode: String,
        val geo: Geo
)