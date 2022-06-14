package za.co.spvip.student.voting.system.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private  String surname;
    private String email;
    private  String address;
    @NotNull
    private  String password;
}