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
public class Descriptive {

    // what are a,b, and c?
    private int a;
    private int b;
    private int c;

    // and x,y,z?
    private Integer x;
    private Integer y;
    private Integer z;

    private String username;
    private String password;

    private UserManagementService userManagementService;

    public void setUserManagementService(UserManagementService userManagementService) {
        this.userManagementService = userManagementService;
    }

    public void login(String username, String password) {
        userManagementService.login(username,password);
    }


    /**
     * Sum what?
     *
     * Add up list of integers. Sum up the total value of all integers in the
     * list of integers
     *
     * @param integers list of integers
     */
    public void sum(List<Integer> integers) {
        int sum = 0;
        for (int i : integers) {
            sum += i;
        }
        System.out.println(sum);
    }

}
