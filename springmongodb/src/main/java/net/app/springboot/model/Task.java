package net.app.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
  
// Annotations
@Data

@AllArgsConstructor
@Getter
@Setter
@Document(collection = "tasktable")
  
// Class
public class Task {
  
    // Attributes
    @Id private long id;
    private String title;
    private String description;
    private String createdBy;
    private String assignedTo;
    private String completedOn;
    private String status;
    
}