package analysis;

import java.util.ArrayList;
import java.util.TreeMap;

import data.arrestData.ArrestData;
import data.arrestData.ArrestDataLoader;

public class MostCommon {
	public static void main(String... args) {
		ArrestDataLoader load = new ArrestDataLoader();
		ArrayList<ArrestData> data = load.load();
		TreeMap<String, Integer> arrestDate = new TreeMap<String, Integer>();
		TreeMap<String, Integer> birthDate = new TreeMap<String, Integer>();
		TreeMap<String, Integer> chargeTypeCD = new TreeMap<String, Integer>();
		TreeMap<String, Integer> factionNumber = new TreeMap<String, Integer>();
		TreeMap<String, Integer> fbiCode = new TreeMap<String, Integer>();
		TreeMap<String, Integer> firstName = new TreeMap<String, Integer>();
		TreeMap<String, Integer> gender = new TreeMap<String, Integer>();
		TreeMap<String, Integer> locationType = new TreeMap<String, Integer>();
		TreeMap<String, Integer> lastName = new TreeMap<String, Integer>();
		TreeMap<String, Integer> primaryCharge = new TreeMap<String, Integer>();
		System.out.println("CHECK 1");
		int x = data.size();
		for (int i = 0; i < x; i++) {
			System.out.println("" + i + "/" + x);
			ArrestData current = data.get(i);
			String arrestDate1 = current.getArrestDate() == null ? "" : current.getArrestDate().toString().substring(5, 10);
			String birthDate1 = current.getBirthDate() == null ? "" : current.getBirthDate().toString().substring(5, 10);
			String chargeTypeCD1 = current.getChargeTypeCD();
			String factionNumber1 = current.getFactionNumber();
			String fbiCode1 = current.getFbiCode();
			String firstName1 = current.getFirstName();
			String gender1 = current.getGender();
			String locationType1 = current.getLocationType();
			String lastName1 = current.getLastName();
			String primaryCharge1 = current.getPrimaryCharge();
			if (arrestDate.containsKey(arrestDate1)) {
				int tot = (int) arrestDate.get(arrestDate1);
				arrestDate.put(arrestDate1, tot + 1);
			}
			else {
				arrestDate.put(arrestDate1, 1);
			}
			if (birthDate.containsKey(birthDate1)) {
				int tot = (int) birthDate.get(birthDate1);
				birthDate.put(birthDate1, tot + 1);
			}
			else {
				birthDate.put(birthDate1, 1);
			}
			if (chargeTypeCD.containsKey(chargeTypeCD1)) {
				int tot = (int) chargeTypeCD.get(chargeTypeCD1);
				chargeTypeCD.put(chargeTypeCD1, tot + 1);
			}
			else {
				chargeTypeCD.put(chargeTypeCD1, 1);
			}
			if (factionNumber .containsKey(factionNumber1)) {
				int tot = (int) factionNumber .get(factionNumber1);
				factionNumber .put(factionNumber1, tot + 1);
			}
			else {
				factionNumber .put(factionNumber1, 1);
			}
			if (fbiCode .containsKey(fbiCode1)) {
				int tot = (int) fbiCode .get(fbiCode1);
				fbiCode .put(fbiCode1, tot + 1);
			}
			else {
				fbiCode .put(fbiCode1, 1);
			}
			if (firstName .containsKey(firstName1)) {
				int tot = (int) firstName .get(firstName1);
				firstName .put(firstName1, tot + 1);
			}
			else {
				firstName .put(firstName1, 1);
			}
			if (gender .containsKey(gender1)) {
				int tot = (int) gender .get(gender1);
				gender .put(gender1, tot + 1);
			}
			else {
				gender .put(gender1, 1);
			}
			if (locationType .containsKey(locationType1)) {
				int tot = (int) locationType .get(locationType1);
				locationType .put(locationType1, tot + 1);
			}
			else {
				locationType .put(locationType1, 1);
			}
			if (lastName .containsKey(lastName1)) {
				int tot = (int) lastName .get(lastName1);
				lastName .put(lastName1, tot + 1);
			}
			else {
				lastName .put(lastName1, 1);
			}
			if (primaryCharge .containsKey(primaryCharge1)) {
				int tot = (int) primaryCharge .get(primaryCharge1);
				primaryCharge .put(primaryCharge1, tot + 1);
			}
			else {
				primaryCharge .put(primaryCharge1, 1);
			}
		}
		qucikSortCount("Arrest Date", arrestDate);
	}
	private static void qucikSortCount(String name, TreeMap<String, Integer> map) {
		TreeMap<String, Integer> countSort = new TreeMap<String, Integer>();
		for (String str : map.keySet()) {
			String key = "" + map.get(str) + "pi" + str;
			countSort.put(key, map.get(str));
		}
		for (String str : countSort.keySet()) {
			System.out.println(str.substring(str.indexOf("pi") + 2) + " : " + countSort.get(str));
		}
	}
}
