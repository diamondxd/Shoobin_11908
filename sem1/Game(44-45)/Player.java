import java.util.Scanner;

public class Player {

    private String name;
    private int hp;

    Scanner sc = new Scanner(System.in);

   public Player(String name, int hp) {

       this.name = name;
       this.hp = hp;

   }

   public void setName() {

       System.out.println(" Enter ur name: ");

       name = sc.nextLine();


   }

   public String getName() {

       return name;

   }

   public int getHp() {

       return hp;

   }

   public void dmg(int dmg) {

       if(dmg >= (int) (Math.random() * 10)) {

           dmg = 0;

           System.out.println("U evaded");

       }

       this.hp = hp - dmg;

       System.out.println("U got " + dmg + " dmg");

       if(hp <= 0) {

           System.out.println("     U lost lol. Gl next time");
           System.exit(0);
       }

   }



}
