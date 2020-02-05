// package com.github_jonikiro;

public class OrderedIntArray extends IntArray{
    public OrderedIntArray(int size) {
        super(size);
    }

    @Override
    public void addElement(int value) {
        if (numberOfElements >= intArray.length) {
            System.out.println("Array is full.");
            return;
        } else if (numberOfElements == 0 || value > intArray[numberOfElements - 1]) {
            System.out.println("Value " + value + " not found.");
            intArray[numberOfElements] = value;
        } else if (searchElement(value)) {
            System.out.println("Value " + value + " already exists.");
            return;
        } else {
            int j = numberOfElements;
            while (j > i) {
                intArray[j] = intArray[--j];
            }
            intArray[j] = value;
        }
        numberOfElements++;
        System.out.println("Value " + value + " added.");
    }

    @Override
    public boolean searchElement(int value) {
        int lowerBound = 0;
        int upperBound = numberOfElements - 1;

        while (true) {
            i = (lowerBound + upperBound) / 2;
            if (intArray[i] == value) {
                System.out.println("Value " + value + " found.");
                return true;
            } else if (lowerBound > upperBound) {
                // 'i' needs to be adjusted so that the correct element is replaced
                if (intArray[i] < value) {
                    i++;
                }
                System.out.println("Value " + value + " not found.");
                return false;
            } else {
                if (intArray[i] < value) {
                    lowerBound = i + 1;
                } else {
                    upperBound = i - 1;
                }
            }
        }
    }
}