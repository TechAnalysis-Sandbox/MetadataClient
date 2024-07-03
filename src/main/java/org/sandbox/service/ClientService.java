package org.sandbox.service;

import org.sandbox.exception.ClientNotFoundException;
import org.sandbox.model.Client;
import org.sandbox.model.LoginCompany;
import org.sandbox.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client getClient(int id) {
        Optional<Client> client =  clientRepository.findById(id);
        if (client.isPresent()) {
            return client.get();
        } else {
            throw new ClientNotFoundException("Client with id: {" + id + "} not found");
        }
    }

    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    public Client addLoginCompany(int clientId, LoginCompany loginCompany) {
        Optional<Client> optional = clientRepository.findById(clientId);
        if (optional.isPresent()) {
            Client client = optional.get();
            client.addLoginCompany(loginCompany);
            return clientRepository.save(client);
        } else {
            throw new ClientNotFoundException("Client with id: {" + clientId + "} not found");
        }
    }

    public void deleteClient(int clientId) {
        Optional<Client> optional = clientRepository.findById(clientId);
        if (optional.isPresent()) {
            clientRepository.delete(optional.get());
        } else {
            throw new ClientNotFoundException("Client with id: {" + clientId + "} not found");
        }
    }
}
