package com.crm.crm.service;
import com.crm.crm.entity.Interaction; import com.crm.crm.repository.InteractionRepository; import org.springframework.stereotype.Service; import java.util.*;
@Service public class InteractionService {private final InteractionRepository r; public InteractionService(InteractionRepository r){this.r=r;} public List<Interaction> findAll(){return r.findAll();} public Interaction save(Interaction i){return r.save(i);} public void delete(Long id){r.deleteById(id);} public long count(){return r.count();}}
