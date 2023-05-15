package day30_inheritance.TypeOfInheritance;

import java.time.LocalDate;


public class President extends Person{ //Hirecaly inheritance

    private LocalDate electedDate;

    public LocalDate getElectedDate() {
        return electedDate;
    }

    public President(String name, char gender, LocalDate DOB, LocalDate electedDate) {
        super(name, gender, DOB);
        setElectedDate(electedDate);
    }

    public void setElectedDate(LocalDate electedDate) {
        this.electedDate = electedDate;
    }

    public void setRules(){
        System.out.println(getName()+" is setting rules.");

    }
}
