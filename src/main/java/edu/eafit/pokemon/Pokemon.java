package edu.eafit.pokemon;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pokemon{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pok_id;
    
    private Integer pok_height;
    private Integer pok_weight;
    
    @Column(name="pok_name")
    private String pokname;
    private Integer pok_base_experience;
    
    
    
    
    public Integer getPok_id() {
        return pok_id;
    }
    public void setPok_id(Integer pok_id) {
        this.pok_id = pok_id;
    }
    public Integer getPok_height() {
        return pok_height;
    }
    public void setPok_height(Integer pok_height) {
        this.pok_height = pok_height;
    }
    public Integer getPok_weight() {
        return pok_weight;
    }
    public void setPok_weight(Integer pok_weight) {
        this.pok_weight = pok_weight;
    }
    public String getPok_name() {
        return pokname;
    }
    public void setPok_name(String pok_name) {
        this.pokname = pok_name;
    }
    public Integer getPok_base_experience() {
        return pok_base_experience;
    }
    public void setPok_base_experience(Integer pok_base_experience) {
        this.pok_base_experience = pok_base_experience;
    }
}