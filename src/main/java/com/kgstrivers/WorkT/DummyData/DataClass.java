package com.kgstrivers.WorkT.DummyData;

import com.kgstrivers.WorkT.Models.Author;
import com.kgstrivers.WorkT.Models.Book;
import com.kgstrivers.WorkT.Models.Publisher;
import com.kgstrivers.WorkT.Repository.AuthorRepoistory;
import com.kgstrivers.WorkT.Repository.BookRepository;
import com.kgstrivers.WorkT.Repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataClass implements CommandLineRunner {


    private final AuthorRepoistory authorRepoistory;
    private final BookRepository bookRepository;

    private final PublisherRepository publisherRepository;

    public DataClass(AuthorRepoistory authorRepoistory, BookRepository bookRepository,PublisherRepository publisherRepository) {
        this.authorRepoistory = authorRepoistory;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author kaushik = new Author("Kaushik" , "Ghosh");
        Book b1 = new Book("Adding to the Code","123456789");
//        kaushik.getBooks().add(b1);

        Publisher pb = new Publisher();

        pb.setName("UUU");
        pb.setCity("Jalpaiguri");
        pb.setState("WB");

//        b1.setPublisher(pb);
//        pb.getBooks().add(b1);


        authorRepoistory.save(kaushik);
        bookRepository.save(b1);




        Author kg = new Author("kg" , "Ghosh");
        Book b2 = new Book("Adding to the JAVA Code","129876789");





        authorRepoistory.save(kg);
        bookRepository.save(b2);
        publisherRepository.save(pb);





        System.out.println("Data Class Working...");
        System.out.println("Data Inserted");



        Author kgf = new Author("kgf" , "Ghosh");
        Book b3 = new Book("Adding to the C++ Code","130876789");
        Publisher pb2 = new Publisher();

        pb.getBooks().add(b1);
        pb.getBooks().add(b2);
        pb2.getBooks().add(b3);








        authorRepoistory.save(kgf);
        bookRepository.save(b3);
        publisherRepository.save(pb);

        System.out.println("Total Number of Books:"+bookRepository.count());
        System.out.println("Total Number of Authors:"+authorRepoistory.count());




        System.out.println("Publish Number of Books:"+pb2.getBooks().size());





    }
}
