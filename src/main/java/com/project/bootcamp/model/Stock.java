package com.project.bootcamp.model;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_stock")
public class Stock {

    @Id//PK
    @GeneratedValue(strategy = GenerationType.AUTO)// Anotação que gera um id automatico ou seja auto-incrementa. Se for definido que o banco de dados irá fazer o auto-incremento era so declarar como GenerationType.IDENTITY
    @Column(name = "id") //Relacionando a variavel com a Coluna id do banco de dados
    private long id;

    @Column(name = "name") // Relacionando a variavel com a Coluna do bando de dados. Lembrando que as vezes o nome no banco de dados é outro.
    private String name;

    @Column(name = "price")
    private double price;

    @Column(name = "variation")
    private double variation;

    @Column(name = "date")
    private LocalDate date;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVariation() {
        return variation;
    }

    public void setVariation(double variation) {
        this.variation = variation;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
