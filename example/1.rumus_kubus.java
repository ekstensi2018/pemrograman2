import java.util.Scanner;
public class rumus_kubus {
 
 public static void main(String[] args) {
  int s,volume;
  Scanner input=new Scanner(System.in);
  System.out.print("Masukkan panjang sisi kubus = ");
  s=input.nextInt();
  volume=s*s*s;
  System.out.print("Volume kubus = "+volume);
  input.close();
 }
 
}
