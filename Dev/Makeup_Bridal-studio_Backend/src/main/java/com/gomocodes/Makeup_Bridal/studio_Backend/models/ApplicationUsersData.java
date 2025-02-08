package com.gomocodes.Makeup_Bridal.studio_Backend.models;


import jakarta.persistence.*;

@Entity
@Table(name="AppointmentRequest")
public class ApplicationUsersData {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String makeupType;
    private String comments;

    public ApplicationUsersData(Long id, String firstName, String lastName, String email, String phone, String makeupType, String comments) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.makeupType = makeupType;
        this.comments = comments;
    }

    public ApplicationUsersData() {}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMakeupType() {
        return makeupType;
    }

    public void setMakeupType(String makeupType) {
        this.makeupType = makeupType;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
