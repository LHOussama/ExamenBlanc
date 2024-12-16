package lahrache.oussama.conferenceservice.mappers;

import lahrache.oussama.conferenceservice.dtos.ConferenceDTO;
import lahrache.oussama.conferenceservice.entities.Conference;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ConferenceMapper {
    ConferenceMapper INSTANCE = Mappers.getMapper(ConferenceMapper.class);
    ConferenceDTO conferenceToConferenceDTO(Conference conference);
    Conference conferenceDTOToConference(ConferenceDTO conferenceDTO);
}
