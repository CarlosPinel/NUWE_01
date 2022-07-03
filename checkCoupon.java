import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class checkCoupon {
	
	public static boolean isCheckCoupon(String enterCode, String correctCode, String currentDate, String expirationDate) {
		//Data
		boolean condicion = false;
		LocalDate dateCurrent = stringToDate(currentDate);
		LocalDate dateExpiration = stringToDate(expirationDate);
		
		condicion = ((enterCode.equalsIgnoreCase(correctCode)) && (dateCurrent.isBefore(dateExpiration)));
		return condicion;
	}
	
	// Metodo auxiliar de String a Date
	public static LocalDate stringToDate(String dateString) {
		
		DateTimeFormatter dateForm = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate dateDate = LocalDate.parse(dateString, dateForm);
		return dateDate;
	}
}
