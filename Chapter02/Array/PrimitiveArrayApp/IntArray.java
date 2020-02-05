public class IntArray {
    protected int[] intArray;
    protected int numberOfElements;
    protected int i;

    public IntArray(int size) {
        intArray = new int[size];
        numberOfElements = 0;
    }

    public void setElement(int oldValue, int newValue) {
        if (searchElement(oldValue)){
            intArray[i] = newValue;
            System.out.println("Value " + oldValue + " changed to " + newValue);
        }
    }

    public int getElement(int value) {
        if (searchElement(value)) {
            return intArray[i];
        } else {
            return -1;
        }
    }

    public void addElement(int value) {
        if (numberOfElements < intArray.length) {
            intArray[numberOfElements++] = value;
            System.out.println("Value " + value + " added.");
        } else {
            System.out.println("Array is full.");
        }
    }

    public void removeElement(int value) {
        if (searchElement(value)) {
            while (i < numberOfElements - 1) {
                intArray[i] = intArray[++i];
            }
            intArray[i] = 0;
            numberOfElements--;
            System.out.println("Value " + value + " removed.");
        }
    }

    public boolean searchElement(int value) {
        for (i = 0; i < numberOfElements; i++) {
            if (intArray[i] == value) {
                System.out.println("Value " + value + " found.");
                return true;
            }
        }
        System.out.println("Value " + value + " not found.");
        return false;
    }

    public void printElements() {
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
    }
}