package za.co.spvip.student.voting.system.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class VoteDto {
    private long id;
    @NotNull
    private string name;
    @NotNull
    private string surname;
    @NotNull
    private  double studentNo;
    @NotNull
    private character[] password;
    @NotNull
    private string email;
    @NotNull
    private double contact;


}
