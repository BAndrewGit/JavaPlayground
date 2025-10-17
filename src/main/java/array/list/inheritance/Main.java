package array.list.inheritance;

public class Main {
    public static void main(String[] args) {
        ModArrayList newList = new ModArrayList();
        newList.add(5);
        newList.add(10);
        newList.add(20);
        newList.add(30);

        System.out.println(newList.getUsingMod(10));
        System.out.println(newList.getUsingMod(-3));
    }
}
