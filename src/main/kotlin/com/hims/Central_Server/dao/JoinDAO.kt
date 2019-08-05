package com.hims.Central_Server.dao

import com.hims.Central_Server.model.Gender
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
internal interface JoinDAO: CrudRepository<Gender, String> {
    @Query(nativeQuery = true, value ="select * from gender where parent_key is null")
    fun getGender(): MutableList<Gender>
}