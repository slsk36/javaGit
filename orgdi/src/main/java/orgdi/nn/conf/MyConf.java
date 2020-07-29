package orgdi.nn.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import orgdi.nn.org.A;

@Configuration
public class MyConf {

	
	@Bean
	public A a() {
		return new A();
	}
}
