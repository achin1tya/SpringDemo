package com.example.JavaSpringRectangleProject.Services;

import com.example.JavaSpringRectangleProject.Entities.Rectangle;
import com.example.JavaSpringRectangleProject.Repository.RectangleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class RectangleService {

    @Autowired
    RectangleRepository rectangleRepository;

    public Optional<Rectangle> getRectangleData(int id) {
        return rectangleRepository.findById(id);
    }

    public void saveRectangle(Rectangle rectangleData) {
        rectangleRepository.save(rectangleData);
    }

    public void deleteRectangle(Rectangle rectangleData) {
        rectangleRepository.delete(rectangleData);
    }

    public void updateRectangle(Rectangle rectangleData) {
        rectangleRepository.save(rectangleData);
    }

    public List<Rectangle> getAllRectangles() {
        List<Rectangle> ans = (List<Rectangle>) rectangleRepository.findAll();
        return ans;
    }

}
