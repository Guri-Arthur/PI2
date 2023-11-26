
package com.PI.PI3.Service;

import com.PI.PI3.Entity.ContaEntity;
import com.PI.PI3.Repository.ContaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaService {
    
    @Autowired
    ContaRepository contaRepository;
    
        public ContaEntity criarConta(ContaEntity c) {           
        contaRepository.save(c); 
        return c; 
      } 
    
        public ContaEntity atualizarConta(Integer cId, ContaEntity contaRequest) { 
        ContaEntity c = getContaId(cId);       
        c.setNome(contaRequest.getNome());
        c.setValor(contaRequest.getValor());
        c.setCPF(contaRequest.getCPF());
        contaRepository.save(c);         
        return c; 
    }

     public ContaEntity getContaId(Integer cId) { 
     return contaRepository.findById(cId).orElse(null); 
     } 
     
     public List<ContaEntity> listarTodaContas() { 
        return contaRepository.findAll(); 
    } 

    public void deletarConta(Integer cId) { 
        ContaEntity c = getContaId(cId); 
        contaRepository.deleteById(c.getId()); 
    }
}
