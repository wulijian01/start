package com.dand.start.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "thesis")
public class Thesis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private  String name;

    @Column(name = "class")
    private String calss;

    @Column(name = "title")
    private  String title;

    @Column(name = "teacher")
    private String  teacher;

    @Column(name = "date")
    private  String date;


}
