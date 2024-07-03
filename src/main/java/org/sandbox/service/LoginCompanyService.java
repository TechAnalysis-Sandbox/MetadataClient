package org.sandbox.service;

import org.sandbox.model.LoginCompany;
import org.sandbox.repository.LoginCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class LoginCompanyService {

    @Autowired
    private LoginCompanyRepository repository;

    public List<LoginCompany> getAllLoginCompanies() {
        return repository.findAll();
    }

    public LoginCompany getLoginCompany(int companyId) {
        Optional<LoginCompany> loginCompany = repository.findById(companyId);
        if (loginCompany.isPresent()) {
            return loginCompany.get();
        } else {
            throw new NoSuchElementException();
        }
    }

    public LoginCompany addLoginCompany(@RequestBody LoginCompany company) {
        return repository.save(company);
    }
}
