package org.willowlms.repo;

import org.willowlms.actors.User;

/**
 * @author mttdbrd
 *
 */
public interface Repository {
public String store();

public byte[] retrieve();

public void isAuthorized(User u, Action a
        );
}