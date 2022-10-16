package com.eduar.misiontic.games2.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name="games")
public class Games implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String developer;
    @Column(name = "years")
    private Integer year;
    private String description;

    @ManyToOne
    @JoinColumn(name="categoryId")
    @JsonIgnoreProperties({"games","category"})
    private Category category;
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "game")
    @JsonIgnoreProperties({"game","client"})
    private List<Message> messages;
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "game")
    @JsonIgnoreProperties("game")
    private List<Reservation> reservations;


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
