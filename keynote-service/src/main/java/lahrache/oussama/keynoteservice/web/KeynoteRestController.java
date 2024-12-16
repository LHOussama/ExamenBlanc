package lahrache.oussama.keynoteservice.web;
import lahrache.oussama.keynoteservice.dtos.KeynoteDTO;
//import org.springframework.security.core.Authentication;
import lahrache.oussama.keynoteservice.services.KeynoteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class KeynoteRestController {
    private KeynoteService keynoteService;
    public KeynoteRestController(KeynoteService keynoteService) {
        this.keynoteService = keynoteService;
    }

    @GetMapping("/keynotes")
    public List<KeynoteDTO> keynoteList(){
        return keynoteService.getAllKeynotes();
    }

    @GetMapping("/keynotes/{id}")
    public KeynoteDTO keynoteById(@PathVariable String id){
        return keynoteService.getKeynoteById(id).get();
    }

    @PostMapping
    public KeynoteDTO createKeynote(@RequestBody KeynoteDTO keynoteDTO) {
        KeynoteDTO savedKeynote = keynoteService.createKeynote(keynoteDTO);
        return savedKeynote;
    }

    @PutMapping("/{id}")
    public KeynoteDTO updateKeynote(@PathVariable String id, @RequestBody KeynoteDTO keynoteDTO) {
        if (!keynoteService.getKeynoteById(id).isPresent()) {
            return null;
        }
        keynoteDTO.setId(id);
        KeynoteDTO updatedKeynote = keynoteService.updateKeynote(keynoteDTO);
        return updatedKeynote;
    }

    @DeleteMapping("/{id}")
    public void deleteKeynote(@PathVariable String id) {
        keynoteService.deleteKeynote(id);
    }


}
