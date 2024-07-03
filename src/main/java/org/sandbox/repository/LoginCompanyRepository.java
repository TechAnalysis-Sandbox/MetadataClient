package org.sandbox.repository;

import org.sandbox.model.LoginCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginCompanyRepository extends JpaRepository<LoginCompany, Integer> {
}
