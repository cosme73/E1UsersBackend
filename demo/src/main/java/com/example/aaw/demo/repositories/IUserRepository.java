package com.example.aaw.demo.repositories;

import com.example.aaw.demo.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRepository extends JpaRepository<Usuario, Integer> {
    List<Usuario> findByName(String name);

    //cantidad total de usuarios
    @Query(value = " select count(U.id_user) from Usuario U", nativeQuery = true)
    int cantUsuarios();
    //Lista de usuarios con mas de 3 juegos
    @Query(value = " select * from Usuario u where u.cant_game > 3", nativeQuery = true)
     List<Usuario> listacant3() ;
    //cantidad de usuarios por deporte
    @Query(value = "SELECT u.sport, COUNT(u.id_user) FROM Usuario u WHERE u.sport = :sport GROUP BY u.sport", nativeQuery = true)
    List<Object[]> countUsuariosPorDeporte(@Param("sport") String sport);
    //lista de usuarios por deporte forma 1
    @Query(value = "SELECT *  FROM Usuario u WHERE u.sport = :sport", nativeQuery = true)
    List<Object[]> listadeusersDeporte(@Param("sport") String sport);

    //lista de usuarios por deporte forma 2
    @Query(value = "SELECT *  FROM Usuario u WHERE u.sport = :sport", nativeQuery = true)
    List<Usuario> listadeusersDeporte2(@Param("sport") String sport);
}
