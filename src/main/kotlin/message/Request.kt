package com.hims.Central_Server.message

import com.google.gson.Gson
import com.hims.Central_Server.dao.JoinDAO
import com.hims.Central_Server.serviceHub.ServiceHub
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = "/rest")
private class Request {
    @Autowired
    lateinit var joinDAO: JoinDAO
    val gson = Gson()

    @PostMapping("request")
    fun request(@RequestParam("message") message: String): String? {
        var reMessage = joinDAO.getGender()
        println(reMessage.toString())
        println(gson.toJson(reMessage).toString())
        return gson.toJson(reMessage).toString()
    }

    @GetMapping("requesttest")
    fun testrequest() {
        println("test")
    }
}