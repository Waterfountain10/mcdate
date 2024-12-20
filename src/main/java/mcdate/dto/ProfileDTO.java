package mcdate.dto;

import lombok.Data;
import java.util.List;

@Data
public class ProfileDTO {
    private String bio;
    private List<String> interests;
    private String idealTypeDescription;
    private String major;
    private Integer yearOfStudy;
    // Add other profile fields
}