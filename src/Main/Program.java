package Main;

import Objects.*;

import javax.print.Doc;

public class Program {
    public static void main(String[] args) {
        // Hospital Info
        System.out.println("-=-=-=-=-[Simple program that show an Hospital's Properties]-=-=-=-=-\n");
        System.out.println("[About Hospital]");
        // Hospital Instance
        Hospital hospital = new Hospital(
                "Martim",
                5,
                6);

        // Doc Instance
        Doctor doc1 = new Doctor(
                "Hans Chucrutes",
                "Surgeon",
                39,
                18
        );

        // Patients
        Patient p1 = new Patient(doc1,
                "Orlanda",
                "P-444.555",
                "Diabetes",
                 45);

        // Prints
        System.out.println(hospital);
        System.out.println(p1);
    }
}
