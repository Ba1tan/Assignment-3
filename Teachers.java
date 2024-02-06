package models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Teachers {
    private int teacher_id;
    private int user_id;
    private String teacher_name;
    private String teacher_email;
    private int teacher_phone;


    @Override
    public String toString() {
        return teacher_id + " " +  user_id + " " + teacher_name + " " + teacher_email + " " +  teacher_phone ;
    }
}
