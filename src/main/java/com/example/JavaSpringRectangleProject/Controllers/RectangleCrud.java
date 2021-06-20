package com.example.JavaSpringRectangleProject.Controllers;

import com.example.JavaSpringRectangleProject.Entities.Rectangle;
import com.example.JavaSpringRectangleProject.Services.RectangleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;


@Controller

public class RectangleCrud {

    @Autowired
    RectangleService rectangleService;

    @GetMapping("/getRectangle")
    Optional<Rectangle> getData(@RequestParam int rectangleId) {
        System.out.println("in get data");
        return rectangleService.getRectangleData(rectangleId);
    }

    @PostMapping("/savedata")
    void saveData(@RequestBody Rectangle rectangleData) {
        rectangleService.saveRectangle(rectangleData);
    }

    @GetMapping("/deleteRectangle")
    void deleteData(@RequestParam Rectangle rectangle) {
        rectangleService.deleteRectangle(rectangle);
    }

    @PostMapping("/updatedata")
    void updateRectangle(@RequestBody Rectangle rectangleData) {
        rectangleService.updateRectangle(rectangleData);
    }

    @GetMapping("/getallrectangles")
    List<Rectangle> getAllRectangles() {
        return rectangleService.getAllRectangles();
    }
}
