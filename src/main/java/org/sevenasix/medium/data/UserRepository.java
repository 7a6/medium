package org.sevenasix.medium.data;

public class UserRepository {
    public User findByUsername(String demouser) {
        return new User("demouser");
    }
}
