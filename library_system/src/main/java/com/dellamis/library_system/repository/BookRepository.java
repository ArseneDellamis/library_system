package com.dellamis.library_system.repository;

import com.dellamis.library_system.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
