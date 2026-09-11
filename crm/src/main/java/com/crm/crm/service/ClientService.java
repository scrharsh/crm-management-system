package com.crm.crm.service;
import com.crm.crm.entity.Client; import com.crm.crm.repository.ClientRepository; import org.springframework.stereotype.Service; import java.util.*;
@Service public class ClientService {private final ClientRepository r; public ClientService(ClientRepository r){this.r=r;} public List<Client> findAll(){return r.findAll();} public Optional<Client> findById(Long id){return r.findById(id);} public Client save(Client c){return r.save(c);} public void delete(Long id){r.deleteById(id);} public long count(){return r.count();}}
