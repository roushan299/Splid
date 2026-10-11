package com.roushan.splid.seeders;

import com.roushan.splid.models.User;
import com.roushan.splid.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@AllArgsConstructor
public class UserDataSeeder implements CommandLineRunner {

    private final UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        if(userRepository.count() > 0) {
            System.out.println("User data already seeded");
            return;
        }

        System.out.println("Seeding user data .....");
        List<User> users = List.of(
                User.builder().name("Alice").phone("9998887776").password("alice@123").email("alice@example.com").build(),
                User.builder().name("Bob").phone("9998887775").password("bob@123").email("bob@example.com").build(),
                User.builder().name("Charlie").phone("9998887774").password("charlie@123").email("charlie@example.com").build(),
                User.builder().name("Diana").phone("9998887773").password("diana@123").email("diana@example.com").build(),
                User.builder().name("Ethan").phone("9998887772").password("ethan@123").email("ethan@example.com").build(),
                User.builder().name("Fiona").phone("9998887771").password("fiona@123").email("fiona@example.com").build(),
                User.builder().name("George").phone("9998887770").password("george@123").email("george@example.com").build(),
                User.builder().name("Hannah").phone("9998887769").password("hannah@123").email("hannah@example.com").build()
        );
        userRepository.saveAll(users);
        System.out.println("User data seeded successfully");
    }

}
