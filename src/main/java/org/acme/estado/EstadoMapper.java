package org.acme.estado;

import org.acme.estado.dto.EstadoInputDTO;
import org.acme.estado.dto.EstadoOutputDTO;
import org.acme.estado.infra.EstadoEntity;
import org.acme.pais.PaisMapper;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = MappingConstants.ComponentModel.CDI, uses = PaisMapper.class)
public interface EstadoMapper {

    Estado toDomain(EstadoEntity entity);

    @Mapping(target = "paisId", source = "pais.id")
    @Mapping(target = "pais", ignore = true)
    @Mapping(target = "campos", ignore = true)
    EstadoEntity toEntity(Estado domain);

    EstadoOutputDTO toOutputDTO(Estado domain);

    @Mapping(target = "pais", ignore = true)
    Estado toDomain(EstadoInputDTO dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "pais", ignore = true)
    void updateDomainFromInput(EstadoInputDTO dto, @MappingTarget Estado domain);
}
