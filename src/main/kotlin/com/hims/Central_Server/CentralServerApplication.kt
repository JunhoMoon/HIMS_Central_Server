package com.hims.Central_Server

import com.hims.Central_Server.property.FileUploadProperties
import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(FileUploadProperties::class)

class CentralServerApplication

fun main(args: Array<String>) {
	runApplication<CentralServerApplication>(*args){
		setBannerMode(Banner.Mode.OFF)
	}
}
