package mcdate.dto;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class UserRegistrationDTO {
    private String email;
    private String password;
    private String name;
    // Add other registration fields

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}



