package com.example.gogoholidays.mapper;

public interface BaseMapper <TDTO,TFORM,TENTITY>{
    TDTO toDto(TENTITY entity);
    TENTITY formToEntity(TFORM form);
}
