package com.example.mongodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoDemoApplication {

	public static void main(String[] args)
	{
		int x = 10;
		int y = 20;

		{
			System.out.print(x + ", " + y);
		}
		{
			System.out.print(" - " + x + ", " + y);
		}

		System.out.print(" - " + x + ", " + y);

		SpringApplication.run(MongoDemoApplication.class, args);
	}

}
