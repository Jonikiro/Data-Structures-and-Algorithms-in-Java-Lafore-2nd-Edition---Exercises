public class ObjectArrayApp {
    public static void main(String[] args) {
        int arraySize = 100;
        ObjectArray cda = new ObjectArray(arraySize);

        cda.insert("Evans", "Patty", 24);
        cda.insert("Smith", "Lorraine", 37);
        cda.insert("Yee", "Tom", 43);
        cda.insert("Adams", "Henry", 63);
        cda.insert("Hashimoto", "Sato", 21);
        cda.insert("Stimson", "Henry", 29);
        cda.insert("Velasquez", "Jose", 72);
        cda.insert("Lamarque", "Henry", 54);
        cda.insert("Vang", "Minh", 22);
        cda.insert("Creswell", "Lucinda", 18);

        cda.display();

        String searchKey = "Stimson";
        Person found = cda.getPerson(searchKey);

        if (found != null) {
            found.displayPerson();
        }

        cda.delete("Smith");
        cda.delete("Yee");
        cda.delete("Creswell");

        cda.display();
    }
}