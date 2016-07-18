/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.descriptiveprogramming;

import java.util.List;

/**
 * @author colin
 */
public interface UserManagementService {

    void login(String username, String password);

    boolean isLoggedIn(String username);

    List<String> getLoggedInUsers();
}
