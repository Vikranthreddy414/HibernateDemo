package model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int custId;
		private String custName;
		private int custAge;
		
		public Customer() {
			
		}
		
		public Customer(String custName, int custAge) {
			super();
			this.custName = custName;
			this.custAge = custAge;
		}
		public int getCustId() {
			return custId;
		}
		public void setCustId(int custId) {
			this.custId = custId;
		}
		public String getCustName() {
			return custName;
		}
		public void setCustName(String custName) {
			this.custName = custName;
		}
		public int getCustAge() {
			return custAge;
		}
		public void setCustAge(int custAge) {
			this.custAge = custAge;
		}
		
		
		
}
