import java.util.Scanner;

public class PP5_11Pig {

    public static void main(String [] args){
        boolean turn = true;
        boolean endGame = true;
        int score1 = 0,score2 = 0;
        PP5_10PairOfDice Dice = new PP5_10PairOfDice();
        Scanner sc = new Scanner( System.in );
        while(endGame){
            int tempScore = 0;
            while(turn) {
                System.out.println( "total point " + score1 );
                Dice.roll();
                System.out.println("You rolls " + Dice.getSide1() + " " + Dice.getSide2());
                if (Dice.getSide1() == 1 && Dice.getSide2() == 1) {
                    score1 = 0;
                    System.out.println("You got two 1\nYou loss all point");
                    turn = false;
                } else if (Dice.getSide1() == 1 || Dice.getSide2() == 1) {
                    tempScore = 0;
                    System.out.println("You got one 1\nYou loss all point this round");
                    turn = false;
                } else {
                    tempScore +=  Dice.getSide1() + Dice.getSide2();
                    System.out.println("would you like to roll again y/n");
                    if(sc.nextLine().equals("y"))
                        System.out.println("You roll again");
                    else{
                        score1 += tempScore;
                        turn = false;
                    }
                }
            }
            Dice.roll();
            if (Dice.getSide1() == 1 && Dice.getSide2() == 1) {
                score2 = 0;
                System.out.println("Computer loss all point");
                turn = true;
            } else if (Dice.getSide1() == 1 || Dice.getSide2() == 1) {
                System.out.println("Computer loss all point this round");
                turn = true;
            } else {
                turn = true;
                score2 +=  Dice.getSide1() + Dice.getSide2();
                System.out.println("Computer have " + score2 + " points");
            }
            if(score1 >= 10 || score2 >=10){
                endGame =false;
            }
        }
        if(score1> score2){
            System.out.println("Player win");
        }else{
            System.out.println("Computer win");
        }
    }

}

/*
* Using the PairOfDice class from Programming Project 5.10
* design and implement a class to play a game called Pig. In this game the user competes against the computer. On each turn, the
* current player rolls a pair pf dice and accumulates points. The
* goal is to reach 100 points before your opponent does. If, on any
* turn, the player rolls a 1, all points accumulated for that round
* are forfeited, and control of the dice move to the other player.
* If the player rolls two 1's in one turn, the player loses all points
* accumulated thus far in the gfame and loses control of the dice
* The Player may voluntarily turn over the dice after each roll.
* Therefore, the player must decide either to roll again(be a pig )
* allowing the other player to win. Implement the computer player
* such that it always relinquishes the dice after accumulating 20 or
* more points in any given round
*/