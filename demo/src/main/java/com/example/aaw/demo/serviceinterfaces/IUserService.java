package com.example.aaw.demo.serviceinterfaces;

import com.example.aaw.demo.entities.Usuario;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IUserService {
    public void insert(Usuario user);
    public List<Usuario> list();
    List<Usuario> findByName(String name);
     int cantUsuarios();
    List<Usuario> listacant3() ;
    List<Object[]> countUsuariosPorDeporte(String sport);
    List<Object[]> listadeusersDeporte(String sport);
    List<Usuario> listadeusersDeporte2( String sport);

}
