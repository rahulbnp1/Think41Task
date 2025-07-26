package com.example.chatapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.chatapp.entity.Users;
import com.example.chatapp.repository.UsersRepository;

@Service
public class UsersServices {

    @Autowired
    private UsersRepository usersRepository;

    // Get all users
    public Iterable<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    // Get user by ID
    public Optional<Users> getUserById(Long id) {
        return usersRepository.findById(id);
    }

    // Save a new user
    public Users saveUser(Users user) {
        return usersRepository.save(user);
    }

    // Update an existing user
    public Users updateUser(Long id, Users updatedUser) {
        Optional<Users> existing = usersRepository.findById(id);
        if (existing.isPresent()) {
            Users user = existing.get();
            user.setFirstName(updatedUser.getFirstName());
            user.setLastName(updatedUser.getLastName());
            user.setEmail(updatedUser.getEmail());
            user.setAge(updatedUser.getAge());
            user.setGender(updatedUser.getGender());
            user.setState(updatedUser.getState());
            user.setStreetAddress(updatedUser.getStreetAddress());
            user.setPostalCode(updatedUser.getPostalCode());
            user.setCity(updatedUser.getCity());
            user.setCountry(updatedUser.getCountry());
            user.setLatitude(updatedUser.getLatitude());
            user.setLongitude(updatedUser.getLongitude());
            user.setTrafficSource(updatedUser.getTrafficSource());
            user.setCreatedAt(updatedUser.getCreatedAt());

            return usersRepository.save(user);
        } else {
            return null;
        }
    }

    // Delete a user by ID
    public void deleteUser(Long id) {
        usersRepository.deleteById(id);
    }
}
