package props.Knowingpropertiesfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="props.Knowingpropertiesfile")
public class PropertiesRunner {

	public static void main(String[] args) {
		SpringApplication.run(PropertiesRunner.class, args);

	}

}
