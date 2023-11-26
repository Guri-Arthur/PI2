package com.PI.PI3.Service;

import com.PI.PI3.Entity.CompraEntity;
import com.PI.PI3.Repository.CompraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService {
        
    @Autowired
    CompraRepository comprasRepository;
    
    public CompraEntity criarCompra(CompraEntity c) {           
        comprasRepository.save(c); 
        return c; 
      } 
    
        public CompraEntity atualizarCompra(Integer cId, CompraEntity compraRequest) { 
        CompraEntity c = getCompraId(cId);       
        c.setNome(compraRequest.getNome());
        c.setFpagamento(compraRequest.getFpagamento());
        c.setValor(compraRequest.getValor());
        c.setDesconto(compraRequest.getDesconto());
        comprasRepository.save(c);         
        return c; 
    }

     public CompraEntity getCompraId(Integer cId) { 
     return comprasRepository.findById(cId).orElse(null); 
     } 
     
     public List<CompraEntity> listarTodosCompras() { 
        return comprasRepository.findAll(); 
    } 

    public void deletarCompra(Integer cId) { 
        CompraEntity c = getCompraId(cId); 
        comprasRepository.deleteById(c.getId()); 
    } 

}
