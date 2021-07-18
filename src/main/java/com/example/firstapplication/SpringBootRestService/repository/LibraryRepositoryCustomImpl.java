package com.example.firstapplication.SpringBootRestService.repository;

import com.example.firstapplication.SpringBootRestService.controller.Library;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class LibraryRepositoryCustomImpl implements LibraryRepositoryCustom{



    LibraryRepository repository;
    @Autowired
    public void setLibraryRepository(LibraryRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Library> findAllByAuthor(String authorname) {
        List<Library> bookswithAuthor = new ArrayList<Library>();
        List<Library> books = repository.findAll();
        for (Library item : books) {
            System.out.println("Book Name: " + item.getBook_name() + " Author: "+ item.getAuthor());
            if (item.getAuthor().equalsIgnoreCase(authorname))
            {
                bookswithAuthor.add(item);
            }
        }
        return bookswithAuthor;
    }

}
