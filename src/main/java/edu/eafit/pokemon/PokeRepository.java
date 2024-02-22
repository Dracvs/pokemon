package edu.eafit.pokemon;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PokeRepository extends CrudRepository<Pokemon, Integer>{
    
    List<Pokemon> findByPokname(String pok_name);
    
    @Query("SELECT p FROM Pokemon p WHERE p.pok_base_experience < :expt")
    List<Pokemon> findByLessExp(@Param("expt") int exp);

    @Query(
        value = "SELECT * FROM Pokemon WHERE pok_weight > :peso ORDER BY pok_weight",
        nativeQuery = true
    )
    List<Pokemon> findByWeight(@Param("peso") int peso);
}
