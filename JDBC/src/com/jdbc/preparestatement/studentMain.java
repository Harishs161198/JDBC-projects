package com.jdbc.preparestatement;

public class studentMain {
	public static void main(String[] args) {

		StudentCRUDoperation.insert(9, "naish", 6.66);
		StudentCRUDoperation.update(7, "isha");
		StudentCRUDoperation.delete(2);
		StudentCRUDoperation.printAllData(99);
	}
}
