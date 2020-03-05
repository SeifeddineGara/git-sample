package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RestServiceApplicationTests {

    @Test
    public void testGetUsername() {
        User user = new User();
        user.setUsername("Malek");
        String username = user.getUsername();
        assertEquals("Malek", username);

    }

    @Test
    public void testGetEmail() {
        User user = new User();
        user.setEmail("malek@gmail.com");
        String email = user.getEmail();
        assertEquals("malek@gmail.com", email);

    }
}
