import java.io.*;
import java.util.ArrayList;

/**
 * Clase MovieFilter para filtrar películas por género y escribir los resultados en un archivo.
 */
public class MovieFilter {

    /**
     * Filtra las películas por género y guarda el resultado en un archivo CSV.
     *
     * @param gender El género de las películas a filtrar.
     * @throws IOException Si ocurre un error de entrada/salida.
     */
    public static void filterByGender(String gender) throws IOException {

        var filmArray = getMovies();

        try (var bw = new BufferedWriter(new FileWriter(gender + ".csv"))) {
            for (Movie movie : filmArray) {
                if (movie.getGender().equals(gender)) {
                    bw.write(movie.toString());
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error de escritura: " + e.getMessage());
        }
    }

    private static ArrayList<Movie> getMovies() {
        var filmArray = new ArrayList<Movie>();

        try (var br = new BufferedReader(new FileReader("peliculas.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] m = line.split(",");
                var movie = new Movie(m[0], m[1], m[2], m[3], m[4]);
                filmArray.add(movie);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException("Error de lectura/escritura: " + e.getMessage());
        }
        return filmArray;
    }
}