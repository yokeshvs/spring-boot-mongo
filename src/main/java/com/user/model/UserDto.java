package com.user.model;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class UserDto {
    private String id;
    private String firstName;
    private String lastName;
    private String age;
    private String email;
    private String mobileNumber;
    private String password;
}
