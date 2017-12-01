package com.nathan.nflplayersservices.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@Table(name = "players")
@NoArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="PlayerId")
    private Long playerId;

    private String firstName;
    private String lastName;
    private String Position;
    private String yearOfBirth;

}
