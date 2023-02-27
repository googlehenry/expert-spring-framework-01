package org.example;

import org.springframework.stereotype.Component;

@Component
public class DBService {
    public void businessMethod() {
        System.out.println("DBService.execute transaction logic.");
    }
}
