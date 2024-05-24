package com.depotgenius.business.abstracts;

import java.util.UUID;

import com.depotgenius.dtos.shelf.CreateShelfRequest;
import com.depotgenius.dtos.shelf.DeleteShelfRequest;
import com.depotgenius.dtos.shelf.UpdateShelfRequest;
import com.depotgenius.entities.concretes.Shelf;

public interface ShelfService {

	Shelf create(CreateShelfRequest createShelfRequest);

	Shelf update(UpdateShelfRequest updateShelfRequest);

	void delete(DeleteShelfRequest deleteShelfRequest);

	Shelf getShelf(UUID shelfId);
}
