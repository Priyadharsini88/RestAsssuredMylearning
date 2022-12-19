package ComplexJson;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyPFDetails {
	
	private String pfName;
	private String pfCity;
	private int pfYear;
	private int noOfEmployees;
	
	public String getPfName() {
		return pfName;
	}
	public void setPfName(String pfName) {
		this.pfName = pfName;
	}
	public String getPfCity() {
		return pfCity;
	}
	public void setPfCity(String pfCity) {
		this.pfCity = pfCity;
	}
	public int getPfYear() {
		return pfYear;
	}
	public void setPfYear(int pfYear) {
		this.pfYear = pfYear;
	}
	public int getNoOfEmployees() {
		return noOfEmployees;
	}
	public void setnoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

}