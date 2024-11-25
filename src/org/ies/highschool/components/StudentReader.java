package org.ies.highschool.components;

import org.ies.highschool.model.Student;

import java.util.Scanner;

public class StudentReader {
    private final Scanner scanner;

    public StudentReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Student read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce los apellidos del estudiante: ");
        String apellidos = scanner.nextLine();

        System.out.print("Introduce la dirección del estudiante: ");
        String direccion = scanner.nextLine();

        // Crear y devolver el objeto Student
        return new Student(nombre, apellidos, direccion);
    }
}



