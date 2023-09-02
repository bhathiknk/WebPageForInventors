package com.InoWeb.InoWeb.Spring.repository;


import com.InoWeb.InoWeb.Spring.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}