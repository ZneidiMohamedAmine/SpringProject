package com.esprit.firstspringbootproject.service;

import com.esprit.firstspringbootproject.entities.Bloc;
import com.esprit.firstspringbootproject.repository.IBlocRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BlocService implements IBlocService{



    private final IBlocRepository blocrep;

    @Override
    public Bloc addBloc(Bloc bl)
    {
        return blocrep.save(bl);
    }

    @Override
    public  Bloc removeBloc(Bloc bl)
    {
        blocrep.delete(bl);
        return null;
    }
}
