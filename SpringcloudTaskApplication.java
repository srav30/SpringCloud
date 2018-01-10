package springboot.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class SpringcloudTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudTaskApplication.class, args);
	}
	
	@Bean
	public TollProcessingTask tollProcessingTask(){
		return new TollProcessingTask();
	}
	
	public class TollProcessingTask implements CommandLineRunner{

		@Override
		public void run(String... strings) throws Exception {
			if(null != strings){
				System.out.println("parameter length is : "+strings.length);
				
//				spring.application.name=Toll Processor
//						logging.level.org.springframework.cloud.task=DEBUG
//				
				
				
//				String stationId = strings[1];
//				String licensePlate = strings[2];
//				String timestamp = strings[3];
				
//				System.out.println("Station ID is" +stationId+ "plate is"+licensePlate+"  time stamp is: "+timestamp);
			}
			
		}
	}
	
}
