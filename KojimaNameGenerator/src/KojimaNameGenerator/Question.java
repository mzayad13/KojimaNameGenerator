package KojimaNameGenerator; //Package

import java.util.Scanner; //Scanner Class

public class Question {
    //Private Vars
    private String[] answers = new String[23];
    /*private String[] answers = {"Mahmoud Zayad", "Troubleshoot", "Troubleshooter" ,"Russian Blue" , "Liquid" , "Liquid Shit", "Needle", "Screaming", "Being Forgotten", "Spiders",
            "Fixing this generator", "Exhausted", "Plasma", "Seclude", "Scorpio", "Irreverant", "Dad", "Shining", "Unknown", "Quantum", "Spitfire", "Kill", "Kill"};*/
    private Scanner input = new Scanner(System.in);

    public String getAnswer(int index){
        index = index -1;
        return answers[index];
    }




    //Section 2 and 3 Questions
    public void q(int id, String question, String[] restriction, String ending, int numWord){


        //Print out question
        System.out.println("\n" + id + ". " + question);

        answers[id - 1] = input.nextLine();

        //Checks for answer Restrictions
        if(restriction != null){
            boolean choice = false;
            while (!choice) {
                for (String check : restriction) {
                    //If answer is not a valid option prints out list of options and has user update their answer
                    if (check.equals(answers[id - 1])) {
                        choice =true;

                    }
                }
                if(!choice) {
                    System.out.println("You must select a valid answer! Here are your options:");
                    for (String options : restriction) {
                        if (!options.equals(restriction[restriction.length - 1]))
                            System.out.print(options + ", ");
                    }
                    System.out.print(restriction[restriction.length - 1] + "\nChoice: ");
                    answers[id - 1] = input.nextLine();
                }
            }
        }
        //Checks for word limiter
        if(numWord != 0){
            String[] words = answers[id-1].split("\\s"); //breaks up line
            while(words.length != numWord){
                System.out.println("You're answer can only contain " + numWord + " word(s).\n");
                answers[id-1] = input.nextLine();
                words = answers[id-1].split("\\s");
            }
        }

        //Checks to see if its an ending specific question
        if(!ending.equals("X")) {
            int occurs = answers[id-1].lastIndexOf(ending);;
            //Checks if answer has proper ending
            while (occurs == -1){
                System.out.println("Make sure your verb ends in " + ending + ".\n");
                answers[id-1] = input.nextLine();
                occurs = answers[id-1].lastIndexOf(ending);
            }
        }

    }

    //Overloading

    //Amount of words
    public void q(int id, String question, int numWord){
        q(id, question, null, "X", numWord);
    }
    //Restriction
    public void q(int id, String question, String[] restriction){
        q(id, question, restriction, "X", 0);
    }
    //Ending
    public void q(int id, String question, String ending){
        q(id, question, null, ending, 0);
    }
    //Ending and words
    public void q(int id, String question, String ending, int numWord){
        q(id, question, null, ending, numWord);
    }
    public void q(int id, String question, char carrots){
        q(id, question, null, "X", 0);
    }
    //Nothing special
    public void q(int id, String question){
        q(id, question, null, "X", 0);
    }


}


