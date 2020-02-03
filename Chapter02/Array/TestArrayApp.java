public class TestArrayApp {
    public static void main(String[] args) {
        TestArrayApp taa = new TestArrayApp();
        taa.go();
    }

    public void go() {
        System.out.println("Testing unordered integer array...");
        IntArray ia = new IntArray(9);

        ia.addElement(99);
        ia.addElement(88);
        ia.addElement(77);
        ia.addElement(66);
        ia.addElement(54);
        ia.addElement(44);
        ia.addElement(33);
        ia.addElement(22);
        ia.addElement(11);
        ia.addElement(100);
        ia.addElement(200);
        ia.addElement(88);
        ia.addElement(1);

        ia.printElements();

        ia.setElement(54, 55);
        ia.setElement(53, 55);

        System.out.println(ia.getElement(55));
        System.out.println(ia.getElement(56));

        ia.removeElement(53);
        ia.removeElement(99);
        ia.removeElement(11);
        ia.removeElement(55);

        ia.printElements();

        System.out.println("\nTesting ordered integer array...");
        OrderedIntArray oia = new OrderedIntArray(15);

        oia.addElement(99);
        oia.addElement(88);
        oia.addElement(77);
        oia.addElement(66);
        oia.addElement(54);
        oia.addElement(44);
        oia.addElement(33);
        oia.addElement(22);
        oia.addElement(11);
        oia.addElement(100);
        oia.addElement(200);
        oia.addElement(88);
        oia.addElement(1);

        oia.printElements();

        oia.setElement(54, 55);
        oia.setElement(53, 55);

        System.out.println(oia.getElement(55));
        System.out.println(oia.getElement(56));

        oia.removeElement(53);
        oia.removeElement(99);
        oia.removeElement(11);
        oia.removeElement(55);
        oia.removeElement(22);
        oia.removeElement(200);

        oia.printElements();
    }
}