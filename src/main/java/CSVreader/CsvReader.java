package CSVreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CsvReader {

     public static String firstname;
     public static String surname;
     public static String emailid;
     public static String password;
    public static String Date = "";
    public static String Month = "";
    public static String Year = "";

    public static void csvFileReader(String data) throws IOException {

        String path = "src/test/resources/Testdata/data.csv";
        BufferedReader br = new BufferedReader(new FileReader(path));
        String row;
        // System.out.println(br.readLine());


        String[] split;

        while ((row = br.readLine()) != null) {

            split = row.split(",");

            if (data.equals(split[0])) {
                firstname = split[1];
                surname = split[2];
                emailid = split[3];
                password = split[4];
                Date = split[5];
                Month = split[6];
                Year = split[7];

                break;

            }




           /* System.out.println(row);
            System.out.println(Arrays.toString(split));
            System.out.println(row.length());
            System.out.println(split.length);*/

            }
        }

       /* public static void main (String[] args) throws IOException {

       // csvFileReader();
        System.out.println(firstname);
    }*/



}
