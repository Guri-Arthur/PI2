package com.PI.PI3.Controller;

import com.PI.PI3.Entity.CompraEntity;
import com.PI.PI3.Service.CompraService;
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
public class compraController {
    @Autowired 
    CompraService compraService;
    
    @GetMapping("/pesquisar/{id}") 
    public ResponseEntity<CompraEntity> getCompraById(@PathVariable Integer id) { 
        CompraEntity compra = compraService.getCompraId(id); 
        return new ResponseEntity<>(compra, HttpStatus.OK); 
    } 
    
    @PostMapping("/adicionar") 
    public ResponseEntity<CompraEntity> addCompra(@RequestBody CompraEntity compra) { 
        var novoCompra = compraService.criarCompra(compra); 
        return new ResponseEntity<>(novoCompra, HttpStatus.CREATED); 
    } 

    @DeleteMapping("/deletar/{id}") 
    public ResponseEntity deletarCompra(@PathVariable Integer id) { 
        compraService.deletarCompra(id); 
        return new ResponseEntity<>(HttpStatus.OK); 
    } 
    
    @PutMapping("/atualizar/{id}") 
    public ResponseEntity<CompraEntity> atualizarCompra(@PathVariable Integer id, @RequestBody CompraEntity compra) {
        var compraAtualizada = compraService.atualizarCompra(id, compra); 
        return new ResponseEntity<>(compraAtualizada, HttpStatus.OK); 
    } 
    
}
