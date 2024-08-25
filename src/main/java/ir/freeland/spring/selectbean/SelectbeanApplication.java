package ir.freeland.spring.selectbean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ir.freeland.spring.selectbean.service.BankiranServices;
@SpringBootApplication
public class SelectbeanApplication {

	@SuppressWarnings("resource")
	@Autowired
	private BankiranServices bankiranServices ;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_selectbean.xml");
		BankiranServices  bankiranServices = context.getBean(BankiranServices.class);
		bankiranServices.accountTransaction("136-800-384123");
		
	}

}
