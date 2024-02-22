package edu.eafit.pokemon;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/pokeapi")
public class PokeController {
    
    @Autowired
    private PokeRepository pokeRepository;

    @GetMapping("/all")
    public @ResponseBody Iterable<Pokemon> getAllPokemon()
    {
        return pokeRepository.findAll();
    }

    @GetMapping("/id")
    public @ResponseBody Optional<Pokemon> getById(Integer id){
        return pokeRepository.findById(id);
    }

    @GetMapping("/name")
    public @ResponseBody Iterable<Pokemon> getByName(@RequestParam String pok_name){
        return pokeRepository.findByPokname(pok_name);
    }

    @GetMapping("/exp")
    public @ResponseBody Iterable<Pokemon> getPokemonByLessExperience(@RequestParam Integer exp) {
        return pokeRepository.findByLessExp(exp);
    }

    @GetMapping("/peso")
    public @ResponseBody Iterable<Pokemon> getHeavyPokemon(@RequestParam Integer peso){
        return pokeRepository.findByWeight(peso);
    }
    
}
