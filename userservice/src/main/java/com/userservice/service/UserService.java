package com.userservice.service;

import com.userservice.entity.ResponseDto;
import com.userservice.entity.User;

public interface UserService {
	User saveUser(User user);

    ResponseDto getUser(Long userId);
}
