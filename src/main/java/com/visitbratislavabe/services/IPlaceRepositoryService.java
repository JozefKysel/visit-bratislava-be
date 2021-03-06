package com.visitbratislavabe.services;

import com.visitbratislavabe.models.Place;

import java.util.List;

public interface IPlaceRepositoryService {

	List<Place> getByCategory(String category);

	List<Place> saveAll(List<Place> places);

}
