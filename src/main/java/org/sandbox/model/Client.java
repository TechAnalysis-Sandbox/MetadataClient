package org.sandbox.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "Client")
public class Client {

    @Id
    @GeneratedValue
    @Column(name = "client_id")
    private int clientId;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "onboarding_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date onboardingDate;

    @Column(name = "region")
    private String region;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id", referencedColumnName = "client_id")
    private List<LoginCompany> loginCompanies;

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Date getOnboardingDate() {
        return onboardingDate;
    }

    public void setOnboardingDate(Date onboardingDate) {
        this.onboardingDate = onboardingDate;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<LoginCompany> getLoginCompanies() {
        return loginCompanies;
    }

    public void setLoginCompanies(List<LoginCompany> loginCompanies) {
        this.loginCompanies = loginCompanies;
    }

    public void addLoginCompany(LoginCompany loginCompany) {
        loginCompanies.add(loginCompany);
        //loginCompany.setClient(this);
    }

    @Override
    public String toString() {
        return "Client ID: " + clientId + "\nClient Name: " + clientName + "\nOnboarding Date: " + onboardingDate;
    }
}
