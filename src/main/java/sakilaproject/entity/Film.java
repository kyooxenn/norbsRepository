package sakilaproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer film_id;
    private String Title;
    private String Description;


    public Film() {
    }

    public Film(Integer film_id, String title, String description) {
        this.film_id = film_id;
        Title = title;
        Description = description;
    }

    public Integer getFilm_id() {
        return film_id;
    }

    public void setFilm_id(Integer film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
