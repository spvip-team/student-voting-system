package za.co.spvip.student.voting.system.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name="students")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private  String surname;
    @Column(unique = true)
    private String email;
    @Column(nullable = false)
    private  Integer number;

    private  String address;
    @Column(nullable = false)
    private  Character[] password;
    private  String createdAt;
    private  String updatedAt;


}
