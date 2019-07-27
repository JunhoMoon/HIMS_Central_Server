package com.hims.Central_Server.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "Central_Key")
data class Central_Private_Key (
    @Id
    @Column(name="public_key")
    private var public_key: String,
    @Column(name="private_key")
    private var private_key: String,
    @Column(name="state")
    private var state: String
)