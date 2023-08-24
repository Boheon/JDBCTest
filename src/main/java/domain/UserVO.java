package domain;

import lombok.*;

@Data//getter, setter, toString, equals, hashCode
@NoArgsConstructor
@AllArgsConstructor
public class UserVO {
    private String id;
    private String password;
    private String name;
    private String role;
}

