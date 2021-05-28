package com.company.logic;

import com.company.data.FileLoader;

import java.util.ArrayList;

public class Logic {
    ArrayList<Shape> shapes = new ArrayList<>();

    public void loadFile() { // loads the input.txt
        ArrayList<String> values = FileLoader.file();
        for (int i = 0; i < values.size(); i++) {
            String[] currentLine = values.get(i).split(" ");

            switch (currentLine[0]) {
                case "C" -> {
                    Shape newCircle = new Circle(Float.parseFloat(currentLine[1]));
                    shapes.add(newCircle);
                }
                case "S" -> {
                    Shape newSquare = new Square(Float.parseFloat(currentLine[1]));
                    shapes.add(newSquare);
                }
                case "R" -> {
                    Shape newRectangle = new Rectangle(Float.parseFloat(currentLine[1]), Float.parseFloat(currentLine[2]));
                    shapes.add(newRectangle);
                }
            }
        }
    }

    public float AvgPerimeter() { // calculates the average of all of the perimeters
        float perimeters = 0;
        float amount = 0;

        for (Shape shape : shapes) {
            perimeters += shape.perimeter();
            amount++;
        }
        return perimeters / amount;
    }

    public float AvgArea() { // calculates the average of all of the areas
        float areas = 0;
        float amount = 0;

        for (Shape shape : shapes) {
            areas += shape.area();
            amount++;
        }
        return areas / amount;
    }
}
