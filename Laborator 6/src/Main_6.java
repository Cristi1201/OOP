import java.util.ArrayList;

class Person {
	String title;
	String givenName;
	String middleName;
	String familyName;
	String name = givenName + " " + middleName + " " + familyName;
	String Date;
	String gender;
	String homeAddress;
	String phone;
	ArrayList<Hospital> hospital;
}

class Hospital {
	String name;
	String address;
	String phone;
	ArrayList<Person> person;
	Department department;
}

class Patient extends Person {
	String id;
	String name;
	String gender;
	String birthDate;
	int    age;
	String acceptDate;
	String sicknessHistory;
	String prescriptions;
	String allergies;
	String specialReqs;
	ArrayList<OperationStaff> operationStaff;
}

class Department extends Hospital {
	public ArrayList<Hospital> hospital;
	Staff staff;
}
class Staff extends Person {
	String joined;
	String education;
	String certification;
	String languages;
	ArrayList<Department> department;
}

class OperationStaff extends Staff {
	ArrayList<Patient> patient;
}

class Doctor extends OperationStaff {
	String specialty;
	String locations;
}
class Surgeon extends Doctor {}
class Nurse extends OperationStaff {}

class AdministrativeStaff extends Staff {}
class FrontDeskStaff extends AdministrativeStaff {}
class Receptionist extends FrontDeskStaff {}

class TechnicalStaff extends Staff {}
class Technician extends TechnicalStaff {}
class Technologist extends TechnicalStaff {}
class SurgicalTechnologist extends Technologist {}


public class Main_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
