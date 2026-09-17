package CSVreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FlipkartcsvReader {

    public static String product;
    public static String brand;

    public static void csvFileReader(String key) throws IOException {

        String path = "src/test/resources/Testdata/flipkartdata.csv";
        BufferedReader br = new BufferedReader(new FileReader(path));
        String row;
        String[] split;

        while ((row = br.readLine()) != null) {
            split = row.split(",");

            if (key.equals(split[0])) {
                product = split[1];
                brand = split[2];
                break;
            }
        }

    }


}
