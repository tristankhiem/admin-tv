package tranvivan.phanlop.quanlysinhvien;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan(basePackageClasses = {
//		QuanlysinhvienApplication.class
//})
public class QuanlysinhvienApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuanlysinhvienApplication.class, args);
	}

}
