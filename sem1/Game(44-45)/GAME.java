

import java.util.Scanner;

public class GAME {

    private int hp1;

    public GAME(int hp1) {

        this.hp1 = hp1;


    }

    public int getCompHp() {

        return hp1;
    }

    public void dmg(int dmg) {

        if(dmg >= (int) (Math.random() * 10)) {

            dmg = 0;

            System.out.println("Ur opponent evaded");

        }

        this.hp1 = hp1 - dmg;

        if(hp1 <= 0){

            System.out.println("\n      U won!!! gg m8");

            System.exit(0);

        }

    }

    public static void main(String [] args) {

        Scanner scn = new Scanner(System.in);

        GAME g = new GAME(100);

        Player p = new Player("Unnamed", 100);

        p.setName();

        System.out.println(" Hello " + p.getName() + "! Welcome to the Game");

        int k = 0;

        int d;

        while(true) {

            k++;

            System.out.println("-------------------");

            System.out.println("Round " + k);

            System.out.println("Ur HP = " + p.getHp());

            System.out.println("Opponent's HP = " + g.getCompHp());

            System.out.println("Enter ur DMG :");

            g.dmg(scn.nextInt());

            d = (int) (Math.random() * 10);

            p.dmg(d);






        }


    }
}
