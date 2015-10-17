package data.victimData;

import java.util.Date;

public class VictimData {
	private Date birthDate;
	private Long caseNumber;
	private Long fingerprintID;
	private String firstName;
	private String gender;
	private Date incidentDate;
	private String injuryDescription;
	private String lastName;
	private Long victimRecordNumber;
	public VictimData() {}
	public VictimData(Date birthDate, Long caseNumber, Long fingerprintID, String firstName, String gender,
			Date incidentDate, String injuryDescription, String lastName, Long victimRecordNumber) {
		super();
		this.birthDate = birthDate;
		this.caseNumber = caseNumber;
		this.fingerprintID = fingerprintID;
		this.firstName = firstName;
		this.gender = gender;
		this.incidentDate = incidentDate;
		this.injuryDescription = injuryDescription;
		this.lastName = lastName;
		this.victimRecordNumber = victimRecordNumber;
	}

	// Getters
	public Date getBirthDate() {
		return birthDate;
	}
	public Long getCaseNumber() {
		return caseNumber;
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
	public Date getIncidentDate() {
		return incidentDate;
	}
	public String getInjuryDescription() {
		return injuryDescription;
	}
	public String getLastName() {
		return lastName;
	}
	public Long getVictimRecordNumber() {
		return victimRecordNumber;
	}
	
	// Setters
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public void setCaseNumber(Long caseNumber) {
		this.caseNumber = caseNumber;
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
	public void setIncidentDate(Date incidentDate) {
		this.incidentDate = incidentDate;
	}
	public void setInjuryDescription(String injuryDescription) {
		this.injuryDescription = injuryDescription;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setVictimRecordNumber(Long victimRecordNumber) {
		this.victimRecordNumber = victimRecordNumber;
	}
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("Victim Record Number : " + this.victimRecordNumber);
		str.append("\nIncident Date : " + this.incidentDate);
		str.append("\nFingerprint ID : " + this.fingerprintID);
		str.append("\nFirst Name : " + this.firstName);
		str.append("\nLast Name : " + this.lastName);
		str.append("\nBirth Date : " + this.birthDate);
		str.append("\nGender : " + this.gender);
		str.append("\nInjury Description : " + this.injuryDescription);
		str.append("\nCase Number : " + this.caseNumber);
		return str.toString();
	}
}
