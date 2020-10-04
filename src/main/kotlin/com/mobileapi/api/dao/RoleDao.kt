package com.mobileapi.api.dao

import com.mobileapi.api.model.Role
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface RoleDao : CrudRepository<Role, Long> {
    fun findByName(name:String) : Role?
}