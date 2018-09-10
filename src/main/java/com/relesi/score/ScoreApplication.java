package com.relesi.score;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.relesi.score.services.S3Service;

@SpringBootApplication
public class ScoreApplication implements CommandLineRunner {

	@Autowired
	private S3Service s3Service;
	
	public static void main(String[] args) {
		SpringApplication.run(ScoreApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		s3Service.uploadFile("C:\\temp\\fotos\\escritorio1.jpg");
		
	}
}
