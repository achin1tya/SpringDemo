package com.example.JavaSpringRectangleProject.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Rectangle", schema = "mysql")
public class Rectangle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rectId;

    @Column(name = "name")
    private String name;

    @Column(name = "width")
    private int width;

    @Column(name = "height")
    private int height;

    @Column(name = "color")
    private String color;

    @Column(name = "attribute")
    private String attribute;

    public int getRectId() {
        return rectId;
    }

    public void setRectId(int rectId) {
        this.rectId = rectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}
