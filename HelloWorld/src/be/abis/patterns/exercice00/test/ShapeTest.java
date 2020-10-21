package be.abis.patterns.exercice00.test;

import be.abis.patterns.exercice00.model.Circle;
import be.abis.patterns.exercice00.model.Rectangle;
import be.abis.patterns.exercice00.model.Shape;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeTest {

    @Test
    public void testShapeArea() {
        Rectangle rec = new Rectangle("blue",2,2);
        Circle cir = new Circle("green",5);
        assertEquals (4,rec.area(),0);
        assertEquals (78.54,round(cir.area()),0);
        assertEquals ("blue",rec.getColor());
        assertEquals ("green",cir.getColor());

        Shape[] shapeList = new Shape[2];
        shapeList[0] = rec;
        shapeList[1] = cir;

        assertEquals (4,shapeList[0] .area(),0);
        assertEquals (78.53981633974483,shapeList[1].area(),0);
        assertEquals ("blue",shapeList[0] .getColor());
        assertEquals ("green",shapeList[1].getColor());
    }

    private double round(double area) {
        return Math.round(area * 100.0) / 100.0;
    }


}
