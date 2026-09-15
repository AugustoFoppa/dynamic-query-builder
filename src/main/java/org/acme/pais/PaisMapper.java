package org.acme.pais;

import org.acme.pais.dto.PaisInputDTO;
import org.acme.pais.dto.PaisOutputDTO;
import org.acme.pais.infra.PaisEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = MappingConstants.ComponentModel.CDI)
public interface PaisMapper {

    Pais toDomain(PaisEntity entity);

    PaisEntity toEntity(Pais domain);

    PaisOutputDTO toOutputDTO(Pais domain);

    Pais toDomain(PaisInputDTO dto);

    @org.mapstruct.BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateDomainFromInput(PaisInputDTO dto, @MappingTarget Pais domain);
}
