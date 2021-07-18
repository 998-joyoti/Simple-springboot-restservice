package com.example.firstapplication.SpringBootRestService.service;

import com.example.firstapplication.SpringBootRestService.repository.LibraryRepository;
import com.example.firstapplication.SpringBootRestService.controller.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LibraryService {

    @Autowired
    LibraryRepository lr;

    public String buildId(String isbn, int aisle) {
        return isbn + aisle;

    }

    public boolean checkBookAlreadyExist(String id) {

        Optional<Library> lib = lr.findById(id);
        if (lib.isPresent()) {
            return true;
        }


        return false;

    }
}
