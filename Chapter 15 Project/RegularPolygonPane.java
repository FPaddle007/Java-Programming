/*
Project: N-Sided Regular Polygon 

Problem Description: 
Write a program that displays a regular polygon and uses two buttons named +1 
and -1 to increase or decrease the size of the polygon, as shown in the following 
figure.

Your Task: 
1. Create the RegularPolygonPane class for displaying an n-sided regular
polygon. n is a data field in RegularPolygonPane. 

2. Write the code to handle the action events from the buttons to change the 
number of the sides in a RegularPolygonPane object and redisplay it.
*/

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class RegularPolygonPane extends Pane {
    private int sides = 3; // Start with a triangle by default.
    private double radius = 100; // Default radius of the polygon.

    public RegularPolygonPane() {
        drawPolygon();
    }

    public void setSides(int sides) {
        if (sides >= 3) { // Minimum sides for a polygon is 3.
            this.sides = sides;
            drawPolygon();
        }
    }

    public int getSides() {
        return sides;
    }

    public void drawPolygon() {
        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;

        Polygon polygon = new Polygon();
        for (int i = 0; i < sides; i++) {
            double angle = 2 * Math.PI / sides * i;
            double x = centerX + radius * Math.cos(angle);
            double y = centerY - radius * Math.sin(angle); // Subtract because JavaFX Y-coordinates increase downward.
            polygon.getPoints().addAll(x, y);
        }

        polygon.setFill(Color.LIGHTBLUE);
        polygon.setStroke(Color.BLACK);

        getChildren().clear(); // Clear previous shapes.
        getChildren().add(polygon);
    }

    @Override
    protected void layoutChildren() {
        drawPolygon(); // Redraw polygon when the pane is resized.
    }
}