package com.dellamis.library_system.repository;

import com.dellamis.library_system.book.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {
}
