package com.stackroute.maverick.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.maverick.domain.Category;
@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>{

}
