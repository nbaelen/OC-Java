import javax.imageio.IIOException;
import java.util.List;
import java.util.stream.*;
import java.io.*;
import java.nio.file.*;

public class StreamFile {
    public static void main(String[] args) {
        String fileName = "sites.txt";

        try(Stream<String> sf = Files.lines(Paths.get(fileName))) {
            sf.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nLiens en .fr dans la liste donnée");
        try(Stream<String> sf = Files.lines(Paths.get(fileName))){
            List<Object> list = sf.parallel()
                    .filter(x -> x.contains(".fr"))
                    .collect(Collectors.toList());
            System.out.println(list);

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
