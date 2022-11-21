package sakilaproject.mapper;

import org.apache.ibatis.annotations.Mapper;
import sakilaproject.entity.FilmActor;

import java.util.List;

@Mapper
public interface FilmMapper {

    List<FilmActor> findById(int film_id);
}
