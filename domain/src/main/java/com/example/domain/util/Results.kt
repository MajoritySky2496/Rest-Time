package com.example.domain.util

import java.io.Serializable

data class Results<out A, out B>(
    val data: A,
    val message: B
) : Serializable {
    override fun toString(): String = "($data, $message)"
}