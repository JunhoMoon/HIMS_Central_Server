package com.hims.Central_Server.property

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "file")
class FileUploadProperties {
    var uploadDir: String? = null
}
