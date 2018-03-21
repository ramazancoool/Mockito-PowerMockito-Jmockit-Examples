package com.groupId.test.module.second;

public class Allocator {
    String allocationValue;
 
    public Allocator(String value) {
        this.allocationValue = value;
    }
 
    public String getAllocationValue() {
        return this.allocationValue;
    }
 
    public String getAllocation(String name) {
        if (name.equalsIgnoreCase("knolder")) {
            return "Welcome to Knoldus";
        } else {
            return "Not allocated";
        }
    }
}