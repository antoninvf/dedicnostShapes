package com.company.presentation;

import com.company.logic.Logic;

public class ShapesCLI {

    private Logic logic;

    public void init() {
        logic = new Logic();
        logic.loadFile();
    }

    public void theCount() {
        System.out.println("Welcome to Shapes!");
        System.out.println();
        System.out.println("Average Perimeter: " + logic.AvgPerimeter());
        System.out.println("Average Area: " + logic.AvgArea());
    }

}
