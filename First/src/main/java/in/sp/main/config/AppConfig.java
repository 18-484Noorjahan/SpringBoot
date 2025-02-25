package in.sp.main.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.main.bean.Student;

@Configuration
public class AppConfig {
	
	@Bean
	public CommandLineRunner cmdLineRunner()
	{
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				stdBean().displayStdDetails();
				System.out.println();
				stdBean1().displayStdDetails();
				
			}
			
		};
	}
	
	@Bean
	public Student stdBean()
	{
		return new Student("noorjahan",121,33.33f);
	}
	@Bean
	public Student stdBean1()
	{
		return new Student("noor",1121,323.33f);
	}

}
