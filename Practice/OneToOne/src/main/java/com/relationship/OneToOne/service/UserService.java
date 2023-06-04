package com.relationship.OneToOne.service;

import com.relationship.OneToOne.dto.request.UserRequestDto;
import com.relationship.OneToOne.dto.response.UserResponseDto;

import java.util.List;

public interface UserService {
    UserResponseDto userSave(UserRequestDto addr);

    UserResponseDto getById(Integer id);

    List<UserResponseDto> getAll();
}
