package com.PI.PI3.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data 
@Entity 
@NoArgsConstructor
@AllArgsConstructor
@Table(name="compra") 
public class CompraEntity {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String nome;
    String Fpagamento;
    float valor;
    int desconto;
}