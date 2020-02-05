public class OrderedIntArray extends IntArray{
    public OrderedIntArray(int size) {
        super(size);
    }

    @Override
    public void addElement(int value) {
        if (value <= 0) {
            System.out.println("Must enter values greater than 0.");
            return;
        } else if (numberOfElements >= intArray.length) {
            System.out.println("Array is full.");
            return;
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
    public int getMaxElement() {
        if (numberOfElements == 0){
            System.out.println("Array is empty.");
            return -1;
        }
        int max = intArray[numberOfElements - 1];
        System.out.println("Max value " + max + " found.");
        return max;
    }

    public void merge(int[] arrayB) {
        int[] arrayA = intArray;
        intArray = new int[intArray.length + arrayB.length];
        numberOfElements = 0;
        
        for (int j = 0; j < arrayA.length; j++) {
            addElement(arrayA[j]);
        }
        for (int j = 0; j < arrayB.length; j++) {
            addElement(arrayB[j]);
        }
    }

    @Override
    protected boolean searchElement(int value) {
        if (numberOfElements == 0 || value < intArray[0]) {
            i = 0;
            return false;
        } else if (value > intArray[numberOfElements - 1]) {
            i = numberOfElements;
            return false; 
        }

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