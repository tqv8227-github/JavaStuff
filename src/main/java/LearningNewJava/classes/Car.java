package LearningNewJava.classes;

public class Car extends Vehicle{

	@Override
	public void setLicensePlate(String license) {
        this.licensePlate = license.toLowerCase();
    }
	
	public String getLicensePlate() {
		return this.licensePlate;
	}
	
	public void printLicensePlate() {
		System.out.println("my license Plate: "+this.licensePlate);
	}
	
	
}
