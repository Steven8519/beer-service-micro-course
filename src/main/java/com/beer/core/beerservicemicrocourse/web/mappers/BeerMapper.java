package com.beer.core.beerservicemicrocourse.web.mappers;

import com.beer.core.beerservicemicrocourse.domain.Beer;
import com.beer.core.beerservicemicrocourse.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {
    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto beerDto);
}
