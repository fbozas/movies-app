package gr.aueb.cf.moviesapp.model;

import javax.persistence.*;

@Entity
@Table(name = "FAVORITES")
public class Favorite {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    private String movieId;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getMovieId() { return movieId; }
    public void setMovieId(String movieId) { this.movieId = movieId; }
}
