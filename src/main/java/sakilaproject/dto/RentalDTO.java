package sakilaproject.dto;

import lombok.Data;

@Data
public class RentalDTO {
    private int rental_id;
    private int customer_id;
    private int film_id;
    private int staff_id;
}
