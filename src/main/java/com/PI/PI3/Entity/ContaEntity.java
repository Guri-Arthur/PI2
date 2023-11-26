/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
@Table(name="conta") 
public class ContaEntity {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String nome;
    float valor;
    String CPF;
}
