package com.utn.tpApiRestSp.services;

import com.utn.tpApiRestSp.entities.Autor;
import com.utn.tpApiRestSp.repositories.AutorRepository;
import com.utn.tpApiRestSp.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }



}
