package lahrache.oussama.keynoteservice.repositories;

import lahrache.oussama.keynoteservice.entities.Keynote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeynoteRepository extends JpaRepository<Keynote, String> {
}