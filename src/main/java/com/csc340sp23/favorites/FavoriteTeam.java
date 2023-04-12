package com.csc340sp23.PST;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Entity
@Table(name = "favorites")
@NoArgsConstructor
@Getter
@Setter
public class FavoriteTeam {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private long teamID;
private long userID;

public FavoriteTeam(long teamID, long userID) {
    this.teamID = teamID;
    this.userID = userID;
}
}

