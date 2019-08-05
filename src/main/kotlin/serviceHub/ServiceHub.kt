package com.hims.Central_Server.serviceHub

import com.hims.Central_Server.controller.JoinController
import org.json.simple.JSONObject
import org.json.simple.parser.JSONParser
import org.json.simple.parser.ParseException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.stereotype.Service

@Controller
object ServiceHub{

    @Autowired
    lateinit var controller:JoinController

    internal fun checkRequestType(message: String):String?{
        val parser = JSONParser()
        var jsonObj = JSONObject()
        var reMessage:String? = null

        try {
            jsonObj = parser.parse(message) as JSONObject
            val requestType = jsonObj.get("requestType").toString()
            when(requestType){
                "getGender" -> {
//                    reMessage = controller.getGender()
                }
            }
        } catch (e: ParseException) {
            // TODO Auto-generated catch block
            e.printStackTrace()
            reMessage = e.printStackTrace().toString()
        }
        return reMessage
    }
}