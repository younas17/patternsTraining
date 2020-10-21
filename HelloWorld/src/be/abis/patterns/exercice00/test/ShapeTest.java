package be.abis.patterns.exercice00.test;

import be.abis.patterns.exercice00.model.Circle;
import be.abis.patterns.exercice00.model.Rectangle;
import be.abis.patterns.exercice00.model.Shape;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShapeTest {

    @Test
    public void testShapeArea() {
        Rectangle rec = new Rectangle("blue",2,2);
        Circle cir = new Circle("green",5);
        List<Shape> sh = new ArrayList<>();

        sh.add(rec);
        sh.add(cir);
        Shape myRectangle= sh.stream().filter(shape -> shape.getClass().getSimpleName().equals("Rectangle")).findFirst().get();
        Shape myCircle= sh.stream().filter(shape -> shape.getClass().getSimpleName().equals("Circle")).findFirst().get();
        assertEquals (4,myRectangle.area(),0);
        assertEquals (78.54,round(myCircle.area()),0);
        assertEquals ("blue",myRectangle .getColor());
        assertEquals ("green",myCircle.getColor());

    }

    private double round(double area) {
        return Math.round(area * 100.0) / 100.0;
    }


}
