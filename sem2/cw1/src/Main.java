public class Main {

    public static void main(String[] args) {


        //tests for task 1
        /*

        TeamData team1 = new TeamData("UW Red", 8);
        team1.success(3, 18);
        team1.success(4, 82);
        team1.success(6, 130);
        System.out.println(team1);
        team1.solved();
        team1.time();
        System.out.print(team1.percentCorrect());

         */


        List list = new List();
        for(int i = 11; i > 0; i--) {
            list.insert(i);
        }
        list.print();
        List list2 = list.removeAlternating();
        list2.print();


    }
}
