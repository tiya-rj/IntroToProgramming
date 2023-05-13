package day33_abstraction;

import day32_finalKeyword.personTask.Person;

import java.time.LocalDate;

public final class CydeoDevStudent extends Person {

    private final String id;
    private String batchName;
    private int batchNumber;
    public static final String programingLanguage;


    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth);
        if(getAge()<18){
            System.err.println("Age must be at lest 18 years old");
            System.exit(1);
        }
        this.id = id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }

    static{
        programingLanguage = "Java";
    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        if(batchName.equalsIgnoreCase("SEDT")|| batchName.equalsIgnoreCase("b29")){
        } else {
            System.err.println("Invalid batch name.");
            System.exit(1);
        }
        this.batchName = batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber<=0){
            System.err.println("Invalid batch number.");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    @Override
    public void eat() {
        System.out.println(getName()+"is eating "+programingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName()+ " is drinking "+programingLanguage);
    }

    @Override
    public String toString() {
        return "CydeoDevStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                "id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }
}
