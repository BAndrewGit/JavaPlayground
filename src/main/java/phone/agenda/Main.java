package phone.agenda;

public class Main {
    public static void main(String[] args) {
        Contacts contact1 = new Contacts("Alice", new PhoneNumber("1234567890"));
        Contacts contact2 = new Contacts("Bob", "BobTheBuilder@gmail.com");
        Contacts contact3 = new Contacts("Charlie", "Charls@yahoo.com", new PhoneNumber("+441234567890", 44));

        System.out.println("Contact 1: " + contact1);
        System.out.println("Contact 2: " + contact2);
        System.out.println("Contact 3: " + contact3);
    }
}
