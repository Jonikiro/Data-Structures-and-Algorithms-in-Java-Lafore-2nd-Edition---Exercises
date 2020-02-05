public class PrimitiveArrayApp {
    public static void main(String[] args) {
        PrimitiveArrayApp paa = new PrimitiveArrayApp();
        paa.go();
    }

    public void go() {
        System.out.println("Testing unordered integer array...");
        IntArray ia = new IntArray(10);

        // addElement tests
        ia.addElement(1);
        ia.addElement(100);
        ia.addElement(2);
        ia.addElement(99);
        ia.addElement(-1);
        ia.addElement(1);
        ia.addElement(1);
        ia.addElement(50);
        ia.addElement(49);
        ia.addElement(1);
        ia.addElement(200);
        ia.addElement(15);

        // printElement test
        ia.printElements();

        // getMaxElement test
        ia.getMaxElement();

        // removeMaxElement test
        ia.removeMaxElement();

        // getElement tests
        System.out.println(ia.getElement(99));
        System.out.println(ia.getElement(98));

        // noDups test
        ia.noDups();
        ia.printElements();

        // removeElement tests
        ia.removeElement(99);
        ia.removeElement(100);
        ia.removeElement(1);
        ia.removeElement(2);
        ia.removeElement(4);
        ia.removeElement(3);

        ia.printElements();

        System.out.println("\nTesting ordered integer array...");
        OrderedIntArray oia = new OrderedIntArray(10);

        // addElement tests
        oia.addElement(1);
        oia.addElement(100);
        oia.addElement(2);
        oia.addElement(99);
        oia.addElement(-1);
        oia.addElement(4);
        oia.addElement(3);
        oia.addElement(50);
        oia.addElement(49);
        oia.addElement(1);
        oia.addElement(200);
        oia.addElement(15);

        // printElements test
        oia.printElements();

        // getElement tests
        System.out.println(oia.getElement(99));
        System.out.println(oia.getElement(98));

        // removeElement tests
        oia.removeElement(99);
        oia.removeElement(100);
        oia.removeElement(7);
        oia.removeElement(8);
        oia.removeElement(100);
        oia.removeElement(200);

        oia.printElements();

        // merge Test
        int[] arrayB = {1,2,3,4,5,6,7,8,9,10};
        oia.merge(arrayB);

        oia.printElements();
    }
}