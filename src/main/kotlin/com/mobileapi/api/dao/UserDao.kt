package com.mobileapi.api.dao

import com.mobileapi.api.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserDao : CrudRepository<User, Long> {
    fun findOneByUsername(email:String) : User?
}