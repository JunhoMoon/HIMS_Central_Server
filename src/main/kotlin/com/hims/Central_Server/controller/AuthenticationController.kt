package com.hims.Central_Server.controller

import com.hims.Central_Server.dao.NodeInfoDAO
import com.hims.Central_Server.model.NodeInfo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.ModelAndView
import javax.servlet.http.HttpSession

@RestController
@RequestMapping(value = "/Authentication")
class AuthenticationController{
    @Autowired
    lateinit var nodeInfoDAO: NodeInfoDAO

//    @RequestMapping(value = "login", method = [RequestMethod.POST])
//    fun login(@RequestParam("user_id") id: String, @RequestParam("user_id") pw: String): ModelAndView{
//        val map = HashMap<String, Long>()
//        map.put("test", "test")
//        return map
//    }

    @PostMapping("Login")
    fun login(@RequestParam("id") id: String, @RequestParam("pw") pw: String): Map<String, Any>{
        var nodeinfo: MutableList<NodeInfo> = nodeInfoDAO.login_ckeck(id, pw)
        println(nodeinfo.size)
        val map = HashMap<String, Any>()
        map.put("pw", pw)
        map.put("id", id)
        println(map.toString())
        return map
    }

    @GetMapping("Login")
    fun getlogin(@RequestParam("id") id: String, @RequestParam("pw") pw: String): Map<String, Any>{
        var nodeinfo: MutableList<NodeInfo> = nodeInfoDAO.login_ckeck(id, pw)
        println(nodeinfo.size)
        val map = HashMap<String, Any>()
        map.put("pw", pw)
        map.put("id", id)
        println(map.toString())
        return map
    }
//
//    @PostMapping("test")
//    fun login(@RequestParam("id") id: String, @RequestParam("pw") pw: String): String{
//        val map = HashMap<String, Any>()
//        map.put("pw", pw)
//        map.put("id", id)
//        println(map.toString())
//        return "{test}"
//    }
//
//    @RequestMapping(value = "loginPage", method = [RequestMethod.GET])
//    fun loginPage(session: HttpSession): ModelAndView {
//        val mv = ModelAndView()
//
//        if (session.getAttribute("user_id") == null) {
//            mv.viewName = "login"
//        } else {
//            mv.viewName = "redirect:/mainPage"
//        }
//        return mv
//    }
}