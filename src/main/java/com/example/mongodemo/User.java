package com.example.mongodemo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Document(value="users")
public class User {

    @Id
    private String id;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String place;

}
