package com.hims.Central_Server.dao

import com.hims.Central_Server.model.NodeInfo
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface NodeInfoDAO: CrudRepository<NodeInfo, String>{
    override fun findAll(): MutableIterable<NodeInfo> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @Query(nativeQuery = true, value ="select * from nodeinfo c where c.node_id= :node_id and c.node_pw=:node_pw")
    fun login_ckeck(@Param("node_id") node_id: String, @Param("node_pw") node_pw:String): MutableList<NodeInfo>
}