package com.depotgenius.business.abstracts;

import java.util.UUID;

import com.depotgenius.entities.concretes.Shelf;

public interface ShelfService extends BaseService<Shelf> {

	Shelf getShelf(UUID shelfId);
}
