package com.kgstrivers.WorkT.DummyData;

import com.kgstrivers.WorkT.Models.Author;
import com.kgstrivers.WorkT.Models.Book;
import com.kgstrivers.WorkT.Models.Publisher;
import com.kgstrivers.WorkT.Repository.AuthorRepoistory;
import com.kgstrivers.WorkT.Repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataClass implements CommandLineRunner {


    private final AuthorRepoistory authorRepoistory;
    private final BookRepository bookRepository;

    public DataClass(AuthorRepoistory authorRepoistory, BookRepository bookRepository) {
        this.authorRepoistory = authorRepoistory;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author kaushik = new Author("Kaushik" , "Ghosh");
        Book b1 = new Book("Adding to the Code","123456789");

        authorRepoistory.save(kaushik);
        bookRepository.save(b1);



        Author kg = new Author("kg" , "Ghosh");
        Book b2 = new Book("Adding to the JAVA Code","129876789");

        authorRepoistory.save(kg);
        bookRepository.save(b2);


        System.out.println("Data Class Working...");
        System.out.println("Data Inserted");

        System.out.println("Total Number of Books:"+bookRepository.count());
        System.out.println("Total Number of Authors:"+authorRepoistory.count());



    }
}
