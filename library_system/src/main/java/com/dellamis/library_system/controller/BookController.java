package com.dellamis.library_system.controller;

import com.dellamis.library_system.repository.BookRepository;
import com.dellamis.library_system.repository.CategoryRepository;
import com.dellamis.library_system.repository.SubCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/book")
@RequiredArgsConstructor
public class BookController {

    private final BookRepository bookRepo;
    private final CategoryRepository categoryRepo;
    private final SubCategoryRepository subCategoryRepo;

//    get all categories
//    get all sub-categories
//    get all books
//    get all sub-categories in a category
//    get all books in a sub-category
//    get all borrowed book

//    create a category
//    create a sub-category
//    create a book

//    search a books by category,sub-category, book name, book id(Optional)
//    filter books by category, status/isAvailable(true/false)
//    borrow a book
//    return a book
//


}
