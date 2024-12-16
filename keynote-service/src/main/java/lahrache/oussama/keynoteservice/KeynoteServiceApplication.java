package lahrache.oussama.keynoteservice;

import lahrache.oussama.keynoteservice.entities.Keynote;
import lahrache.oussama.keynoteservice.repositories.KeynoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KeynoteServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeynoteServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KeynoteRepository keynoteRepository){
        return args -> {
            keynoteRepository.save(Keynote.builder().id("KN01").nom("KN01_nom").prenom("KN01_prenom").email("kn1@gmail.com").fonction("SPEAKER").build());
            keynoteRepository.save(Keynote.builder().id("KN02").nom("KN02_nom").prenom("KN02_prenom").email("kn1@gmail.com").fonction("ORGANIZER").build());
            keynoteRepository.save(Keynote.builder().id("KN03").nom("KN03_nom").prenom("KN03_prenom").email("kn1@gmail.com").fonction("MODERATOR").build());
        };

    }
}
