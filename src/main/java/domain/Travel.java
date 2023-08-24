package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Travel {
    private Long no;
    private String region;
    private String title;
    private String description;
    private String address;
    private String tel;

}
