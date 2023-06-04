package entities.aux;

import java.time.LocalDate;

public class RG {

    private String number;
    private String authority;
    private LocalDate date;

    public RG(String number, String authority, LocalDate date){

        this.number = number;
        this.authority = authority;
        this.date = date;

    }

}
