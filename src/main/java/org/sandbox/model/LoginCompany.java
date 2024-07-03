package org.sandbox.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Login_Company")
public class LoginCompany {

    @Id
    @GeneratedValue
    @Column(name = "company_id")
    private int companyId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "region")
    private String region;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "client_id", referencedColumnName = "client_id")
    private Client client;

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "LoginCompany ID: " + companyId + "\n LoginCompany Name: " + companyName + "\n Region: " + region;
    }

    /*@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "client_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Client client;

    @Column(name = "login_company_name")
    private String loginCompanyName;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getLoginCompanyName() {
        return loginCompanyName;
    }

    public void setLoginCompanyName(String loginCompanyName) {
        this.loginCompanyName = loginCompanyName;
    }


    /*
    private SimpleTimeZone defaultTimeZone;
    private Currency defaultCurrency;
    private List<ReportSuite> reportSuites;


    public SimpleTimeZone getDefaultTimeZone() {
        return defaultTimeZone;
    }

    public void setDefaultTimeZone(SimpleTimeZone defaultTimeZone) {
        this.defaultTimeZone = defaultTimeZone;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public List<ReportSuite> getReportSuites() {
        return reportSuites;
    }

    public void setReportSuites(List<ReportSuite> reportSuites) {
        this.reportSuites = reportSuites;
    }*/
}
