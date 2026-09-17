package CSVreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppCsvReader {

    public static String app;
    public static String data1;
    public static String data2;

    public static void csvFileReader(String key) throws IOException {

        String path = "src/test/resources/Testdata/googleappsdata.csv";
        BufferedReader br = new BufferedReader(new FileReader(path));
        String row;
        br.readLine();

        while ((row = br.readLine()) != null) {
            String[] split = row.split(",", -1);
            if (key.equals(split[0])) {
                app   = split[1];
                data1 = split.length > 2 ? split[2] : "";
                data2 = split.length > 3 ? split[3] : "";
                break;
            }
        }
        br.close();
    }
}
