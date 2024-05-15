package assignment;


	import java.text.DateFormat;

	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	public class DateFormatter {
	    public String formatDate(Date date, String formatStyle) {
	        DateFormat dateFormat = new SimpleDateFormat(formatStyle);
	        return dateFormat.format(date);
	    }

	    public String formatDate(String dateString, String formatStyle) {
	        try {
	            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
	            Date date = inputFormat.parse(dateString);
	            return formatDate(date, formatStyle);
	        } catch (ParseException e) {
	            return "Invalid date string";
	        }
	    }

	    // Example usage:
	    public static void main(String[] args) {
	        DateFormatter formatter = new DateFormatter();

	        // Format date object
	        Date currentDate = new Date();
	        System.out.println("Formatted Date: " + formatter.formatDate(currentDate, "MM/dd/yyyy")); // MM/dd/yyyy
	        System.out.println("Formatted Date: " + formatter.formatDate(currentDate, "dd/MM/yyyy")); // dd/MM/yyyy
	        System.out.println("Formatted Date: " + formatter.formatDate(currentDate, "yyyy-MM-dd")); // yyyy-MM-dd

	        // Format date string
	        String dateString = "2024-05-07";
	        System.out.println("Formatted Date: " + formatter.formatDate(dateString, "MM/dd/yyyy")); // MM/dd/yyyy
	        System.out.println("Formatted Date: " + formatter.formatDate(dateString, "dd/MM/yyyy")); // dd/MM/yyyy
	        System.out.println("Formatted Date: " + formatter.formatDate(dateString, "yyyy-MM-dd")); // yyyy-MM-dd
	    }
	}

	


