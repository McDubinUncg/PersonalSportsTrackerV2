package com.csc340sp23.PST;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteTeamService {

    @Autowired
    private FavoriteTeamRepository repo;

    public List<FavoriteTeam> getAllFavoriteTeams() {
        return repo.findAll();
    }

    public FavoriteTeam getFavoriteTeam(long favoriteTeamId) {
        return repo.getReferenceById(favoriteTeamId);
    }

    public void deleteFavoriteTeam(long favoriteTeamId) {
        repo.deleteById(favoriteTeamId);
    }

    public FavoriteTeam saveFavoriteTeam(FavoriteTeam favoriteTeam) {
        return repo.save(favoriteTeam);
    }
}

