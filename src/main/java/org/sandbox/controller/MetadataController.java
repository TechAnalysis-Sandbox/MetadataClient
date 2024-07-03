package org.sandbox.controller;

import org.sandbox.model.Client;
import org.sandbox.service.ClientService;
import org.sandbox.service.LoginCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MetadataController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private LoginCompanyService loginCompanyService;

    @GetMapping("/health")
    public ResponseEntity<String> getHealthStatus() {
        return ResponseEntity.status(HttpStatus.OK).body("MetaData Server Status: OK");
    }

    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/clients/{id}")
    public Client getClient(@PathVariable(name = "id") int clientId) {
        return clientService.getClient(clientId);
    }

}
