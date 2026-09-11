package com.crm.crm.entity;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.time.LocalDateTime;
@Entity @Table(name="interactions") public class Interaction {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @NotBlank @Size(max=80) private String type; @NotBlank @Size(max=1000) private String notes; private LocalDateTime interactionDate; private LocalDateTime nextFollowUp;
 @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="client_id") private Client client;
 public Long getId(){return id;} public String getType(){return type;} public void setType(String v){type=v;} public String getNotes(){return notes;} public void setNotes(String v){notes=v;} public LocalDateTime getInteractionDate(){return interactionDate;} public void setInteractionDate(LocalDateTime v){interactionDate=v;} public LocalDateTime getNextFollowUp(){return nextFollowUp;} public void setNextFollowUp(LocalDateTime v){nextFollowUp=v;} public Client getClient(){return client;} public void setClient(Client v){client=v;}
}
