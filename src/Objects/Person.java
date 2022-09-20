package Objects;


public class Person {

    Doctor doctor;

    public Person(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "\nCase Doctor: " + doctor.getDocName();
    }
}