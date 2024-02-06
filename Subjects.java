package models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Subjects {
    private int subject_id;
    private String subject_name;
    private int subject_code;


    @Override
    public String toString() {
        return subject_id + " " + subject_name + " " + subject_code;
    }
}
