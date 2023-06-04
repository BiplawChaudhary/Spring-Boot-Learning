package com.relationship.OneToOne.dto.response;


import com.relationship.OneToOne.entity.Address;
import com.relationship.OneToOne.repo.AddressRepo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponseDto {
    private Integer id;
    private String state;
    private String district;

    public AddressResponseDto(Address address){
        this.id = address.getId();
        this.state = address.getState();
        this.district = address.getDistrict();
    }
}
