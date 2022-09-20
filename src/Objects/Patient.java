package Objects;

public class Patient extends Person {


    String name;
    String code;
    String sickness;
    int age;


    public Patient(Doctor doctor, String name, String code, String sickness, int age) {
        super(doctor);
        this.name = name;
        this.code = code;
        this.sickness = sickness;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSickness() {
        return sickness;
    }

    public void setSickness(String sickness) {
        this.sickness = sickness;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "\n\nName: " + name  +
                "\nCode: " + code +
                "\nSickness: " + sickness +
                "\nAge: " + age +
                "\nCase Doctor: " + doctor.getDocName();
    }
}