/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.nullvaluepropertymapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT)
public interface CustomerDefaultMapper {

    CustomerDefaultMapper INSTANCE = Mappers.getMapper( CustomerDefaultMapper.class );

    @Mapping(source = "address", target = "homeDTO.addressDTO")
    void mapCustomer(Customer customer, @MappingTarget UserDTO userDTO);

    @Mapping(source = "houseNumber", target = "houseNo", defaultValue = "0")
    void mapCustomerHouse(Address address, @MappingTarget AddressDTO addrDTO);

}

