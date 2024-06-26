package application;

import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;


public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        Seller sl = new Seller(2, "Pedro", "pedro@gmail.com", LocalDate.now(), 3000.0, obj);
        System.out.println(sl);
    }
}
