package org.ashina.mycontact.repository;
import com.example.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MycontactApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycontactApplication.class, args);
    }

}