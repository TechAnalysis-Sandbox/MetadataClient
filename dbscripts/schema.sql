CREATE TABLE client (
     client_id INTEGER NOT NULL,
     client_name VARCHAR(255) NOT NULL,
     onboarding_date TIMESTAMP,
     region VARCHAR(10) NOT NULL,
     PRIMARY KEY (client_id)
  );
 CREATE TABLE customer (
      client_id INTEGER NOT NULL,
      client_name VARCHAR(255) NOT NULL,
      onboarding_date TIMESTAMP,
      region VARCHAR(10) NOT NULL,
      PRIMARY KEY (client_id)
 );
 CREATE TABLE login_company (
       company_id INTEGER NOT NULL,
       company_name VARCHAR(255) NOT NULL,
       region VARCHAR(10) NOT NULL,
       PRIMARY KEY (company_id)
  );