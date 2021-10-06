package start.spring.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student yoho = new Student(
                    1L,
                    "Yohovani",
                    "yohovanivargas@gmail.com",
                    LocalDate.of(1997, Month.MARCH,7)
            );
            Student perla = new Student(
                    2L,
                    "Perla",
                    "perlavargas@gmail.com",
                    LocalDate.of(2005, Month.JULY,20)
            );
            repository.saveAll(List.of(yoho,perla));
        };
    };
}
