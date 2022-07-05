package com.example.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	@Autowired
	Laptop l;
	public void code()
	{
		System.out.println("I am coding ..");
		l.compile();
	}

}
