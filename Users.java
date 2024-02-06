package models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Users {
    private int user_id;
    private String name;
    private String surname;
    private String user_type;


    @Override
    public String toString() {
        return user_id + " " + name + " " + surname + " " + user_type;
    }
}