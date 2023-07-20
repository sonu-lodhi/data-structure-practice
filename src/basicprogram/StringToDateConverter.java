package basicprogram;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter {
    public static void main(String[] args) {

        String dateString = "2023-04-05"; // The string to be converted to a date

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // The format of the date string

        try {
            Date date = dateFormat.parse(dateString); // Parsing the date string using the specified format
            System.out.println("Date: " + date.toString()); // Printing the converted date object
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }

    }
}
