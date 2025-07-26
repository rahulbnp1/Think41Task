package com.example.chatapp.loader;

import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.chatapp.entity.Users;
import com.example.chatapp.repository.UsersRepository;
import com.opencsv.CSVReader;

@Component
public class UserCSVLoader {

    @Autowired
    private UsersRepository usersRepository;

    public void load() {
        try (CSVReader reader = new CSVReader(new FileReader("src/main/resources/data/users.csv"))) {
            String[] line;
            boolean skipHeader = true;

            while ((line = reader.readNext()) != null) {
                if (skipHeader) {
                    skipHeader = false;
                    continue;
                }

                Users user = new Users();

                usersRepository.save(user);
            }

            System.out.println("✅ users.csv loaded into database.");

        } catch (Exception e) {
            System.err.println("❌ Failed to load users.csv: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
