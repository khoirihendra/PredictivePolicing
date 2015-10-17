package data;
import java.sql.Timestamp;
import java.util.ArrayList;

public class Format {
	public static String[] getRow(String line) {
		//36552,17-SEP-12 18:00,35325162,"FRANCISCO","IHMUD",03-MAR-91 00:00,"M","GSW LEFT WRIST, LEFT EAR, RIGHT SHOULDER",378095
		ArrayList<String> row = new ArrayList<String>();
		char[] charLine = line.toCharArray();
		String currentCol = "";
		char currentChar;
		boolean quote = false;
		for (int i = 0; i < charLine.length; i++) {
			currentChar = charLine[i];
			if (currentChar == '"') {
				if (quote) {
					quote = false;
				}
				else {
					quote = true;
				}
				continue;
			}
			if (currentChar == ',' && !quote) {
				row.add(currentCol);
				currentCol = "";
			}
			else {
				currentCol += currentChar;
			}
		}
		row.add(currentCol);
		String[] finalRow = new String[row.size()];
		for (int i = 0; i < row.size(); i++) {
			finalRow[i] = row.get(i);
		}
		return finalRow;
	}
	public static Timestamp csvToTimestamp(String csv) {
		if (csv.equals("")) {
			return null;
		}
		//14-FEB-14 08:31
		//yyyy-mm-dd hh:mm:ss
		String[] date = csv.split("-");
		String day = date[0];
		String month = getMonth(date[1]);
		String semi = Integer.parseInt(date[2].substring(0, date[2].indexOf(" "))) < 16 ? "20" : "19";
		String year = semi + date[2].substring(0, date[2].indexOf(" "));
		String time = date[2].substring(date[2].indexOf(" ") + 1) + ":00";
		String timestamp = year + "-" + fixedLengthString(month) + "-"  + fixedLengthString(day) + " " + time;
		return Timestamp.valueOf(timestamp);
	}
	public static String fixedLengthString(String num) {
		if (num.length() != 2) {
			if (num.length() == 1) {
				return "0" + num;
			}
		}
		return num;
	} //14-FEB-14 08:31
	public static String getMonth(String month) {
		if (month.equalsIgnoreCase("JAN")) {
			return "01";
		}
		else if (month.equalsIgnoreCase("FEB")) {
			return "02";
		}
		else if (month.equalsIgnoreCase("MAR")) {
			return "03";
		}
		else if (month.equalsIgnoreCase("APR")) {
			return "04";
		}
		else if (month.equalsIgnoreCase("MAY")) {
			return "05";
		}
		else if (month.equalsIgnoreCase("JUN")) {
			return "06";
		}
		else if (month.equalsIgnoreCase("JUL")) {
			return "07";
		}
		else if (month.equalsIgnoreCase("AUG")) {
			return "08";
		}
		else if (month.equalsIgnoreCase("SEP")) {
			return "09";
		}
		else if (month.equalsIgnoreCase("OCT")) {
			return "10";
		}
		else if (month.equalsIgnoreCase("NOV")) {
			return "11";
		}
		else if (month.equalsIgnoreCase("DEC")) {
			return "12";
		}
		else {
			return "00";
		}
	}
}
