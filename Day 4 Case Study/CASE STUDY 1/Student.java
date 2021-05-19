package casestudy;

public class Student extends Person {
	
		private String program;
		private int year;
		private double fees;
		
		public String getProgram() {
			return program;
		}
		public void setProgram(String program) {
			this.program = program;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public double getFees() {
			return fees;
		}
		public void setFees(double fees) {
			this.fees = fees;
		}
		
		public String toString() {
			return " program: "+
		this.program+", Year: "+this.year+", fees: "+this.fees;
		}
		
	}


