package com.depotgenius.core.config.mappers;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {

	ModelMapper forResponse();

	ModelMapper forRequest();
}
