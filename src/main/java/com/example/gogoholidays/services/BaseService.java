package com.example.gogoholidays.services;

import java.util.List;

public interface BaseService <DTO,ID,TForm>{
    List<DTO> getAll();
    DTO add(TForm toAdd);
    DTO remove(ID id);
    DTO uptate(ID id);
    DTO findOne(ID id);
}
