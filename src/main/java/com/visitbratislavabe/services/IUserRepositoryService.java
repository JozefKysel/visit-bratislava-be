package com.visitbratislavabe.services;

import com.visitbratislavabe.dbmodels.UserDto;

public interface IUserRepositoryService {

	UserDto save(UserDto user);

	UserDto findById(Long userId);

}
