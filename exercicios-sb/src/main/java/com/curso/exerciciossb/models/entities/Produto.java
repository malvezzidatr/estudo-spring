package com.curso.exerciciossb.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Double price;
    private Double discont;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscont() {
        return discont;
    }

    public void setDiscont(Double discont) {
        this.discont = discont;
    }

    public Double getPriceWithDiscont() {
        return this.price - ((this.discont/100) * this.price);
    }

    public Produto(String name, Double price, Double discont) {
        super();
        this.name = name;
        this.price = price;
        this.discont = discont;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
