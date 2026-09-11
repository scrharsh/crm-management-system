package com.crm.crm.entity;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.time.LocalDateTime;
@Entity @Table(name="clients") public class Client {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank @Size(max=120) private String name; @Size(max=150) private String company; @Email @Size(max=150) private String email; @Size(max=30) private String phone; @Size(max=100) private String industry; @Size(max=255) private String address;
 @Enumerated(EnumType.STRING) private ClientStatus status=ClientStatus.ACTIVE; private LocalDateTime createdAt;
 @PrePersist void prePersist(){if(createdAt==null)createdAt=LocalDateTime.now();}
 public Long getId(){return id;} public String getName(){return name;} public void setName(String v){name=v;} public String getCompany(){return company;} public void setCompany(String v){company=v;} public String getEmail(){return email;} public void setEmail(String v){email=v;} public String getPhone(){return phone;} public void setPhone(String v){phone=v;} public String getIndustry(){return industry;} public void setIndustry(String v){industry=v;} public String getAddress(){return address;} public void setAddress(String v){address=v;} public ClientStatus getStatus(){return status;} public void setStatus(ClientStatus v){status=v;} public LocalDateTime getCreatedAt(){return createdAt;}
}
