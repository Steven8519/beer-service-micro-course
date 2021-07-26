package com.beer.core.beerservicemicrocourse.repository;

import com.beer.core.beerservicemicrocourse.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
