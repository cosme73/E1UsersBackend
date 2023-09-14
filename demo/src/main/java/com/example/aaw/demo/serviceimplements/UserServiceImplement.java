package com.example.aaw.demo.serviceimplements;

import com.example.aaw.demo.entities.Usuario;
import com.example.aaw.demo.repositories.IUserRepository;
import com.example.aaw.demo.serviceinterfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private IUserRepository dR; //llamar metodos del framework

    @Override
    public void insert(Usuario user) {
        dR.save(user);

    }

    @Override
    public List<Usuario> list() {
        return dR.findAll();    }

    @Override
    public List<Usuario> findByName(String name) {
        return dR.findByName(name);
    }

    @Override
    public int cantUsuarios() {
        return dR.cantUsuarios();
    }

    @Override
    public List<Usuario> listacant3() {
        return dR.listacant3();
    }

    @Override
    public List<Object[]> countUsuariosPorDeporte(String sport) {
        return dR.countUsuariosPorDeporte(sport);
    }

    @Override
    public List<Object[]> listadeusersDeporte(String sport) {
        return dR.listadeusersDeporte(sport);
    }

    @Override
    public List<Usuario> listadeusersDeporte2(String sport) {
        return dR.listadeusersDeporte2(sport);
    }
}
