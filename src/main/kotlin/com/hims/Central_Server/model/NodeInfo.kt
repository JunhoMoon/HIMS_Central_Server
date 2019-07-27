package com.hims.Central_Server.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "NodeInfo")
data class NodeInfo(
    @Id
    @Column(name="node_id")
    private var node_id: String,
    @Column(name="node_pw")
    private var node_pw: String,
    @Column(name="node_ap_type")
    private var node_ap_type: String,
    @Column(name="node_ap")
    private var node_ap: String,
    @Column(name="phone")
    private var phone: String,
    @Column(name="public_key")
    private var public_key: String,
    @Column(name="central_private_key")
    private var central_private_key: String
)