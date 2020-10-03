package com.mobileapi.api.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "role")
class Role(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "role_id", nullable = false, updatable = false)
        val id: Long = 0,

        @Column(name = "role_name", nullable = false, unique = true)
        var name: String = "",

        @ManyToMany
        @JoinTable(name = "role_user",
                joinColumns = [JoinColumn(name = "role_id", referencedColumnName = "role_id")],
                inverseJoinColumns = [JoinColumn(name = "user_id", referencedColumnName = "user_id")])
        val users: Set<User> = HashSet()
) : Serializable


