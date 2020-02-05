public class IntArray {
    protected int[] intArray;
    protected int numberOfElements;
    protected int i;

    public IntArray(int size) {
        intArray = new int[size];
        numberOfElements = 0;
    }

    public int getElement(int value) {
        if (searchElement(value)) {
            return intArray[i];
        } else {
            return -1;
        }
    }

    public int getMaxElement() {
        if (numberOfElements == 0) {
            System.out.println("Array is empty.");
            return -1;
        }
    
        int max = 0;
        for (int j = 0; j < numberOfElements; j++) {
            if (intArray[j] > max) {
                max = intArray[j];
            }
        }
        System.out.println("Max value is " + max + ".");
        return max;
    }

    public void removeMaxElement() {
        int value = getMaxElement();
        if (value != -1) {
            removeElement(value);
        }
    }

    public void addElement(int value) {
        if (value <= 0) {
            System.out.println("Must enter values greater than 0.");
        } else if (numberOfElements >= intArray.length) {
            System.out.println("Array is full.");
        } else {
            intArray[numberOfElements++] = value;
            System.out.println("Value " + value + " added.");
        }
    }

    public boolean removeElement(int value) {
        if (searchElement(value)) {
            while (i < numberOfElements - 1) {
                intArray[i] = intArray[++i];
            }
            intArray[i] = 0;
            numberOfElements--;
            System.out.println("Value " + value + " removed.");
            return true;
        }
        return false;
    }

    public void noDups() {
        int shiftCount = 0;
        for (int j = 0; j < numberOfElements; j++) {
            for (int k = j + 1; k < numberOfElements; k++) {
                if (intArray[j] == intArray[k]) {
                    shiftCount++;
                } else {
                    intArray[k - shiftCount] = intArray[k];
                }
            }
            numberOfElements -= shiftCount;
            while (shiftCount > 0) {
                shiftCount--;
                intArray[numberOfElements + shiftCount] = 0;
            }
        }
        System.out.println("All duplicates removed.");
    }

    protected boolean searchElement(int value) {
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