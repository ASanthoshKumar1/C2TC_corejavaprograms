package Assignment02;

public class Assignment2Main {
    public static void main(String[] args) {
        // Creating Student object → default constructor message will be shown
        Student s1 = new Student();

        // Creating Commission object
        Commission emp = new Commission();
        emp.acceptDetails();      // input details
        emp.calculateCommission(); // calculate and display commission
    }
}
