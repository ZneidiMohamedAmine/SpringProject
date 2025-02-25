package com.esprit.firstspringbootproject.service;

import com.esprit.firstspringbootproject.entities.Bloc;
import com.esprit.firstspringbootproject.repository.IBlocRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface IBlocService {

    Bloc addBloc(Bloc bl);

    Bloc removeBloc(Bloc bl);
}
