import java.util.ArrayList;

/**
Сортировка работает не верно.
8/10
*/
public class TeamData implements Comparable<TeamData> {


    private String name;
    private int problems;
    private int time;
    private int solved;

    public TeamData(String name, int problems) {
        this.name = name;
        this.problems = problems;
        this.time = 0;
        this.solved = 0;
    }

    public int compareTo(TeamData td) {

        if(this.percentCorrect() == td.percentCorrect()) {
            if(this.time == td.time) {
                return 0;
            }
            if(this.time < td.time) {
                return 1;
            }
            else {
                return -1;
            }
        }
        if(this.percentCorrect() > td.percentCorrect()) {
            return 1;
        }
        else {
            return -1;
        }
    }

    public void success(int problem, int time) {

        solved++;
        this.time += time;

    }

    public int solved() {
        return solved;
    }

    public int time() {
        return time;
    }

    public double percentCorrect() {
        return (double)solved/problems * 100;
    }

    @Override

    public String toString() {

        return name + " solved " + solved + " of " + problems + " in " + time;

    }

}
