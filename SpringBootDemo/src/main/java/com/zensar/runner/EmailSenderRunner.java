package com.zensar.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Order(2)
public class EmailSenderRunner implements ApplicationRunner, Ordered{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		String myArgs[]=args.getSourceArgs();
		System.out.println("Inside Email runner");
		for(String arg:myArgs)
			System.out.println(arg);
		
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
