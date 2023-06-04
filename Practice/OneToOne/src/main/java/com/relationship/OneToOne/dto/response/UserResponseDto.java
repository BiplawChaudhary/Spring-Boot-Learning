package com.relationship.OneToOne.dto.response;


import com.relationship.OneToOne.dto.request.UserRequestDto;
import com.relationship.OneToOne.entity.Address;
import com.relationship.OneToOne.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {
    private Integer id;
    private String name;
    private Address address;

    public UserResponseDto(User user){
        this.id = user.getId();
        this.name = user.getName();
        this.address = user.getAddress();
    }
}
