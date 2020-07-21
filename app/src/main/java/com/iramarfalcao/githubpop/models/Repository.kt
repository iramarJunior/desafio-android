package com.iramarfalcao.githubpop.models

data class Repository(
    val title: String,
    val description: String,
    val avatar: String,
    val username: String,
    val name: String,
    val forks: Number,
    val likes: Number
) {
}