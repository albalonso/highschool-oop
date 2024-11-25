package org.ies.highschool;

import org.ies.highschool.components.StudentReader;
import org.ies.highschool.model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            // Crear el componente StudentReader
            StudentReader studentReader = new StudentReader(scanner);

            // Leer los datos del estudiante
            Student student = studentReader.read();

            // Mostrar la información del estudiante
            student.info();
        }
    }
