package com.example.divine.rose;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Who goes there?:");
		String name = sc.nextLine();

		sc.close();
		System.out.println("Hello " + name + " welcome to divine roose");
		
	}

}
