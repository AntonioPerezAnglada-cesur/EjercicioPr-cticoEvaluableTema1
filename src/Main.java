import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            MovieFilter.filterByGender("Ciencia ficción");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
