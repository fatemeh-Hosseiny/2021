package ir.freeland.spring.usebean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UsebeanApplication {
  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(UsebeanApplication.class, args);

    InternetbankServices internetbankServices =context.getBean(InternetbankServices.class);
    internetbankServices.doCardToCard("1234.1234.1234.1234","1234.1234.1234.1234");
    }
}
