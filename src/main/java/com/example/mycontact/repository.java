package com.example.mycontact;

import com.example.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface repository extends CrudRepository<Contact, Integer> {

    List<Contact> findByNameContaining(String term);

}