package Main;

import Objects.*;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        // infos

        String bannerAbout = "Project by OAleex";

        // input
        System.out.println("-=-=-=-=-[Simple program that show an Hospital's Properties]-=-=-=-=-\n");
        String banner = "1 - Join\n2 - About";


        System.out.println("About the Entrance:");
        System.out.println(banner);



        try {
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input == 1) {
                // Hospital Info
                // Hospital Instance
                Hospital hospital = new Hospital(
                        "Martim",
                        5,
                        5);

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

            } else if (input == 2) {
                System.out.println(bannerAbout);
            } else {
                System.out.println("closed. . .");
            }
        }catch(InputMismatchException e){
            System.out.println("Digite apenas numeros");
        }
    }
}