public class PrimitiveArrayApp {
    public static void main(String[] args) {
        PrimitiveArrayApp paa = new PrimitiveArrayApp();
        paa.go();
    }

    public void go() {
        System.out.println("Testing unordered integer array...");
        IntArray ia = new IntArray(10);

        ia.addElement(99);
        ia.addElement(88);
        ia.addElement(90);
        ia.addElement(88);
        ia.addElement(7);
        ia.addElement(56);
        ia.addElement(48);
        ia.addElement(92);
        ia.addElement(100);
        ia.addElement(1);
        ia.addElement(50);
        ia.addElement(200);

        ia.printElements();

        ia.setElement(54, 55);
        ia.setElement(53, 55);

        System.out.println(ia.getElement(92));
        System.out.println(ia.getElement(1));

        ia.removeElement(99);
        ia.removeElement(100);
        ia.removeElement(7);
        ia.removeElement(8);
        ia.removeElement(100);
        ia.removeElement(200);

        ia.printElements();

        System.out.println("\nTesting ordered integer array...");
        OrderedIntArray oia = new OrderedIntArray(10);

        oia.addElement(99);
        oia.addElement(88);
        oia.addElement(90);
        oia.addElement(88);
        oia.addElement(7);
        oia.addElement(56);
        oia.addElement(48);
        oia.addElement(92);
        oia.addElement(100);
        oia.addElement(1);
        oia.addElement(50);
        oia.addElement(200);

        oia.printElements();

        oia.setElement(54, 55);
        oia.setElement(53, 55);

        System.out.println(oia.getElement(92));
        System.out.println(oia.getElement(1));

        oia.removeElement(99);
        oia.removeElement(100);
        oia.removeElement(7);
        oia.removeElement(8);
        oia.removeElement(100);
        oia.removeElement(200);

        oia.printElements();
    }
}