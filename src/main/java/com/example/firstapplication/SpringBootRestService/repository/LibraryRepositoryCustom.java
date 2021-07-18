package com.example.firstapplication.SpringBootRestService.repository;
import com.example.firstapplication.SpringBootRestService.controller.Library;

import java.util.List;

public interface LibraryRepositoryCustom {

    List<Library> findAllByAuthor(String authorName);

}