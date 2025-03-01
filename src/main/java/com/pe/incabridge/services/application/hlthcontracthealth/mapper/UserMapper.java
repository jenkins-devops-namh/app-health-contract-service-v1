package com.pe.incabridge.services.application.hlthcontracthealth.mapper;

import com.pe.incabridge.services.application.hlthcontracthealth.model.api.UserResponse;
import com.pe.incabridge.services.application.hlthcontracthealth.model.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface UserMapper {

    /**
     * Transforms a UserEntity to a UserResponse.
     * @param userEntity the source UserEntity
     * @return a UserResponse with fields mapped from the UserEntity, null if source is null
     */

    UserResponse toUserResponse(UserEntity userEntity);

    // Example of a default method that could handle additional logic
    default UserResponse mapWithDefault(UserEntity userEntity) {
        if (userEntity == null) {
            return null; // or throw new IllegalArgumentException("userEntity cannot be null");
        }
        UserResponse response = toUserResponse(userEntity);
        // Additional transformations or default settings
        if (response.getUsuario() == null) {
            response.setUsuario("defaultUsername");
        }
        return response;
    }
}
