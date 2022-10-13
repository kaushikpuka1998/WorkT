package com.kgstrivers.WorkT.Repository;

import com.kgstrivers.WorkT.Models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer> {

}
