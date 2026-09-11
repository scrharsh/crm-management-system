package com.crm.crm.repository;
import com.crm.crm.entity.Client; import org.springframework.data.jpa.repository.JpaRepository;
public interface ClientRepository extends JpaRepository<Client,Long>{}
