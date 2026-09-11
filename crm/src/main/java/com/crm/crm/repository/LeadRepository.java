package com.crm.crm.repository;
import com.crm.crm.entity.*; import org.springframework.data.jpa.repository.JpaRepository;
public interface LeadRepository extends JpaRepository<Lead,Long>{long countByStatus(LeadStatus status);}
