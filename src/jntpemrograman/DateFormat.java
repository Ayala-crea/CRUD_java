/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jntpemrograman;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Asus
 */
public class DateFormat {

    private static final String DATE_FORMAT_PATTERN = "dd-MMMM-yyyy";

    public static String formatDateToString(DateFormat date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT_PATTERN);
        return dateFormat.format(date);
    }

    public static DateFormat parseStringToDate(String dateString) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT_PATTERN);
        return DateFormat.parseStringToDate(dateString);
    }

    public static void main(String[] args) {
        // Example usage
        DateFormat currentDate = new DateFormat();
        
        // Format date to string
        String formattedDate = formatDateToString(currentDate);
        System.out.println("Formatted Date: " + formattedDate);

        try {
            // Parse string to date
            DateFormat parsedDate = parseStringToDate("24-January-2024");
            System.out.println("Parsed Date: " + parsedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    long getTime() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
