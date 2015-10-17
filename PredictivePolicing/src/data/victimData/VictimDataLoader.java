package data.victimData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import data.Format;

public class VictimDataLoader {
	private final String fileName = "C:\\Users\\Ryan\\git\\PredictivePolicing\\PredictivePolicing\\src\\FICT_VICTIM_DATA.csv";
	public VictimDataLoader() {}
	public ArrayList<VictimData> load() {
		ArrayList<VictimData> load = new ArrayList<VictimData>();
		BufferedReader br = null;
		FileReader fr = null;
		String line = "";
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			line = br.readLine();
			while ((line = br.readLine()) != null) {
				String[] row = Format.getRow(line);
				Long victimRecordNumber = Long.parseLong(row[0]);
				Timestamp incidentDate = Format.csvToTimestamp(row[1]);
				Long fingerprintID = Long.parseLong(row[2]);
				String firstName = row[3];
				String lastName = row[4];
				Timestamp birthDate = Format.csvToTimestamp(row[5]);
				String gender = row[6];
				String injuryDescription = row[7];
				Long caseNumber = Long.parseLong(row[8]);
				VictimData data = new VictimData();
				data.setBirthDate(birthDate);
				data.setCaseNumber(caseNumber);
				data.setFingerprintID(fingerprintID);
				data.setFirstName(firstName);
				data.setGender(gender);
				data.setIncidentDate(incidentDate);
				data.setInjuryDescription(injuryDescription);
				data.setLastName(lastName);
				data.setVictimRecordNumber(victimRecordNumber);
				load.add(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return load;
	}
	public static void main(String[] args) {
		VictimDataLoader load = new VictimDataLoader();
		load.load();
	}
}
