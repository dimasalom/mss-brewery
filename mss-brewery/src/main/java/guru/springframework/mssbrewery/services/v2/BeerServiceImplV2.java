package guru.springframework.mssbrewery.services.v2;

import guru.springframework.mssbrewery.web.model.v2.BeerDtoV2;
import guru.springframework.mssbrewery.web.model.v2.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImplV2 implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(UUID.randomUUID()).beerStyle(BeerStyle.ALE).build();
    }

    @Override
    public BeerDtoV2 saveBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder().id(UUID.randomUUID()).beerStyle(BeerStyle.GOSE).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        log.debug("Updating...");
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("Deleting...");
    }
}
