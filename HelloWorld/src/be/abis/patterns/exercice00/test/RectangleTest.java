package be.abis.patterns.exercice00.test;

import be.abis.patterns.exercice00.model.Rectangle;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testArea() {
        Rectangle rec = new Rectangle("blue",2,2);
        assertEquals (4,rec.area(),0);
        assertEquals ("blue",rec.getColor());
    }
}