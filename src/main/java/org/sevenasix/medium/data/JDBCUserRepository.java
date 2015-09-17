package org.sevenasix.medium.data;

/**
 * Created by matt on 7/14/15.
 */
public class JDBCUserRepository implements UserRepository {
    @Override
    public User findByUsername(String demouser) {
        return "demouser";
    }
}
