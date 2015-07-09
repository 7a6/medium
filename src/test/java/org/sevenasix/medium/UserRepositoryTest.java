package org.sevenasix.medium;

import org.junit.Test;
import org.sevenasix.medium.data.User;
import org.sevenasix.medium.data.UserRepository;

public class UserRepositoryTest {

    @Test
    public void shouldFindUser(){
        UserRepository repository = new UserRepository();
        String demouser = "demouser";
        User user = repository.findByUsername(demouser);
        user.name.equals("demouser");

    }
}
