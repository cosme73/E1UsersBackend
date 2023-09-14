package com.example.aaw.demo.controllers;

import com.example.aaw.demo.dtos.UserDTO;
import com.example.aaw.demo.entities.Usuario;
import com.example.aaw.demo.serviceinterfaces.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController //insertar @Res -> anotacion
@RequestMapping("/desserts")// permite traer un url
public class UserController {
    @Autowired// inyeccion de independencias
    private IUserService dS;// enlasa mi capa contorladora con mi capa service
    @PostMapping// para un nuevo registro
    public void registrar(@RequestBody UserDTO dto) {
        ModelMapper m = new ModelMapper();  //si sale error alt + enter (bloquean la descarga del maven)
        Usuario d = m.map(dto, Usuario.class);
        dS.insert(d);
    }
    @GetMapping // por que se trae datos que existen
    public List<UserDTO> listar(){ //DTO hace todos los cambios , ademas podemos seguir añadiendo atributos
        return dS.list().stream().map(x->{
            //para ca "x" se transforma
            ModelMapper m=new ModelMapper();
            return m.map(x,UserDTO.class);

        }).collect(Collectors.toList());
    }
//buscar un usuario  por su nombre
    @PostMapping("/bucarNombre")
    public List<UserDTO> buscar(@RequestBody String nombre){
        return dS.findByName(nombre).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UserDTO.class);

        }).collect(Collectors.toList());
    }
    //cantidad total de usuarios
    @GetMapping("/cantTotal")
    public int cantidadUsers(){
        return dS.cantUsuarios();
    }
    //Lista de usuarios con mas de 3 juegos
    @GetMapping("/listausuarios3")
    public List<UserDTO> buscar3(){
        return dS.listacant3().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }

    //cantidad de usuarios por deporte
    @GetMapping("/contarUsuariosPorDeporte")
    public List<Object[]> contarUsuariosPorDeporte(@RequestParam String deporte) {
        return dS.countUsuariosPorDeporte(deporte);
    }
    //lista de usuarios por deporte forma 1
    @GetMapping("/UsuariosPorDeporteForma1")
    public List<Object[]> listadeusersDeporte(@RequestParam String deporte) {
        return dS.listadeusersDeporte(deporte);
    }
    //lista de usuarios por deporte forma 2
    @PostMapping("/UsuariosPorDeporteForma2")
    public List<UserDTO> UsuariosPorDeporteForma2(@RequestBody String sport) {
        return dS.listadeusersDeporte2(sport).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }


}
