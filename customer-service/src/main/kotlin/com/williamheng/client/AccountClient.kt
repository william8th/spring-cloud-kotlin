package com.williamheng.client

import com.williamheng.model.Account
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient("account-service")
interface AccountClient {

    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/accounts/customers/{customerId}"]
    )
    fun getAccounts(@PathVariable("customerId") customerId: Int): Collection<Account>

}