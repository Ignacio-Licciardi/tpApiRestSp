package com.utn.tpApiRestSp.services;

import com.utn.tpApiRestSp.entities.Localidad;
import com.utn.tpApiRestSp.repositories.BaseRepository;
import com.utn.tpApiRestSp.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }


}
