package com.dellamis.library_system.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUser {

    private String firstName;
    private String lastName;
    private Set<RoleList> roles;

    private String password;
}
