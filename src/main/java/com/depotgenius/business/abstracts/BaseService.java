package com.depotgenius.business.abstracts;

import java.util.UUID;

public interface BaseService<T> {

	T Create(T entity);

	T Update(T entity);

	void delete(UUID id);
}
