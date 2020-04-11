package com.visitbratislavabe.services.utils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.visitbratislavabe.dbmodels.Place;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlacesResponseWrapper {

	public List<Place> data;

	public PlacesResponseWrapper() {
	}

}
