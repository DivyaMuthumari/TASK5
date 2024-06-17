package com.task5;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Localdate {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your birthdate (yyyy-mm-dd): ");
    String birthdate = scanner.nextLine();
    LocalDate birthDate = LocalDate.parse(birthdate);
    LocalDate currentDate = LocalDate.now();
    Period age = Period.between(birthDate, currentDate);

    System.out.printf("You are  %d years,%d months,and %d days old",age.getYears(),age.getMonths(),age.getDays());
}
}


