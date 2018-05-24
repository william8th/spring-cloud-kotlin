package com.williamheng.controller

import com.williamheng.client.AccountClient
import com.williamheng.model.Customer
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController(accountClient: AccountClient) {

    private val accountClient: AccountClient = accountClient;

    private val customers = listOf(
            Customer(1, "12345", "Adam Petrovsky"),
            Customer(2, "12346", "Peter Pan"),
            Customer(3, "12347", "Chris Ball"),
            Customer(4, "12348", "Boaty McBoatface")
    )

    @RequestMapping("/customers/identificationNumber/{identificationNumber}")
    fun findByIdentificationNumber(@PathVariable("identificationNumber") identificationNumber: String): Customer {
        return customers.stream()
                .filter({
                    it.identificationNumber.equals(identificationNumber)
                })
                .findFirst()
                .get()
    }

    @RequestMapping("/customers")
    fun findAll(): Collection<Customer> {
        return customers
    }

    @RequestMapping("/customers/{customerId}")
    fun findByCustomerId(@PathVariable("customerId") customerId: Int): Customer {
        val customer = customers.stream()
                            .filter({
                                it.customerId == customerId
                            })
                            .findFirst()
                            .get()
        customer.accounts = this.accountClient.getAccounts(customerId)
        return customer
    }
}