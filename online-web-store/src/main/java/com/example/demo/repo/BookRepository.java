package com.example.demo.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Book;


public interface BookRepository extends JpaRepository<Book, Integer> {
	

	@Query(value = "update Book set printedPrice =:updatedPrintedPrice where bookId=:srchId")
	@Modifying
	@Transactional
    public int modifyPrintedPrice(@Param("srchId")int id,@Param("updatedPrintedPrice") double updatedPrintedPrice);

	@Query(value = "update Book set discountPrice =:updatedDiscountPrice where bookId=:srchId")
	@Modifying
	@Transactional
	public int modifyDiscountPrice(@Param("srchId")int id,@Param("updatedDiscountPrice") double updatedDiscountPrice);
	
	
	List<Book> findByBookTitle(String qryName);
}

