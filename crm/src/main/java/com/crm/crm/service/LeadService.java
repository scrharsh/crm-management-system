package com.crm.crm.service;
import com.crm.crm.entity.*; import com.crm.crm.repository.LeadRepository; import org.springframework.stereotype.Service; import java.util.*;
@Service public class LeadService {private final LeadRepository r; public LeadService(LeadRepository r){this.r=r;} public List<Lead> findAll(){return r.findAll();} public Optional<Lead> findById(Long id){return r.findById(id);} public Lead save(Lead l){return r.save(l);} public void delete(Long id){r.deleteById(id);} public long count(){return r.count();} public long count(LeadStatus s){return r.countByStatus(s);}}
