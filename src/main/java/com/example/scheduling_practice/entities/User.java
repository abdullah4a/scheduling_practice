package com.example.scheduling_practice.entities;

import javax.persistence.*;

@Entity
public class User {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "webId", nullable = false)
    private Long webId;
    @Column(name = "firstName", nullable = false)
    private String firstName;
    @Column(name = "lastName", nullable = false)
    private String lastName;
    @Column(name = "userName", nullable = false)
    private String userName;
    @Column(name = "userNumber", nullable = false)
    private String userNumber;
    @Column(name = "gender", nullable = false)
    private String gender;
    private String dob;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "email", nullable = false)
    private String email;
    private String networkCode;
    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;
    private Boolean active;


    //    @JoinTable(name = "userAddress",joinColumns = @JoinColumn(name = "postalCode");@JoinColumn())
//    @JoinColumns({
//            @JoinColumn(name = "postalCode"),
//            @JoinColumn(name = "country"),
//            @JoinColumn(name = "state"),
//            @JoinColumn(name = "city"),
//            @JoinColumn(name = "street"),
//
//    })
//    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @ManyToOne()
    @JoinTable(name = "userAddress",joinColumns = @JoinColumn(name = "addressId"), inverseJoinColumns = @JoinColumn(name = "webId"))
    private Address address;
//    @OneToMany(mappedBy = "postalCode", cascade = CascadeType.ALL)
//    private Set<Address> address;
    public User(Long webId, String firstName, String lastName, String userName, String userNumber, String gender, String dob, String title, String email, String networkCode, Boolean active, String phoneNumber, Address address) {
        this.webId = webId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.userNumber = userNumber;
        this.gender = gender;
        this.active = active;
        this.dob = dob;
        this.title = title;
        this.email = email;
        this.networkCode = networkCode;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public User() {

    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNetworkCode() {
        return networkCode;
    }

    public void setNetworkCode(String networkCode) {
        this.networkCode = networkCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getWebId() {
        return webId;
    }

    public void setWebId(Long webId) {
        this.webId = webId;
    }
}
