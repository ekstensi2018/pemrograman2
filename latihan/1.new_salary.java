/**
 * Latihan 1.0
 *
 * 
 */
public class new_salary {
 public static void main(String[] args) {
  // deklarasi variabel
  double salary = 100;
  double newSalary = 10;

  final double RAISE_RATE = 1.10;
  newSalary = salary * RAISE_RATE;
  System.out.println("Current salary: " + salary + " After raise: " +
   newSalary);
 }

}
