public class TestArrayApp {
    private int searchKey;

    public static void main(String[] args) {
        TestArrayApp taa = new TestArrayApp();
        taa.go();
    }

    public void go() {
        IntArray ia = new IntArray(9);

        ia.addElement(11);
        ia.addElement(22);
        ia.addElement(33);
        ia.addElement(44);
        ia.addElement(54);
        ia.addElement(66);
        ia.addElement(77);
        ia.addElement(88);
        ia.addElement(99);
        ia.addElement(100);

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
    }
}