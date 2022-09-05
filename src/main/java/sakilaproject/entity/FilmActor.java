package sakilaproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FilmActor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int film_id;
    private int actor_id;
    private String title;
    private String first_name;
    private String last_name;


    public FilmActor() {
    }

    public FilmActor(int film_id, int actor_id, String title, String first_name, String last_name) {
        this.film_id = film_id;
        this.actor_id = actor_id;
        this.title = title;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
