package test;
import clients. Client;

public class TestClient {
    public static void main() {

        Client c1;
        c1 = new Client("Forger", "Anya", "250975104821", "0734495678", 2000);

        Client c2;
        c2 = new Client("Forger", "Yor", "876543234567", "0756765438", 1988);

        Client c3;
        c3 = new Client(c2);

        System.out.println(c2);


    }
}
