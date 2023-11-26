package com.PI.PI3.Controller;

import com.PI.PI3.Entity.ContaEntity;
import com.PI.PI3.Service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
@RequestMapping("/conta") 
public class contaController {
    @Autowired 
    ContaService contaService;
    
    @GetMapping("/pesquisar/{id}") 
    public ResponseEntity<ContaEntity> getContaById(@PathVariable Integer id) { 
        ContaEntity conta = contaService.getContaId(id); 
        return new ResponseEntity<>(conta, HttpStatus.OK); 
    } 
    
    @PostMapping("/adicionar") 
    public ResponseEntity<ContaEntity> addConta(@RequestBody ContaEntity conta) { 
        var novoConta = contaService.criarConta(conta); 
        return new ResponseEntity<>(novoConta, HttpStatus.CREATED); 
    } 

    @DeleteMapping("/deletar/{id}") 
    public ResponseEntity deletarConta(@PathVariable Integer id) { 
        contaService.deletarConta(id); 
        return new ResponseEntity<>(HttpStatus.OK); 
    } 
    
    @PutMapping("/atualizar/{id}") 
    public ResponseEntity<ContaEntity> atualizarConta(@PathVariable Integer id, @RequestBody ContaEntity Conta) {
        var ContaAtualizada = contaService.atualizarConta(id, Conta); 
        return new ResponseEntity<>(ContaAtualizada, HttpStatus.OK); 
    } 
 
    
}
