package data.arrestData;

import java.sql.Timestamp;
import java.util.Date;

public class ArrestData {
	private Timestamp arrestDate;
	private Long arrestRecordNumber;
	private Timestamp birthDate;
	private String caseNumber;
	private String chargeTypeCD;
	private String factionNumber;
	private String fbiCode;
	private Long fingerprintID;
	private String firstName;
	private String gender;
	private String locationType;
	private String lastName;
	private String primaryCharge;
	public ArrestData() {}
	public ArrestData(Timestamp arrestDate, Long arrestRecordNumber, Timestamp birthDate, String caseNumber, String chargeTypeCD,
			String factionNumber, String fbiCode, Long fingerprintID, String firstName, String gender,
			String locationType, String lastName, String primaryCharge) {
		super();
		this.arrestDate = arrestDate;
		this.arrestRecordNumber = arrestRecordNumber;
		this.birthDate = birthDate;
		this.caseNumber = caseNumber;
		this.chargeTypeCD = chargeTypeCD;
		this.factionNumber = factionNumber;
		this.fbiCode = fbiCode;
		this.fingerprintID = fingerprintID;
		this.firstName = firstName;
		this.gender = gender;
		this.locationType = locationType;
		this.lastName = lastName;
		this.primaryCharge = primaryCharge;
	}
	public Date getArrestDate() {
		return arrestDate;
	}
	public Long getArrestRecordNumber() {
		return arrestRecordNumber;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public String getCaseNumber() {
		return caseNumber;
	}
	public String getChargeTypeCD() {
		return chargeTypeCD;
	}
	public String getFactionNumber() {
		return factionNumber;
	}
	public String getFbiCode() {
		return fbiCode;
	}
	public Long getFingerprintID() {
		return fingerprintID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getGender() {
		return gender;
	}
	public String getLocationType() {
		return locationType;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPrimaryCharge() {
		return primaryCharge;
	}
	public void setArrestDate(Timestamp arrestDate) {
		this.arrestDate = arrestDate;
	}
	public void setArrestRecordNumber(Long arrestRecordNumber) {
		this.arrestRecordNumber = arrestRecordNumber;
	}
	public void setBirthDate(Timestamp birthDate) {
		this.birthDate = birthDate;
	}
	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}
	public void setChargeTypeCD(String chargeTypeCD) {
		this.chargeTypeCD = chargeTypeCD;
	}
	public void setFactionNumber(String factionNumber) {
		this.factionNumber = factionNumber;
	}
	public void setFbiCode(String fbiCode) {
		this.fbiCode = fbiCode;
	}
	public void setFingerprintID(Long fingerprintID) {
		this.fingerprintID = fingerprintID;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPrimaryCharge(String primaryCharge) {
		this.primaryCharge = primaryCharge;
	}
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("Arrest Record Number : " + this.arrestRecordNumber);
		str.append("\nArrest Date : " + this.arrestDate);
		str.append("\nLocation Type : " + this.locationType);
		str.append("\nFingerprint ID : " + this.fingerprintID);
		str.append("\nFirst Name : " + this.firstName);
		str.append("\nLast Name : " + this.lastName);
		str.append("\nBirth Date : " + this.birthDate);
		str.append("\nGender : " + this.gender);
		str.append("\nFaction Number : " + this.factionNumber);
		str.append("\nPrimary Charge : " + this.primaryCharge);
		str.append("\nCharge Type CD : " + this.chargeTypeCD);
		str.append("\nFBI Code : " + this.fbiCode);
		str.append("\nCase Number : " + this.caseNumber);
		return str.toString();
	}
}
