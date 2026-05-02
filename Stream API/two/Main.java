package com.SreamAPI.Two;
import java.util.*;
import java.util.stream.*;
public class Main {
    static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr.Raj", "Cardiology", true),
                new Doctor("Dr.Shekh", "Neurology", false),
                new Doctor("Dr.Ajad", "Orthopedics", true),
                new Doctor("Dr.Langda Umesh", "Dermatology", true),

        );
        List<Doctor> availableDoctors = doctors.stream()
                .filter(d -> d.availableOnWeekend)
                .sorted((d1, d2) -> d1.specialty.compareTo(d2.specialty))
                .collect(Collectors.toList());
        availableDoctors.forEach(System.out::println);
    }
}