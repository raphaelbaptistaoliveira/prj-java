package org.senai.prjjava.controller;

import org.senai.prjjava.entity.Usuario;
import org.senai.prjjava.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/api/usuario")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    UsuarioRepository uRepository;
    //http://localhost:8080/api/usuario/add?nome=raphaelbaptista3&email=raphaelbaptista3@gmail.com
    @PostMapping("/")
    public @ResponseBody Integer addUsuario(@RequestBody Usuario objU) {
        uRepository.save(objU);
        return objU.getId();
      
    }

    @GetMapping("/")
    public @ResponseBody Iterable<Usuario> buscarUsuarios(){
        return uRepository.findAll();
    }

    @GetMapping("/{id}")
    public void buscarUsuarios(@PathParam Integer id){

    }
    
}
