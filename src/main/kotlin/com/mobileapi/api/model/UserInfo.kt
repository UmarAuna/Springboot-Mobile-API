package com.mobileapi.api.model

import javax.persistence.*

@Entity
@Table(name = "user_info")
 data class UserInfo (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "user_info_id", nullable = false, updatable = false)
        private val id: Long = 0,

        @Column(name = "user_id", nullable = false, updatable = false)
        val userId: Long = 0,

        @Column(name = "email", nullable = false, unique = true)
        var email: String = "",

        @Column(name = "profile_image", nullable = true)
        var profileImage: String? = null
)