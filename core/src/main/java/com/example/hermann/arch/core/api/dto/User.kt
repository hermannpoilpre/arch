package com.example.hermann.arch.core.api.dto

data class User (
        val id: Long,
        val name: String,
        val username: String,
        val address: Address,
        val phone: String,
        val website: String,
        val company: Company
)