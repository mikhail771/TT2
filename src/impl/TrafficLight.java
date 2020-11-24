package impl;

import interfaces.TrafficLightI;

public class TrafficLight implements TrafficLightI {
    private static final String GREEN = "green";
    private static final String RED = "red";
    private static final String YELLOW = "yellow";

    public String checkLight(double t) {
        double remainder = t % 5;
        return remainder < 3 ? GREEN : remainder < 4 ? YELLOW : RED;
    }
}
