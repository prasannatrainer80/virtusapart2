package com.example;

import com.example.config.JwtService;
import com.example.controller.UserController;
import com.example.model.AuthRequest;
import com.example.model.UserData;
import com.example.service.UserDataService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {

    @InjectMocks
    private UserController userController;

    @Mock
    private UserDataService userDataService;

    @Mock
    private JwtService jwtService;

    @Mock
    private AuthenticationManager authenticationManager;

    @Mock
    private Authentication authentication;

    private MockMvc mockMvc;

    @BeforeEach
    void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }

    // ---------------------------------------------------------
    // Test welcome()
    // ---------------------------------------------------------
    @Test
    void testWelcome() throws Exception {
        mockMvc.perform(get("/auth/welcome"))
                .andExpect(status().isOk())
                .andExpect(content().string("Welcome this endpoint is not secure"));
    }

    // ---------------------------------------------------------
    // Test addNewUser()
    // ---------------------------------------------------------
    @Test
    void testAddNewUser() throws Exception {

        UserData user = new UserData();
        user.setName("Prasanna");
        user.setEmail("Prasanna@gmail.com");
        user.setPassword("Prasanna");
        user.setRoles("ROLE_ADMIN");


        when(userDataService.addUser(Mockito.any(UserData.class)))
                .thenReturn("User Added Successfully");

        String json = """
                {
                    "name": "Prasanna",
                    "email":"Prasanna@gmail.com",
                    "password": "Prasanna",
                    "roles": "ROLE_ADMIN"
                }
                """;

        mockMvc.perform(post("/auth/addNewUser")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isOk())
                .andExpect(content().string("User Added Successfully"));
    }

    // ---------------------------------------------------------
    // Test generateToken()
    // ---------------------------------------------------------
    @Test
    void testGenerateToken() throws Exception {

        AuthRequest req = new AuthRequest();
        req.setUsername("Prasanna");
        req.setPassword("Prasanna");

        when(authenticationManager.authenticate(
                any(UsernamePasswordAuthenticationToken.class)))
                .thenReturn(authentication);

        when(authentication.isAuthenticated()).thenReturn(true);
        when(jwtService.generateToken("Prasanna")).thenReturn("mock-jwt-token");

        String json = """
                {
                    "username": "Prasanna",
                    "password": "Prasanna"
                }
                """;

        mockMvc.perform(post("/auth/generateToken")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isOk())
                .andExpect(content().string("mock-jwt-token"));
    }

    // ---------------------------------------------------------
    // Test adminProfile() - Controller side only
    // NOTE: PreAuthorize is NOT executed in standalone MockMvc
    // ---------------------------------------------------------
    @Test
    void testAdminProfile() throws Exception {
        mockMvc.perform(get("/auth/admin/adminProfile"))
                .andExpect(status().isOk())
                .andExpect(content().string("Welcome to Admin Profile"));
    }

    // ---------------------------------------------------------
    // Test userProfile()
    // ---------------------------------------------------------
    @Test
    void testUserProfile() throws Exception {
        mockMvc.perform(get("/auth/user/userProfile"))
                .andExpect(status().isOk())
                .andExpect(content().string("Welcome to User Profile"));
    }
}
