package com.williamheng.model

data class Account(
        val accountId: Int,
        val customerId: Int,
        val accountNumber: String
) {
    constructor() : this(0, 0, "")
}