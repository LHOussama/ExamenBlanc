package lahrache.oussama.conferenceservice.model;
import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Keynote {
    private String id;
    private String nom;
    private String prenom;
    private String email;
    private String fonction;
}
