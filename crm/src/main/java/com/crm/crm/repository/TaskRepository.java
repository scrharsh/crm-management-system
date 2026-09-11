package com.crm.crm.repository;
import com.crm.crm.entity.*; import org.springframework.data.jpa.repository.JpaRepository;
public interface TaskRepository extends JpaRepository<Task,Long>{long countByStatus(TaskStatus status);}
