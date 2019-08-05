package com.hims.Central_Server.dao

import com.hims.Central_Server.model.*
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
internal interface GenderDAO:CrudRepository<Gender,Int>{
    @Query(nativeQuery = true, value ="select * from gender where parent_key is null")
    fun getGender(): MutableList<Gender>

    @Query(nativeQuery = true, value ="select * from gender where parent_key is not null")
    fun getOtherGenders(): MutableList<Gender>
}

@Repository
internal interface RaceDAO:CrudRepository<Race,Int>{
    override fun findAll(): MutableIterable<Race>
}

@Repository
internal interface CountryDAO:CrudRepository<Country,Int>{
    override fun findAll(): MutableIterable<Country>
}

@Repository
internal interface AdminDAO:CrudRepository<Admin,Int>{
    @Query(nativeQuery = true, value ="select * from admin where country_no = :country_no or country_no is null")
    fun getAdmin(@Param("country_no") country_no: Int): MutableList<Admin>
}

@Repository
internal interface CityDAO:CrudRepository<City,Int>{
    @Query(nativeQuery = true, value ="select * from city where admin_no = :admin_no or admin_no is null")
    fun getCity(@Param("admin_no") admin_no: Int): MutableList<City>
}

@Repository
internal interface JobDAO:CrudRepository<Job,Int>{
    @Query(nativeQuery = true, value ="select * from job where parent_key = :parent_key or job_key = '99-9999'")
    fun JobDAO(@Param("parent_key") parent_key: String): MutableList<Job>

    @Query(nativeQuery = true, value ="select * from job where parent_key is null")
    fun Job1DAO(): MutableList<Job>
}

@Repository
internal interface AuthenticationDAO:CrudRepository<Gender,Int>{
    @Query(nativeQuery = true, value ="select * from gender where parent_key is null")
    fun getGender(): MutableList<Gender>

    @Query(nativeQuery = true, value ="select * from gender where parent_key is not null")
    fun getOtherGenders(): MutableList<Gender>
}