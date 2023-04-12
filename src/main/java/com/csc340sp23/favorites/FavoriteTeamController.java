package com.csc340sp23.PST;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/favorite-team")
public class FavoriteTeamController {

    @Autowired
    private FavoriteTeamService favoriteTeamService;

    @GetMapping("/all")
    public String getFavoriteTeams(Model model) {
        List<FavoriteTeam> favoriteTeams = favoriteTeamService.getAllFavoriteTeams();
        if(favoriteTeams.isEmpty()){
            return "favorites";
        }
        System.out.println(favoriteTeams.get(0));
        model.addAttribute("favoriteTeamList", favoriteTeams);
        return "favorites";
    }


    @GetMapping("/remove/id={favoriteID}")
    public ResponseEntity<String> deleteFavoriteTeam(@PathVariable long favoriteID) {
        favoriteTeamService.deleteFavoriteTeam(favoriteID);
        return ResponseEntity.ok("Favorite team removed successfully");
    }

    @PostMapping("/add")
    public ResponseEntity<String> addFavoriteTeam(@RequestBody FavoriteTeam favoriteTeam) {
        System.out.println(favoriteTeam);
        FavoriteTeam addedTeam = favoriteTeamService.saveFavoriteTeam(favoriteTeam);
        return ResponseEntity.ok(Long.toString(addedTeam.getId()));
    }

}

