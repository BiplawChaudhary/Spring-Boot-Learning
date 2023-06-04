package com.relationship.OneToOne.service.impl;

import com.relationship.OneToOne.dto.request.UserRequestDto;
import com.relationship.OneToOne.dto.response.UserResponseDto;
import com.relationship.OneToOne.entity.Address;
import com.relationship.OneToOne.entity.User;
import com.relationship.OneToOne.repo.AddressRepo;
import com.relationship.OneToOne.repo.UserRepo;
import com.relationship.OneToOne.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final AddressRepo addressRepo;
    private final UserRepo userRepo;

    @Override
    public UserResponseDto userSave(UserRequestDto addr) {
        User newUser = new User();

        newUser.setName(addr.getName());

        Address found_addr = addressRepo.findById(addr.getAddress_id()).get();

        newUser.setAddress(found_addr);

        User savedUser = userRepo.save(newUser);
        return new UserResponseDto(savedUser);

    }

    @Override
    public UserResponseDto getById(Integer id) {
        return new UserResponseDto(userRepo.findById(id).get());
    }

    @Override
    public List<UserResponseDto> getAll() {
        List<UserResponseDto> returnList = new ArrayList<>();

        List<User> allData = userRepo.findAll();

        for(User each: allData){
            returnList.add(new UserResponseDto(each));
        }
        return returnList;
    }
}
