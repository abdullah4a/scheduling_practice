package com.example.scheduling_practice.entities;

import javax.persistence.*;

@Entity
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "web_id", nullable = false)
    private Long webId;
    @Column(name = "fullBranchName", nullable = false)
    private String fullBranchName;
    @Column(name = "companyId", nullable = false)
    private String companyId;
    @Column(name = "branchName", nullable = false)
    private String branchName;
    @Column(name = "branchNumber", nullable = false)
    private Long branchNumber;
    @Column(name = "email", nullable = false)
    private String email;
    private String faxNumber;
    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;
    @Column(name = "url")
    private String url;
    @Column(name = "active")
    private String active;
    @ManyToOne
    @JoinTable(name = "branchTable", joinColumns = @JoinColumn(name = "addressId"), inverseJoinColumns = @JoinColumn(name = "webId"))
    private Address address;

    public Branch(Long webId, String fullBranchName, String companyId, String branchName, Long branchNumber, String email, String faxNumber, String phoneNumber, String url, String active, Address address) {
        this.webId = webId;
        this.fullBranchName = fullBranchName;
        this.companyId = companyId;
        this.branchName = branchName;
        this.branchNumber = branchNumber;
        this.email = email;
        this.faxNumber = faxNumber;
        this.phoneNumber = phoneNumber;
        this.url = url;
        this.active = active;
        this.address = address;
    }

    public Branch() {
    }

    public Long getWebId() {
        return webId;
    }

    public void setWebId(Long webId) {
        this.webId = webId;
    }

    public String getFullBranchName() {
        return fullBranchName;
    }

    public void setFullBranchName(String fullBranchName) {
        this.fullBranchName = fullBranchName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Long getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(Long branchNumber) {
        this.branchNumber = branchNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
