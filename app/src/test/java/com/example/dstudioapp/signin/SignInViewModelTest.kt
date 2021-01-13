package com.example.dstudioapp.signin

import com.example.dstudioapp.services.SignInService
import com.nhaarman.mockitokotlin2.whenever
import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class SignInViewModelTest {

    @Mock private lateinit var mockSignInService: SignInService
    private lateinit var signInViewModel: SignInViewModel

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        signInViewModel = SignInViewModel(mockSignInService)
    }

    @Test
    fun `checking a user's details should send a username and password and return true if valid`() {
        whenever(mockSignInService.wasSignInSuccessful("name", "password")).thenReturn(true)
        val res = signInViewModel.checkUserDetailsAreCorrect("name", "password")
        assertTrue(res)
    }

    @Test
    fun `checking a user's details should send a username and password and return false if invalid`() {
        whenever(mockSignInService.wasSignInSuccessful("name", "password")).thenReturn(false)
        val res = signInViewModel.checkUserDetailsAreCorrect("name", "password")
        assertFalse(res)
    }

}