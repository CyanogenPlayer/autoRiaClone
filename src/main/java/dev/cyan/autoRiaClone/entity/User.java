package dev.cyan.autoRiaClone.entity;

import dev.cyan.autoRiaClone.enums.AccountType;
import dev.cyan.autoRiaClone.enums.Role;
import dev.cyan.autoRiaClone.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Getter
@Setter
@NoArgsConstructor
@Document("users")
public class User {
    @MongoId
    private String id;
    private String name;
    @Indexed(unique = true)
    private String email;
    @Indexed(unique = true)
    private String phone;
    private String password;
    private Role role = Role.SELLER;
    private AccountType accountType = AccountType.BASIC;
    private Status status = Status.ACTIVE;
}

