package com.example.landingpagecareplus;

import org.hibernate.annotations.Index;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String phoneNumber;
    @Column
    private String otpCode;
    @Column
    private String services;

    public User(Long id, String name, String phoneNumber, String otpCode, String services) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.otpCode = otpCode;
        this.services = services;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOtpCode() {
        return otpCode;
    }

    public void setOtpCode(String otpCode) {
        this.otpCode = otpCode;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", otpCode='" + otpCode + '\'' +
                ", services='" + services + '\'' +
                '}';
    }
}
