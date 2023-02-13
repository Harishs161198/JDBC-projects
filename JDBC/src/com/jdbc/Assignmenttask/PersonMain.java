package com.jdbc.Assignmenttask;

public class PersonMain {
	public static void main(String[] args) {
		PersonCRUDOperation.savePerson(1, "R0hit", 9897346489L, 25, "Rohitborate2@gmail.com", "R0hi8345");
		PersonCRUDOperation.delatePerson(99);
		PersonCRUDOperation.getAllPerson();
		PersonCRUDOperation.ValidatePerson(9587756466L, "my7stme&tu.com");
		PersonCRUDOperation.ValidatePerson("my7stme&tu.com", "Pstss@123");
		PersonCRUDOperation.savePersonByid(5);
	}
}
