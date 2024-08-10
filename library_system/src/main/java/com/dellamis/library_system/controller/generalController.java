package com.dellamis.library_system.controller;

import com.dellamis.library_system.repository.RoleRepository;
import com.dellamis.library_system.repository.UserRepository;
import com.dellamis.library_system.user.RegisterUser;
import com.dellamis.library_system.user.UserRole;
import com.dellamis.library_system.user.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/lib")
@RequiredArgsConstructor
public class generalController {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @PostMapping("/register")
    public ResponseEntity<?> register(
            @RequestBody RegisterUser registerUser
    )
    {

        Users savedUser = new Users();
        savedUser.setFirstName(registerUser.getFirstName());
        savedUser.setLastName(registerUser.getLastName());
        savedUser.setPassword(registerUser.getPassword());
        savedUser.setIsActive(true);

        Set<UserRole> userRoles = registerUser.getRoles().stream()
                .map(roleList -> roleRepository.findByName(roleList)
                        .orElseThrow(() -> new RuntimeException("Role not found")))
                .collect(Collectors.toSet());

        savedUser.setRoles(userRoles);

        userRepository.save(savedUser);
        return ResponseEntity.ok("User registered successfully");
    }
}
