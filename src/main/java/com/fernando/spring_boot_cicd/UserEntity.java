package com.fernando.spring_boot_cicd;

import com.google.cloud.firestore.annotation.DocumentId;
import com.google.cloud.spring.data.firestore.Document;
import lombok.*;

import com.google.cloud.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Document(collectionName = "users")
public class UserEntity {
    @DocumentId
    private String username;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private Timestamp createdAt;
}
