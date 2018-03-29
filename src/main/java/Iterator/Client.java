package Iterator;

public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new Aggregate();
        for (int item : aggregate) {
            System.out.println(item);
        }
    }
}
