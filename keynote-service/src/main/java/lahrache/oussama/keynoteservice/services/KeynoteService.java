package lahrache.oussama.keynoteservice.services;

import lahrache.oussama.keynoteservice.dtos.KeynoteDTO;

import java.util.List;
import java.util.Optional;

public interface KeynoteService {
    List<KeynoteDTO> getAllKeynotes();
    Optional<KeynoteDTO> getKeynoteById(String id);
    KeynoteDTO createKeynote(KeynoteDTO keynoteDTO);
    void deleteKeynote(String id);
    KeynoteDTO updateKeynote(KeynoteDTO keynoteDTO);
}
