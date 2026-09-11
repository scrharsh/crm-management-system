package com.crm.crm.service;
import com.crm.crm.entity.*; import com.crm.crm.repository.TaskRepository; import org.springframework.stereotype.Service; import java.util.*;
@Service public class TaskService {private final TaskRepository r; public TaskService(TaskRepository r){this.r=r;} public List<Task> findAll(){return r.findAll();} public Optional<Task> findById(Long id){return r.findById(id);} public Task save(Task t){return r.save(t);} public void delete(Long id){r.deleteById(id);} public long count(){return r.count();} public long count(TaskStatus s){return r.countByStatus(s);}}
