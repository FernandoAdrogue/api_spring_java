package com.spring.api.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data //El decorator data de lombok se encarga de crear todos los seter y geter del DTO
@RequiredArgsConstructor
public class Persona { //Esta clase representa el DTO de persona
    @NonNull
    private Long id;
    @NonNull
    private String name;
    @JsonIgnore
    private String lastname;

}
