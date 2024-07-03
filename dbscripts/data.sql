INSERT INTO client (client_id, client_name, onboarding_date, region)
VALUES(123, 'Gap', '2010-01-15', 'AMER');
INSERT INTO client (client_id, client_name, onboarding_date, region)
VALUES(149, 'BPCE', '2012-04-25', 'EMEA');
INSERT INTO client (client_id, client_name, onboarding_date, region)
VALUES(210, 'USBank', '2013-08-12', 'AMER');
INSERT INTO client (client_id, client_name, onboarding_date, region)
VALUES(75, 'SCB', '2015-03-11', 'APAC');

INSERT INTO customer (client_id, client_name, onboarding_date, region)
VALUES(123, 'Gap', '2010-01-15', 'AMER');
INSERT INTO customer (client_id, client_name, onboarding_date, region)
VALUES(149, 'BPCE', '2012-04-25', 'EMEA');
INSERT INTO customer (client_id, client_name, onboarding_date, region)
VALUES(210, 'USBank', '2013-08-12', 'AMER');
INSERT INTO customer (client_id, client_name, onboarding_date, region)
VALUES(75, 'SCB', '2015-03-11', 'APAC');

INSERT INTO login_company (company_id, company_name, region)
VALUES(135, 'Default Company 1', 'AMER');
INSERT INTO login_company (company_id, company_name, region)
VALUES(234, 'Default Company 2', 'EMEA');