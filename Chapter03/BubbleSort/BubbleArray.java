public class BubbleArray {
    private int[] bubbleArray;
    private int numberOfElements;

    public BubbleArray(int arraySize) {
        bubbleArray = new int[arraySize];
        numberOfElements = 0;
    }

    public void insert(int value) {
        bubbleArray[numberOfElements] = value;
        numberOfElements++;
    }

    public void display() {
        for (int j = 0; j < numberOfElements; j++) {
            System.out.print(bubbleArray[j] + " ");
        }
        System.out.println();
    }

    public void bubbleSort() {
        int outer, inner;

        for (outer = numberOfElements - 1; outer > 1; outer--) {
            for (inner = 0; inner < outer; inner++) {
                if (bubbleArray[inner] > bubbleArray[inner + 1]) {
                    int temp = bubbleArray[inner];
                    bubbleArray[inner] = bubbleArray[inner + 1];
                    bubbleArray[inner + 1] = temp;
                }
            }
        }
    }
}