package sakilaproject.model;

import lombok.Data;

@Data
public class RentalDetails {
    private int rental_id;
    private String rental_date;
    private String return_date;
    private String title;
    private String customer_name;
    private String payment_date;
    private String staff_name;
    private double amount;

}
