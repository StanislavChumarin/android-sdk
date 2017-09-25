package com.qualaroo.internal

import com.qualaroo.util.InMemorySettings
import org.junit.Assert.assertEquals
import org.junit.Test

@Suppress("IllegalIdentifier", "MemberVisibilityCanPrivate")
class UserInfoTest {

    val userInfo = UserInfo(InMemorySettings())

    @Test
    fun `generates device id once`() {
        val firstCall = userInfo.deviceId
        val secondCall = userInfo.deviceId

        assertEquals(firstCall, secondCall)
    }

    @Test
    fun `store user's id`() {
        val userId = userInfo.userId
        assertEquals(null, userId)

        userInfo.userId = "abcd1"
        assertEquals("abcd1", userInfo.userId)
    }
}