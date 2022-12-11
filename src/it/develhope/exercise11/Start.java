package it.develhope.exercise11;

import java.util.Arrays;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        House house = new House();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please set the floors number: ");
        house.floorsNumber = (scanner.nextInt());

        System.out.println("Please set the address: ");
        house.address = (scanner.next());

        System.out.println("Please set the resident names:");
        house.residentsNames = (scanner.next().split(","));


        System.out.println(String.format("This house has %d floors", house.getFloorsNumber()));
        System.out.println(String.format("The address of this house is %s", house.getAddress()));
        System.out.println(String.format("The residents names are %s", Arrays.toString(house.getResidentsNames())));
    }
}
