package com.dand.start.entity;


import lombok.*;


import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "racematch")
public class RaceMatch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "class")
    private String calss;
    @Column(name = "racename")
    private String racename;
    @Column(name = "teacher")
    private String teacher;
    @Column(name = "level")
    private String level;
    @Column(name = "date")
    private String date;


}
