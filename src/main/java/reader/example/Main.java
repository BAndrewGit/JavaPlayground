package reader.example;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader("mesaj.txt");

        System.out.println(digitsOnlyFileReader.readFile());
        System.out.println(digitsOnlyFileReader.getPath());

    }
}
