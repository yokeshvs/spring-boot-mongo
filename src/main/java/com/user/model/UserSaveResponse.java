package com.user.model;

import com.fasterxml.jackson.annotation.JsonView;
import com.user.projection.Views;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@JsonView(Views.Public.class)
public class UserSaveResponse {
    private String id;
    private String email;
}
