package com.book.bookstore.repository;

import com.book.bookstore.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookRepository extends MongoRepository<Book,Long> {
    List<Book> findByCategory(String category);
    Book findByBookId(long bookId);
}
