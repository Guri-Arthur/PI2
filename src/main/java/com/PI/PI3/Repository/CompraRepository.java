package com.PI.PI3.Repository;

import com.PI.PI3.Entity.CompraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<CompraEntity, Integer> {
    
}
