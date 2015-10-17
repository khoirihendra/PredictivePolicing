package data.arrestData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Timestamp;
import java.util.ArrayList;

import data.Format;

public class ArrestDataLoader {
	private final String fileName = "C:\\Users\\Ryan\\git\\PredictivePolicing\\PredictivePolicing\\src\\FICT_ARREST_DATA.csv";
	public ArrestDataLoader() {}
	public ArrayList<ArrestData> load() {
		ArrayList<ArrestData> load = new ArrayList<ArrestData>();
		BufferedReader br = null;
		FileReader fr = null;
		String line = "";
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			line = br.readLine();
			while ((line = br.readLine()) != null) {
				String[] row = Format.getRow(line);
				Long arrestRecordNumber = Long.parseLong(row[0]);
				String caseNumber = row[12];
				Timestamp arrestDate = Format.csvToTimestamp(row[1]);
				String locationType = row[2];
				Long fingerprintID = Long.parseLong(row[3]);
				String firstName = row[4];
				String lastName = row[5];
				Timestamp birthDate = Format.csvToTimestamp(row[6]);
				String gender = row[7];
				String factionNumber = row[8];
				String primaryCharge = row[9];
				String chargeTypeCD = row[10];
				String fbiCode = row[11];
				ArrestData data = new ArrestData();
				data.setArrestRecordNumber(arrestRecordNumber);
				data.setLocationType(locationType);
				data.setArrestDate(arrestDate);
				data.setFingerprintID(fingerprintID);
				data.setFirstName(firstName);
				data.setLastName(lastName);
				data.setBirthDate(birthDate);
				data.setGender(gender);
				data.setFactionNumber(factionNumber);
				data.setPrimaryCharge(primaryCharge);
				data.setChargeTypeCD(chargeTypeCD);
				data.setFbiCode(fbiCode);
				data.setCaseNumber(caseNumber);
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
}
