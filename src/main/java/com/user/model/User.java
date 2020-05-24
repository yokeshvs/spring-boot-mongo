package com.user.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "users")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String age;
    @Indexed(unique = true)
    private String email;
    private String mobileNumber;
    private String password;
}
