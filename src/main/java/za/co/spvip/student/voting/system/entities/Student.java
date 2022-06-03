package za.co.spvip.student.voting.system.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "students")
public class Student {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false,unique = true)
    private String  surname;
    private String  initials;
    private double contact;
    @Column(nullable = false)
    private int  studentNumber;
    private String password;
    private String email;
    private int idNumber;



}
