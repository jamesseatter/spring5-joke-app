package eu.seatter.chucknorrisjokes.controller;

import eu.seatter.chucknorrisjokes.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    private JokeService jokeService;

    public MainController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model) {
        String joke = jokeService.getJoke();
        model.addAttribute("joke",joke);
        return "chucknorris";
    }

}
