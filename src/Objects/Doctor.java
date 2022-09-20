package Objects;

public class Doctor {
    String docName;
    String Specialization;
    int age;
    int yearsOfService;

    public Doctor (String docName, String Specialization, int age, int yearsOfService) {
        this.docName = docName;
        this.Specialization = Specialization;
        this.age = age;
        this.yearsOfService = yearsOfService;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }
}

