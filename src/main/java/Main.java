import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<People> person = new ArrayList<People>();//A variable that can be used everywhere in the class

    public static void main(String[] args) {

        person.add(new People("Anna Ann", "Stockholm 22", "019787654", "019767777", "2017-11-01"));
        person.add(new People("Mari Elle", "Stockholm 33", "019787444", "019761111", "2015-09-01"));
        person.add(new People("Rio ST", "Stockholm 45", "019787898", "019762222", "2016-09-01"));
        person.add(new People("Cat KK", "Stockholm 67", "019787989", "019763333", "2010-07-01"));
        person.add(new People("Ariana Gg", "Stockholm 89", "019787654", "019764444", "2011-06-01"));
        person.add(new People("Luckas Hellow", "Stockholm 99", "019787323", "019765555", "2000-01-05"));
        person.add(new People("Andreas Mug", "Stockholm 01", "019787333", "01976666", "1999-09-01"));
        person.add(new People("Linn Ann", "Stockholm 93", "019787990", "019768888", "2018-08-03"));
        person.add(new People("Anna Sm", "Stockholm 367", "019787111", "019769999", "2020-11-02"));
        person.add(new People("Ram Danile", "Stockholm l99", "019787099", "019760000", "2005-10-01"));
        person.add(new People("Daniel RL", "Stockholm 098", "019787877", "019766677", "2017-05-04"));

        System.out.println("Test ");
        Scanner input = new Scanner(System.in);
        String inpuString = input.nextLine();

        ArrayList<People> results = searchPerson(inpuString);
        for(People person : results){
            System.out.println("Name : " + person.getFullName() + ", Mobile number " +person.getMobileNumber() +", Adress "
                    + person.getAddress() + ", Date of birth "+ person.getDateOfBirth() +", Work number "+ person.getWorkNumber());
        }



    }

    public static ArrayList<People> searchPerson(String searchWord){

        ArrayList<People> people = new ArrayList<People>();

        for(People person : person){
            if(person.getFullName().contains(searchWord ) || person.getMobileNumber().contains(searchWord)){
               people.add(person);
            }
        }
           return people;
    }
}
