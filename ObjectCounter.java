/*write a program to count the number of objects created by the users */

public class ObjectCounter {
    private static int objectCount = 0;

    // Constructor increments the object count
    public ObjectCounter() {
        objectCount++;
    }

    // Method to get the object count
    public static int getObjectCount() {
        return objectCount;
    }

    public static void main(String[] args) {
        // Creating objects
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        // Print the number of objects created
        System.out.println("Number of objects created: " + ObjectCounter.getObjectCount());
    }
}
