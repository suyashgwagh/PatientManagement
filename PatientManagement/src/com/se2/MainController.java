package com.se2;

import java.util.Scanner;

import com.se2.crud.PatientsCrud;

public class MainController {
	public static void main(String[] args) {
		PatientsCrud temp = new PatientsCrud();
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		while (!flag) {
			System.out.println("Patient Management\n");
			System.out.println("1.Add Patient\n");
			System.out.println("2.View Patient\n");
			System.out.println("3.Search Patient\n");
			System.out.println("4.Edit Patient\n");
			System.out.println("5.Delete Patient\n");
			System.out.println("6.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Patient Details\n");
				int no = sc.nextInt();
				sc.nextLine();
				String name = sc.nextLine();
				String dob = sc.nextLine();
				String gen = sc.nextLine();
				String bg = sc.nextLine();
				String add = sc.nextLine();
				String mob = sc.nextLine();
				temp.insert(no, name, dob, gen, bg, add, mob);
				break;
			case 2:
				temp.read();
				break;
			case 3:
				System.out.println("Enter registration number of patient\n");
				int key = sc.nextInt();
				temp.readbyid(key);
				break;
			case 4:
				System.out.println("Enter registration number\n");
				int key3 = sc.nextInt();
				temp.readbyid(key3);
				System.out.println("Enter upadted data");
				int no1 = sc.nextInt();
				sc.nextLine();
				String name1 = sc.nextLine();
				String dob1 = sc.nextLine();
				String gen1 = sc.nextLine();
				String bg1 = sc.nextLine();
				String add1 = sc.nextLine();
				String mob1 = sc.nextLine();
				temp.update(key3, name1, dob1, gen1, bg1, add1, mob1, key3);
				break;
			case 5:
				System.out.println("Enter registration number to delete\n");
				int key1 = sc.nextInt();
				temp.delete(key1);
				break;
			case 6:
				flag = false;
				break;
			default:
				System.out.println("Wrong input");
				break;
			}
		}

	}
}
