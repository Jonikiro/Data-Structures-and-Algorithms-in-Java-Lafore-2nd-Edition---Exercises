public class BubbleSortApp {
    public static void main(String[] args) {
        int arraySize = 100;
        BubbleArray ab = new BubbleArray(arraySize);

        ab.insert(77);
        ab.insert(99);
        ab.insert(44);
        ab.insert(55);
        ab.insert(22);
        ab.insert(88);
        ab.insert(11);
        ab.insert(66);
        ab.insert(33);

        ab.display();

        ab.bubbleSort();

        ab.display();
    }
}