package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person{

    private double GPA;
    private String address;

    public Student(String name, short age) {
        super(name, age);
    }

    /**
     * Get the address of the current student.
     * @return The address of the student. "None" if address is currently null.
     */

    @Override
    public String getAddress() {
        return this.address == null ? "None": this.address;
    }

    /**
     * Set the new address of the student.
     * @param address Set the address of the student
     */

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     Method gets the GPA of the student
     @return Student.GPA
     */
    public double getGPA() {
        return this.GPA;
    }

    /**
     * Method sets the GPA of the student
     * @param GPA The new GPA of the student
     */

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String toString(){
        String info = "";

        info += "Student Name: " + super.getName() + "\n";
        info += "Age: " + super.getAge() + "\n";
        info += "Address: " + this.getAddress() + "\n";
        info += "Current GPA: " + this.GPA + "\n";

        return info;
    }

    // ToDo 1: Make this class a child of Person
	// DONE

	// ToDo 2: Fix the resulting errors
	// DONE

	// ToDo 3: Add a field for GPA and create setter and getter
	// DONE

	// ToDo 4: Add comments to your code
    // DONE

}