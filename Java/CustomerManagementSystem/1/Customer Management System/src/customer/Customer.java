package customer;
import java.time.LocalDate;

public class Customer {
		private int id;
		private String fName;
		private String lName;
		private String email;
		private String password;
		private double registrationAmount;
		private LocalDate dob;
		private static int idGenerator=1;
		private ServicePlan plan;
		
		public Customer( String fName, String lName, String email, String password, double registrationAmount,LocalDate dob,ServicePlan s) {
			super();
			this.id = idGenerator++;
			this.fName = fName;
			this.lName = lName;
			this.email = email;
			this.password = password;
			this.registrationAmount = registrationAmount;
			this.dob = dob;
			this.plan=s;
			
		}
				
		public Customer(String email) {
			this.email=email;
		}
		
		public void getCustomer() {
			System.out.println(id+" "+fName+" "+lName+" "+email+" "+password+" "+registrationAmount+" "+dob+" "+plan);
		}
		
		public String getPassword() {
			return this.password;
		}
		public void setPassword(String newPassword) {
			this.password=newPassword;
		}
		
		@Override
		public boolean equals(Object o) {
			if(o instanceof Customer) {
				Customer c=(Customer)o;
				return this.email.equals(c.email);
			}
			return false;
		}
	//will you need to override toString n equals ?
}
