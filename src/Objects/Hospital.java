package Objects;

public class Hospital {

    String hospitalName;
    int patientiesTotal;
    int devicesNumber;


    public Hospital(String hospitalName, int patientiesTotal, int devicesNumber) {
        this.hospitalName = hospitalName;
        this.patientiesTotal = patientiesTotal;
        this.devicesNumber = devicesNumber;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int getPatientiesTotal() {
        return patientiesTotal;
    }

    public void setPatientiesTotal(int patientiesTotal) {
        this.patientiesTotal = patientiesTotal;
    }

    public int getDevicesNumber() {
        return devicesNumber;
    }

    public void setDevicesNumber(int devicesNumber) {
        this.devicesNumber = devicesNumber;
    }

    @Override
    public String toString() {
        return "Welcome to System from Hospital " + hospitalName +
                "\nPatienties in Total: " + patientiesTotal +
                "\nDevices Number: " + devicesNumber;
    }
}
