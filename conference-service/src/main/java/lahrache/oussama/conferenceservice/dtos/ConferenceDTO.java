package lahrache.oussama.conferenceservice.dtos;

import lahrache.oussama.conferenceservice.enums.Type;
import lahrache.oussama.conferenceservice.model.Keynote;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ConferenceDTO {
    private Long id;
    private String titre;
    private Type type;
    private LocalDate date;
    private int duree;
    private int nombreInscrits;
    private double score;
    private List<Keynote> keynotes;
}