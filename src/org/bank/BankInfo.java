package org.bank;

public class BankInfo extends AxisBank {
	public void savings() {
		System.out.println("Savings");
	}
	public void fixed() {
		System.out.println("Fixed");
		
	}
	public static void main(String[] args) {
		BankInfo l = new BankInfo();
		l.savings();
		l.fixed();
		l.deposit();
				
	}
		
	}


