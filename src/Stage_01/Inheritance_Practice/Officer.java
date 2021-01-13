package Stage_01.Inheritance_Practice;

public class Officer extends Adult {

	String party;
	String duty;

	public String getParty() {
		return this.party;
	}

	public String getDuty() {
		return this.duty;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

}
