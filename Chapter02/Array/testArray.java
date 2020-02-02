import java.util.Random;

public class testArray {
    int[] intArray;
    int numberOfElements;
    int randomRange;
    int searchKey;
    int j;
    boolean isValueFound;

    public static void main(String[] args) {
        try {
            testArray ts = new testArray(10, 10, 100);
            ts.go();
        } catch(Exception ex) {
            System.out.println("Number of element total must be less than array size.");
        }
    }

    public void go() {
        // Populate array
        populateArray();

        // Search for key value. If found, delete and shift.
        searchArray();

        // Deletes key value if found, then shifts array
        if (isValueFound) {
            deleteKeyValue();
        }

        // Print modified array
        printElements();
    }

    public testArray(int arraySize, int numberOfElements, int randomRange) throws Exception {
        if (numberOfElements > arraySize) {
            throw new Exception();
        }
        this.intArray = new int[arraySize];
        this.numberOfElements = numberOfElements;
        this.randomRange = randomRange;
    }

    public void populateArray() {
        for (int i = 0; i < numberOfElements; i++) {
            intArray[i] = new Random().nextInt(randomRange);
            System.out.print(intArray[i] + " ");
        }
    }

    public void searchArray() {
        searchKey = intArray[new Random().nextInt(numberOfElements)];
        for (j = 0; j < numberOfElements; j++) {
            if (intArray[j] == searchKey) {
                System.out.println("\nFound " + searchKey);
                isValueFound = true;
                return;
            }
        }
        System.out.println("\nCan't find " + searchKey);
        isValueFound = false;
    }

    public void deleteKeyValue() {
        while (j < numberOfElements - 1) {
            intArray[j] = intArray[++j];
        }
        intArray[j] = 0;
        numberOfElements--;
    }

    public void printElements() {
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}