package guru.springframework.mssbrewery.services;

import guru.springframework.mssbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID()).beerName("Pale Ale").build();
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {

        return BeerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("Delete a beer...");
    }
}
