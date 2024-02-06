package models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Students {
    private int student_id;
    private int user_id;
    private String student_name;
    private String student_dob;
    private int student_address;


    @Override
    public String toString() {
        return student_id + " " +  user_id + " " + student_name + " " + student_dob + " " + student_address;
    }
}
