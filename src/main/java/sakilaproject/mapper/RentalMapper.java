package sakilaproject.mapper;

import org.apache.ibatis.annotations.Mapper;
import sakilaproject.dto.RentalDTO;
import sakilaproject.model.RentalDetails;

import java.util.List;

@Mapper
public interface RentalMapper {

    List<RentalDetails> getRentalDetail(RentalDTO rentalDTO);
}
