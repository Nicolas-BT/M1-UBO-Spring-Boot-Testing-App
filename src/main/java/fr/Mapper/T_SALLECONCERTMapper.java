package fr.Mapper;

import fr.dtos.T_SALLECONCERTDto;
import fr.entities.T_SALLECONCERT;

public interface T_SALLECONCERTMapper {

    T_SALLECONCERTDto toDo (T_SALLECONCERT salleconcert);
    T_SALLECONCERT toEntity(T_SALLECONCERTDto salleconcertDto);
}
