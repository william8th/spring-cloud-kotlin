package com.williamheng.controller

import com.williamheng.model.Account
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.stream.Collectors

@RestController
class AccountController {

    private val log = LoggerFactory.getLogger(AccountController::class.java)

    private val accounts = listOf(
            Account(1, 1, "111111"),
            Account(2, 2, "222222"),
            Account(3, 3, "333333"),
            Account(4, 4, "444444"),
            Account(5, 1, "555555"),
            Account(6, 2, "666666"),
            Account(7, 2, "777777")
    )

    @RequestMapping("/accounts/{number}")
    fun findByAccountNumber(@PathVariable("number") number: String): Account {
        return accounts.stream()
                .filter({
                    it.accountNumber.equals(number)
                })
                .findFirst()
                .get()
    }

    @RequestMapping("/accounts/customers/{customerId}")
    fun findByCustomerId(@PathVariable("customerId") customerId: Int): Collection<Account> {
        log.info("Retrieving accounts for customerId={}", customerId)
        return accounts.stream()
                .filter({
                    it.customerId.equals(customerId)
                })
                .collect(Collectors.toList())
    }

    @RequestMapping("/accounts")
    fun findAll(): Collection<Account> {
        return accounts
    }

}