package com.hims.Central_Server.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = "Central_Key")
internal data class Central_Key(
        @Id
        @Column(name = "public_key")
        private var public_key: String,
        @Column(name = "private_key")
        private var private_key: String,
        @Column(name = "state")
        private var state: String
)

@Entity
@Table(name = "NodeInfo")
internal data class NodeInfo(
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

@Entity
@Table(name = "gender")
internal data class Gender(
        @Id
        @Column(name="gender_key")
        private var gender_key: Int,
        @Column(name="parent_key")
        private var parent_key: Int?,
        @Column(name="gender_name")
        private var gender_name: String
)

@Entity
@Table(name = "Race")
internal data class Race(
        @Id
        @Column(name="race_key")
        private var race_key: Int,
        @Column(name="race_name")
        private var race_name: String
)

@Entity
@Table(name = "Country")
internal data class Country(
        @Id
        @Column(name="country_no")
        private var country_no: Int,
        @Column(name="country_name")
        private var country_name: String
)

@Entity
@Table(name = "Admin")
internal data class Admin(
        @Id
        @Column(name="admin_no")
        private var admin_no: Int,
        @Column(name="admin_name")
        private var admin_name: String,
        @Column(name="country_no")
        private var country_no: Int?
)

@Entity
@Table(name = "City")
internal data class City(
        @Id
        @Column(name="city_no")
        private var city_no: Int,
        @Column(name="city_name")
        private var city_name: String,
        @Column(name="admin_no")
        private var admin_no: Int?
)

@Entity
@Table(name = "Job")
internal data class Job(
        @Id
        @Column(name="job_key")
        private var job_key: String,
        @Column(name="parent_key")
        private var parent_key: String?,
        @Column(name="job_name")
        private var job_name: String?
)