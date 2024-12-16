package lahrache.oussama.conferenceservice.repositories;

import lahrache.oussama.conferenceservice.entities.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, String> {
}