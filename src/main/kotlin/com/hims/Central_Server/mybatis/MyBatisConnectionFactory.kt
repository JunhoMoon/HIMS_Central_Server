package com.hims.Central_Server.mybatis

import org.apache.ibatis.io.Resources
import org.apache.ibatis.session.SqlSessionFactory
import org.apache.ibatis.session.SqlSessionFactoryBuilder

import java.io.FileNotFoundException
import java.io.IOException
import java.io.Reader

object MyBatisConnectionFactory {
    var sqlSessionFactory: SqlSessionFactory? = null
        private set

    init {
        try {
            val resource = "config/mybatis-config.xml"

            val reader = Resources.getResourceAsReader(resource)

            if (sqlSessionFactory == null) {
                sqlSessionFactory = SqlSessionFactoryBuilder().build(reader)
            }
        } catch (fileNotFoundException: FileNotFoundException) {
            fileNotFoundException.printStackTrace()
        } catch (iOException: IOException) {
            iOException.printStackTrace()
        }

    }

}
