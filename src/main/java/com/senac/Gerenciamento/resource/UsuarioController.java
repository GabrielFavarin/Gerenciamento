package com.senac.Gerenciamento.resource;

import com.senac.Gerenciamento.model.Usuario;
import com.senac.Gerenciamento.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public List<Usuario> listAll(){
        List<Usuario> all = repository.findAll();
        return all;
    }

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    }

    @PutMapping("/{id}")
    public Usuario update(@PathVariable(value = "id") Long usuarioId, @RequestBody Usuario usuario) {
        Usuario usuarioFind = repository.findById(usuarioId).orElse(null);
        if (usuarioFind != null) {
            usuarioFind.setLogin(usuario.getLogin());
            usuarioFind.setSenha(usuario.getSenha());

            return repository.save(usuarioFind);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long usuarioId) {
        Usuario usuarioFind = repository.findById(usuarioId).orElse(null);
        if (usuarioFind != null) {
            repository.delete(usuarioFind);
        }
        return ResponseEntity.noContent().build();
    }
}
