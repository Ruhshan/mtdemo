package xyz.ruhshan.mtdemo.service;

import org.springframework.stereotype.Service;
import xyz.ruhshan.mtdemo.entity.User;
import xyz.ruhshan.mtdemo.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {
        user.getAddresses().forEach(address -> address.setUser(user));
        return userRepository.save(user);
    }
}
