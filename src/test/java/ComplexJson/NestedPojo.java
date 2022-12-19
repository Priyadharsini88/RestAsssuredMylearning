package ComplexJson;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NestedPojo {
	private String companyName;
	private String companyHOCity;
	private String companyCEO;
	private List<String> supportedSalaryBanks;
	private List<Integer> pincodesOfCityOffice;
	List<Employee> employee;
	List<Contractors> contractors;
	CompanyPFDetails companyPFDetails;
}
