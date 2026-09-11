package com.crm.crm.entity;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.time.LocalDateTime;
@Entity @Table(name="leads") public class Lead {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @NotBlank @Size(max=120) private String name; @Size(max=150) private String company; @Email @Size(max=150) private String email; @Size(max=30) private String phone;
 @Enumerated(EnumType.STRING) private LeadStatus status=LeadStatus.NEW; @Enumerated(EnumType.STRING) private LeadSource source=LeadSource.OTHER; private LocalDateTime createdAt;
 @PrePersist void prePersist(){if(createdAt==null)createdAt=LocalDateTime.now();}
 public Long getId(){return id;} public String getName(){return name;} public void setName(String v){name=v;} public String getCompany(){return company;} public void setCompany(String v){company=v;} public String getEmail(){return email;} public void setEmail(String v){email=v;} public String getPhone(){return phone;} public void setPhone(String v){phone=v;} public LeadStatus getStatus(){return status;} public void setStatus(LeadStatus v){status=v;} public LeadSource getSource(){return source;} public void setSource(LeadSource v){source=v;} public LocalDateTime getCreatedAt(){return createdAt;}
}
