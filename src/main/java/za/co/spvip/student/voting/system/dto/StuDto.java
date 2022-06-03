package za.co.spvip.student.voting.system.dto;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StuDto {
    private long id;
    @NotNull
    private String surname;
    private String initials;
    private double StudentNumber;
    private String password;
    private String email;
    private double contact;
    private int idNumber;

}
