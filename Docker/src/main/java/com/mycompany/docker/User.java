/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.docker;

/**
 *
 * @author ADMIN
 */
public class User {

    private String userId;
    private String email;

    public User(String userId, String email) {
        this.userId = userId;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void updateEmail(String newEmail) {
        this.email = newEmail;
    }

    public void displayUserInfo() {
        System.out.println("User ID: " + userId);
        System.out.println("Email: " + email);
    }

    public static void main(String[] args) {
        // Tạo một đối tượng User
        User user = new User("U12345", "example@example.com");

        // Hiển thị thông tin ban đầu
        System.out.println("Thông tin người dùng ban đầu:");
        user.displayUserInfo();

        // Cập nhật email
        user.updateEmail("newemail@example.com");

        // Hiển thị thông tin sau khi cập nhật
        System.out.println("\nThông tin người dùng sau khi cập nhật email:");
        user.displayUserInfo();
    }
}
