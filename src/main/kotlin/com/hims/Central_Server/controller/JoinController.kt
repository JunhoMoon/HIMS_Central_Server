package com.hims.Central_Server.controller

import com.google.gson.Gson
import com.hims.Central_Server.dao.JoinDAO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.transaction.annotation.Transactional

@Controller
@Transactional
class JoinController{
//    @Autowired
//    lateinit var joinDAO: JoinDAO

    val gson = Gson()

//    internal fun getGender():String{
//        var message = joinDAO.getGender()
//        return gson.toJson(message)
//        return ""
//    }
}