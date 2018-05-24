package com.williamheng.model

data class Customer(
        val customerId: Int,
        val identificationNumber: String,
        val name: String,
        var accounts: Collection<Account>? = null
)
