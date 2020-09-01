package KojimaNameGenerator;

import java.util.Random;

public class Dice {

    Question answer = new Question();
    Main m = new Main();

    public int Roll(int die) {
        Random name = new Random(System.currentTimeMillis()); //Instance of Random Class
        int upperbound = die; //D6
        int roll = name.nextInt(upperbound);
        return roll+1;
    }

    //1<x x+1 for Name, Clone and Man Condtions
    public void TableX(int size, String Condition, String Outcome1, String Outcome2){
        System.out.println(Condition);

        if(size == 6){
            System.out.println("You will roll a d6 to determine how many names you have.\n");
        }
        else{
            if(size == 8){
                System.out.println("You will roll a d" + size + " to determine what condition you may have.\n");
            }
            else{
                System.out.println("You will roll a d" + size + " to determine whether you\n" +
                        "have this condition:\n");
            }
        }

        //Stores dice roll
        int result = Roll(size);

        if (result <= size-1){
            m.multiple = false;
            System.out.println(Outcome1 + "\n");
        }
        else{
            if(size == 6 && !m.multiple){
                m.multiple = true; //Loops program 6 times
                System.out.println("You rolled a 6 must do this worksheet 6 more times. You do not\n" +
                        "                need to complete Sections 1-3 on subsequent name generations.");
            }
            if(size == 4){
                m.Suffix = "man";
            }
            System.out.println(Outcome2 + "\n");
        }

    }

    //ConditionCOndition find out your condition
    public void ConditionCondtion(){
        System.out.println("THE CONDITION CONDITION");
        //Stores result of roll
        int result = Roll(8);

        if(result <= 5){//No Condition
            System.out.println("You do not have this condition.\n");
            m.Beginning = "";
        }
        else if(result == 6){//Big Condtion
            System.out.println("You’re big. Your name must have “Big” at the beginning of it.\n");
            m.Beginning = "Big";
        }
        else if(result == 7){//Old Condition
            System.out.println("You are older than you once were. Your name must have “Old” at\n" +
                    "the beginning of it");
            m.Beginning = "Old";
        }
        else{//Answer condition
            System.out.println("You are how you currently are. Please add your answer from Section\n" +
                    "2, Number 12 to the beginning of your name.");
            m.Beginning = answer.getAnswer(12);
        }
    }

    //Kojima Condition
    public void KojimaConditon(){
        System.out.println("THE KOJIMA CONDITION");

        int result = Roll(100);

        if(result ==69){
            System.out.println("Oh no. You are Hideo Kojima. Hideo Kojima created you and is also\n" +
                    "you. You are the man who created himself and there is nothing you\n" +
                    "can do about it. You’re in Kojima’s world—your world—and that’s\n" +
                    " just the breaks, pal. Stop this worksheet now. You’re Hideo Kojima.\n" +
                    "Go do the things that Hideo Kojima does.");
            System.exit(0);
        }
        else{
            System.out.println("You do not have this condition.");
        }
    }

}





