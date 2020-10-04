package com.mobileapi.api.dao

import com.mobileapi.api.model.UserInfo
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserInfoDao : CrudRepository<UserInfo, Long> {
    fun findOneByUserId(userId:Long) : UserInfo?
}