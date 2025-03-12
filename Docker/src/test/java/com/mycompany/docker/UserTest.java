package com.mycompany.docker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for User class.
 */
class UserTest {

    private User user;

    @BeforeEach
    void setUp() {
        user = new User("U12345", "example@example.com");
    }

    @Test
    void testConstructor() {
        assertEquals("U12345", user.getUserId());
        assertEquals("example@example.com", user.getEmail());
    }

    @Test
    void testSetEmail() {
        user.setEmail("test@example.com");
        assertEquals("test@example.com", user.getEmail());
    }

    @Test
    void testUpdateEmail() {
        user.updateEmail("newemail@example.com");
        assertEquals("newemail@example.com", user.getEmail());
    }

    @Test
    void testDisplayUserInfo() {
        // Kiểm tra không có exception khi gọi hàm này
        assertDoesNotThrow(() -> user.displayUserInfo());
    }
}
