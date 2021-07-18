package com.example.firstapplication.SpringBootRestService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.firstapplication.SpringBootRestService.repository")
public class SpringBootRestServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestServiceApplication.class, args);
	}

	//@Override
//	public void run(String[] args)
//	{
//		Library lib= repository.findById("fdsefr343").get();
//		System.out.println(lib.getAuthor());
//		Library en =new Library();
//		en.setAisle(123);
//		en.setAuthor("Rahul");
//		en.setBook_name("Devops");
//		en.setIsbn("lkhs");
//		en.setId("lkhs123");
//		//repository.save(en);
//		List<Library> allrecords =repository.findAll();
//		//
//		for(Library item : allrecords)
//		{
//			System.out.println(item.getBook_name());
//		}
//		repository.delete(en);
//
//		}



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}



}
