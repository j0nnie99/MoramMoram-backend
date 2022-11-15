package kusitms.candoit.MoramMoramServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MoramMoramServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoramMoramServerApplication.class, args);
	}

}
