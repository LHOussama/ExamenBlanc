package lahrache.oussama.keynoteservice.mappers;

import lahrache.oussama.keynoteservice.dtos.KeynoteDTO;
import lahrache.oussama.keynoteservice.entities.Keynote;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface   KeynoteMapper {
    KeynoteMapper INSTANCE = Mappers.getMapper(KeynoteMapper.class);
    KeynoteDTO keynoteToKeynoteDTO(Keynote keynote);
    Keynote keynoteDTOToKeynote(KeynoteDTO keynoteDTO);
}
