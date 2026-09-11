package com.crm.crm.entity;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.time.LocalDate;
@Entity @Table(name="tasks") public class Task {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @NotBlank @Size(max=150) private String title; @Size(max=1000) private String description; @Enumerated(EnumType.STRING) private TaskPriority priority=TaskPriority.MEDIUM; @Enumerated(EnumType.STRING) private TaskStatus status=TaskStatus.PENDING; private LocalDate dueDate;
 @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="client_id") private Client client;
 public Long getId(){return id;} public String getTitle(){return title;} public void setTitle(String v){title=v;} public String getDescription(){return description;} public void setDescription(String v){description=v;} public TaskPriority getPriority(){return priority;} public void setPriority(TaskPriority v){priority=v;} public TaskStatus getStatus(){return status;} public void setStatus(TaskStatus v){status=v;} public LocalDate getDueDate(){return dueDate;} public void setDueDate(LocalDate v){dueDate=v;} public Client getClient(){return client;} public void setClient(Client v){client=v;}
}
