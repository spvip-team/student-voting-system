package za.co.spvip.student.voting.system.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Candidate")

public class Candidate {
    private Long id;
    private String name;
    private String profileImage;
    private String partName;
    private String description;
    private String updatedAt;
    private String createdAt;

}
