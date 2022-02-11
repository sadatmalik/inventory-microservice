package com.sadatmalik.inventoryservice.web.mappers;

import com.sadatmalik.brewery.model.BeerInventoryDto;
import com.sadatmalik.inventoryservice.domain.BeerInventory;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
