package lahrache.oussama.conferenceservice;

import lahrache.oussama.conferenceservice.entities.Conference;
import lahrache.oussama.conferenceservice.enums.Type;
import lahrache.oussama.conferenceservice.repositories.ConferenceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@SpringBootApplication
@EnableFeignClients
public class ConferenceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConferenceServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(
            ConferenceRepository conferenceRepository
    ){
        return args -> {
            List<String> keynotesIds = List.of("CONF1","CONF2","CONF3");
            keynotesIds.forEach(pId->{
                Conference conference = Conference.builder()
                        .titre("conference")
                        .type(Type.ACADEMIQUE)
                        .date(LocalDate.now())
                        .duree(new Random().nextInt(30))
                        .nombreInscrits((int)(Math.random()*1000))
                        .score((int)(Math.random()*100))
                        .build();
                conferenceRepository.save(conference);
            });
        };
    }
}
