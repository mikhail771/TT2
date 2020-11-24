package impl;

import interfaces.Counter;

public class RecursionCounter implements Counter {
    private int counter = 1;

    @Override
    public void count(int countTo) {
        if (!isInputValid(countTo)) {
            return;
        }
        printCount(counter);
        counter++;
        if (counter > countTo) {
            return;
        }
        count(countTo);
    }

    private void printCount(int counter) {
        System.out.println(counter);
    }

    private boolean isInputValid(int countTo) {
        if(counter > countTo) {
            System.out.println("Not valid value");
            return false;
        }
        return true;
    }
}
