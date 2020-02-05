public class ObjectArray {
    private Person[] personArray;
    private int numberOfElements;
    private int i;

    public ObjectArray(int arraySize) {
        personArray = new Person[arraySize];
        numberOfElements = 0;
    }

    public Person getPerson(String searchName) {
        if (search(searchName)) {
            return personArray[i];
        }
        return null;
    }

    public void insert(String last, String first, int age) {
        personArray[numberOfElements] = new Person(last, first, age);
        System.out.println("Person " + personArray[numberOfElements].getLast() + " added.");
        numberOfElements++;
    }

    public boolean delete(String searchName) {
        if (search(searchName)) {
            System.out.println("Person " + personArray[i].getLast() + " deleted.");
            for (int j = i; j < numberOfElements; j++) {
                personArray[j] = personArray[j + 1];
            }
            numberOfElements--;
            return true;
        }
        return false;
    }

    public void display() {
        for (int j = 0; j < numberOfElements; j++) {
            personArray[j].displayPerson();
        }
    }

    public boolean search(String searchName) {
        for (i = 0; i < numberOfElements; i++) {
            if (personArray[i].getLast().equals(searchName)) {
                System.out.println("Person " + personArray[i].getLast() + " found.");
                return true;
            }
        }
        System.out.println("Person " + personArray[i].getLast() + " not found.");
        return false;
    }
}