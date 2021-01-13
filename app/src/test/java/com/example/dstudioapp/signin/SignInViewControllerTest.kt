package com.example.dstudioapp.signin

import com.example.dstudioapp.profile.ProfileFragment
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.eq
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class SignInViewControllerTest {

    @Mock private lateinit var mockView: SignInView
    @Mock private lateinit var mockViewModel: SignInViewModel
    private lateinit var signInViewController: SignInViewController

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        signInViewController = SignInViewController(mockView, mockViewModel)
    }

    @Test
    fun `when user credentials are checked it should show you the profile screen if correct`() {
        whenever(mockView.getUserNameAndPassword()).thenReturn(Pair("name", "password"))
        whenever(mockViewModel.checkUserDetailsAreCorrect(any(), any())).thenReturn(true)
        signInViewController.showProfileIfSuccessful()
        verify(mockView).replaceFragmentWith(any(), eq(ProfileFragment.FRAGMENT_TAG), eq(true))
    }

}