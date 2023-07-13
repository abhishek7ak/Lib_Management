package com.greatlearning.libmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.libmgmt.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
