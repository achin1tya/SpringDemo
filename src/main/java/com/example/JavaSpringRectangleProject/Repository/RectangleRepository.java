package com.example.JavaSpringRectangleProject.Repository;

import com.example.JavaSpringRectangleProject.Entities.Rectangle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RectangleRepository extends CrudRepository<Rectangle, Integer> {
    
}
