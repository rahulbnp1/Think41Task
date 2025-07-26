package com.example.chatapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.chatapp.loader.UserCSVLoader;  // ✅ Make sure this import is correct
import com.example.chatapp.loader.ProductCSVLoader; // ✅ If you're using it

@SpringBootApplication
public class ChatappApplication implements CommandLineRunner {

    @Autowired
    private UserCSVLoader userCSVLoader;

    @Autowired
    private ProductCSVLoader productCSVLoader;

    public static void main(String[] args) {
        SpringApplication.run(ChatappApplication.class, args);  // <- Line 23
    }

    @Override
    public void run(String... args) {
        userCSVLoader.load();
        productCSVLoader.load();
    }
}
