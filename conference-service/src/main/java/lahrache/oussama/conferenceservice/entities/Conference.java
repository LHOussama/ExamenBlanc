package lahrache.oussama.conferenceservice.entities;
import lahrache.oussama.conferenceservice.enums.Type;
import lahrache.oussama.conferenceservice.model.Keynote;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter @Builder @ToString
public class Conference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    @Enumerated(EnumType.STRING)
    private Type type;
    private LocalDate date;
    private int duree;
    private int nombreInscrits;
    private double score;
    @Transient
    private List<Keynote> keynotes;
}