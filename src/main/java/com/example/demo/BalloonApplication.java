package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BalloonApplication {

	public static void main(String[] args) {
		SpringApplication.run(BalloonApplication.class, args);
	}
    public int complexCalculation(int x, int y, int z) {
        int sum = add(x, y);
        int product = multiply(sum, z);

        // Intentionally introduce complexity by adding unnecessary code
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                product += i;
            } else {
                product -= i;
            }
        }

        return product;
    }
}



