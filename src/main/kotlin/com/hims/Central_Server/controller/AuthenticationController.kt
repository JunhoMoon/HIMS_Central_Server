package com.hims.Central_Server.controller

import com.google.gson.Gson
import com.hims.Central_Server.dao.*
import com.hims.Central_Server.model.NodeInfo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = "/Authentication")
internal class AuthenticationController{
    @Autowired
    lateinit var nodeInfoDAO: NodeInfoDAO
    @Autowired
    lateinit var genderDAO: GenderDAO
    @Autowired
    lateinit var raceDAO: RaceDAO
    @Autowired
    lateinit var countryDAO: CountryDAO
    @Autowired
    lateinit var adminDAO: AdminDAO
    @Autowired
    lateinit var cityDAO: CityDAO
    @Autowired
    lateinit var jobDAO: JobDAO
    @Autowired
    lateinit var authenticationDAO: AuthenticationDAO

    val gson = Gson()

//    @RequestMapping(value = "login", method = [RequestMethod.POST])
//    fun login(@RequestParam("user_id") id: String, @RequestParam("user_id") pw: String): ModelAndView{
//        val map = HashMap<String, Long>()
//        map.put("test", "test")
//        return map
//    }

    @GetMapping("getGender")
    private fun getGender(): String {
        var reMessage = genderDAO.getGender()
        return gson.toJson(reMessage).toString()
    }

    @GetMapping("getOtherGenders")
    private fun getOtherGenders(): String {
        var reMessage = genderDAO.getOtherGenders()
        return gson.toJson(reMessage).toString()
    }

    @GetMapping("getRace")
    private fun getRace(): String {
        var reMessage = raceDAO.findAll()
        return gson.toJson(reMessage).toString()
    }

    @GetMapping("getCountry")
    private fun getCountry(): String {
        var reMessage = countryDAO.findAll()
        return gson.toJson(reMessage).toString()
    }

    @PostMapping("getAdmin")
    private fun getAdmin(@RequestParam("country_no") country_no: Int): String {
        println(country_no)
        var reMessage = adminDAO.getAdmin(country_no)
        return gson.toJson(reMessage).toString()
    }

    @PostMapping("getCity")
    private fun getCity(@RequestParam("admin_no") admin_no: Int): String {
        var reMessage = cityDAO.getCity(admin_no)
        return gson.toJson(reMessage).toString()
    }

    @PostMapping("getJob")
    private fun getJob(@RequestParam("parent_key") parent_key: String): String {
        println(parent_key)
        return if (parent_key == "first"){
            var reMessage = jobDAO.Job1DAO()
            gson.toJson(reMessage).toString()
        }else{
            var reMessage = jobDAO.JobDAO(parent_key)
            gson.toJson(reMessage).toString()
        }
    }

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
        println(pw)
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