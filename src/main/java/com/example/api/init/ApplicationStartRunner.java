package com.example.api.init;

import com.example.api.entity.Role;
import com.example.api.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class ApplicationStartRunner implements CommandLineRunner {

    private final RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        Role roleUser = new Role(1L,"123", "ROLE_USER");
        Role roleAdmin = new Role(2L,"456", "ROLE_ADMIN");
        roleRepository.save(roleUser);
        roleRepository.save(roleAdmin);

    }
}
