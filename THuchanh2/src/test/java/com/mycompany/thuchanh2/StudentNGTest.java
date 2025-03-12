/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.mycompany.thuchanh2;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 *
 * @author ADMIN
 */

/**
 * Lớp kiểm thử cho lớp Student sử dụng TestNG.
 */
public class StudentNGTest {
    
    private Student student;
    
    @BeforeMethod
    public void setUp() {
        // Khởi tạo đối tượng Student mới trước mỗi test
        student = new Student("S001", "John Doe", 20);
    }
    
    /**
     * Kiểm tra phương thức getStudentId()
     */
    @Test
    public void testGetStudentId() {
        String expectedId = "S001";
        String actualId = student.getStudentId();
        Assert.assertEquals(actualId, expectedId, "Student ID không khớp.");
    }
    
    /**
     * Kiểm tra phương thức getName()
     */
    @Test
    public void testGetName() {
        String expectedName = "John Doe";
        String actualName = student.getName();
        Assert.assertEquals(actualName, expectedName, "Tên sinh viên không khớp.");
    }
    
    /**
     * Kiểm tra phương thức getAge()
     */
    @Test
    public void testGetAge() {
        int expectedAge = 20;
        int actualAge = student.getAge();
        Assert.assertEquals(actualAge, expectedAge, "Tuổi sinh viên không khớp.");
    }
    
    /**
     * Kiểm tra phương thức setAge()
     */
    @Test
    public void testSetAge() {
        int newAge = 21;
        student.setAge(newAge);
        int actualAge = student.getAge();
        Assert.assertEquals(actualAge, newAge, "Phương thức setAge() không cập nhật tuổi đúng.");
    }
    
    /**
     * Kiểm tra phương thức updateName()
     */
    @Test
    public void testUpdateName() {
        String newName = "Jane Doe";
        student.updateName(newName);
        String actualName = student.getName();
        Assert.assertEquals(actualName, newName, "Phương thức updateName() không cập nhật tên đúng.");
    }
}
