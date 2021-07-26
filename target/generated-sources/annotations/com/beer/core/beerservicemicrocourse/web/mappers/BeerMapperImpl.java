package com.beer.core.beerservicemicrocourse.web.mappers;

import com.beer.core.beerservicemicrocourse.domain.Beer;
import com.beer.core.beerservicemicrocourse.web.model.BeerDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-26T13:36:29-0500",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 15.0.2 (N/A)"
)
@Component
public class BeerMapperImpl implements BeerMapper {

    @Override
    public BeerDto BeerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDto beerDto = new BeerDto();

        return beerDto;
    }

    @Override
    public Beer BeerDtoToBeer(BeerDto beerDto) {
        if ( beerDto == null ) {
            return null;
        }

        Beer beer = new Beer();

        return beer;
    }
}
