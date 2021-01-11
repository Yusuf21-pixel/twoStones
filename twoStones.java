import java.util.*;
class twoStones{
    public static void main(String[] args){
    Scanner kbd = new Scanner(System.in);
    int num = kbd.nextInt();
    if(num%2 != 0)
      System.out.println("Alice");
    else
      System.out.println("Bob");
    }
}