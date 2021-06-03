package com.project.bootcamp.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class StockDto {

    private Long id;

    @NotNull
    private String name;

    @DecimalMin(value = "0.00")//Não aceita numero menor que 0
    @Digits(integer = 6, fraction = 2) // So aceita ate 6 digitos sendo 2 após o ponto(virgula)
    @NotNull
    private double price;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy") //Transforma a data no pasdrão estabelecido em pattern. nesse exemplo no padrao brasileiro.
    private LocalDate date;

    @Digits(integer = 3, fraction = 2)
    @NotNull
    private double variation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getVariation() {
        return variation;
    }

    public void setVariation(double variation) {
        this.variation = variation;
    }
}
