package com.kgstrivers.WorkT.Models;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Author {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String firstname;
    private String lastname;
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Author() {
    }

    public Author(String firstname, String lastname, Set<Book> books) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.books = books;
    }
}
