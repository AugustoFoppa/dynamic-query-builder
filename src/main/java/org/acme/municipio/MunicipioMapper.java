package org.acme.municipio;

import org.acme.estado.EstadoMapper;
import org.acme.municipio.dto.MunicipioInputDTO;
import org.acme.municipio.dto.MunicipioOutputDTO;
import org.acme.municipio.infra.MunicipioEntity;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = MappingConstants.ComponentModel.CDI, uses = EstadoMapper.class)
public interface MunicipioMapper {

    Municipio toDomain(MunicipioEntity entity);

    @Mapping(target = "estadoId", source = "estado.id")
    @Mapping(target = "estado", ignore = true)
    @Mapping(target = "campos", ignore = true)
    MunicipioEntity toEntity(Municipio domain);

    MunicipioOutputDTO toOutputDTO(Municipio domain);

    @Mapping(target = "estado", ignore = true)
    Municipio toDomain(MunicipioInputDTO dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "estado", ignore = true)
    void updateDomainFromInput(MunicipioInputDTO dto, @MappingTarget Municipio domain);
}
