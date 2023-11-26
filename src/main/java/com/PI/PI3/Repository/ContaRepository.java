package com.PI.PI3.Repository;

import com.PI.PI3.Entity.ContaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<ContaEntity, Integer> {
    
}
