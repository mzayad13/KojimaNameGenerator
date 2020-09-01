package KojimaNameGenerator;

import java.util.Scanner; //Scanner Class

public class Sections {

    //Dice Instance for rolling dice
    private Dice roll = new Dice();
    private Question question = new Question();
    private Scanner input = new Scanner(System.in);


    //Restrictions
    final String[] MATTER = {"Solid", "Liquid", "Gas", "Plasma"};
    final String[] ZODIAC = {"Aries", "Leo", "Cancer", "Pisces", "Scorpio", "Taurus", "Sagittarius", "Gemini", "Virgo", "Libra", "Capricorn", "Aquarius"};
    final String[] KURT = {"Jamie McPheeters", "Whitey", "Willie Prentiss", "Sidney Bower", "Ronnie Gardner", "Rich", "Dexter", "Steven Post", "Johnny Jesus", "Ray Ferris", "Bart", "Morgan 'Two Persons' Bodeen", "Dexter Riley", "Santa Claus", "Randy Miller", "Martin Sr.", "Santa Claus", "Ego", "Mr. Nobody", "Jimmy Harrell", "John Ruth", "Sheriff Hunt", "Mr. Nobody", "Crunch Calhoun", "Coach Hand", "Dad", "Stuntman Mike", "Stuntman Mike (segment \"Death Proof\")", "Robert Ramsey", "Ben Crane", "Steve / The Commander", "Kurt Russell", "Herb Brooks", "Eldon Perry", "Captain Ives", "McCabe", "Michael Zane", "Todd 3465", "Jeff Taylor", "Snake Plissken", "David Grant", "Colonel Jonathan 'Jack' O'Neil", "Presley", "Wyatt Earp", "Captain Ron", "Michael Carr", "Stephen McCaffrey / Dennis McCaffrey", "Lt. Gabriel Cash", "Wayland Jackson", "Frescia", "Dean Proffitt", "Jack Burton", "Reno Hightower", "Malcolm Anderson", "Lucky Lockhart", "Drew Stephens", "MacReady", "Copper", "Snake Plissken", "Rudy Russo"};
    final String[] KUBRICK = {"Shut", "Jacket", "Shining", "Lyndon", "Orange", "Odyssey", "Bomb", "Lolita", "Spartacus", "Glory", "Kiling", "Kiss", "Seafarers", "Desire", "Fight", "Padre"};
    final String[] JOY = {"Unknown", "Closer", "Preston", "Les", "Fractured", "Re-fractured", "Still", "Substance", "The", "Warsaw", "Permanent", "Heart", "Martin", "Let", "Singles", "Total"};



    //Section 1
    public boolean Section1(boolean Loop) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("-------------------------------------------------------------------------------------------------------------------\n" +
                "Section 1: Determining How Many Names You Have\n" + "Kojima often creates characters that have many alternate\n" +
                "names, so we must first figure out how many names you will have\n" +
                "-------------------------------------------------------------------------------------------------------------------\n");
        roll.TableX(6,"", "You have 1 name.", "You have 1 name + 6 other alternate names.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        return Loop;
    }


    //Section 2
    public void Section2(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("-------------------------------------------------------------------------------------------------------------------\n" +
                "Section 2: Personal Information\n" + "Kojima’s characters have names that are directly related to their own\n" +
                "character traits. This information will make sure your name fits your personality.\n"
                + "-------------------------------------------------------------------------------------------------------------------\n");
        question.q(1, "What is your full name?");
        question.q(2, "What do you do at your occupation?");
        question.q(3, "Condense the verb in your previous answer into a single -er noun. (e.g. if you are a sheep farmer, your answer will be “farmer”)", "er", 1);
        question.q(4, "What was your first pet’s specific species/breed? If you never had a pet, please answer with an animal you wish you owned.");
        question.q(5, "What’s your most embarrassing childhood memory? Be specific");
        question.q(6, "Condense the story in your previous answer into two words.", 2);
        question.q(7, "What is the object you’d least like to be stabbed by?");
        question.q(8, "What is something you are good at? (Verb ending in -ing)", "ing");
        question.q(9, "What is your greatest intangible fear? (e.g. death, loneliness, fear itself)");
        question.q(10, "What is your greatest tangible fear? (e.g. horses)");
        question.q(11,"What is the last thing you did before starting this generator?");
        question.q(12, "What condition is your body currently in? (single word answer)", 1);
        question.q(13, "Favorite state of matter?", MATTER);
        question.q(14, "A word your first name kind of sounds like? (e.g. Brian -> Brain)", 1);
        question.q(15, "What is your Zodiac sign?", ZODIAC);
        question.q(16, "If you had to define your personality in one word, what would it be?", 1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

    //Section 3
    public void Section3() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("-------------------------------------------------------------------------------------------------------------------\n" +
                            "Section 3: Kojima Information\n" + "Kojima character names reflect his own idiosyncrasies. He can’t help himself\n" +
                            "-------------------------------------------------------------------------------------------------------------------\n");
        question.q(17, "Who is your favorite film character? (NOTE: must be played by Kurt Russell)", KURT);
        question.q(18, "What is the last word of the title of your favorite Kubrick film?", KUBRICK);
        question.q(19, "What is the first word in the title of your favorite Joy Division album?", JOY);
        question.q(20, "What is a scientific term you picked up from listening to NPR once?");
        question.q(21, "What is a piece of military hardware you think looks cool even though war is bad?");
        question.q(22, "What is something you’d enjoy watching Mads Mikkelsen do?");
        question.q(23, "Please condense your previous answer into one word.", 1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

    //Section 4
    public void Section4() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("-------------------------------------------------------------------------------------------------------------------\n"
                + "Section 4: Determining Your Name Conditions\n" + "Sometimes, a character will have a plot-based condition that affects their name.\n" +
                "You, too, might have a condition that affects your name. Conditions can stack,\n" +
                " so please make note of how many your name has.\n" +
                "-------------------------------------------------------------------------------------------------------------------\n");
        roll.TableX(4,"THE -MAN CONDITION:", "You do not have this condition.", "You have this condition. \n\nYour last name will include the suffix\n" +
                "-man. If your name already has -man at the end of it, I guess\n" +
                "you’re just going to have -manman at the end of your name.");
        roll.ConditionCondtion();
        roll.TableX(12,"THE CLONE CONDITION:", "You do not have this condition.", "You are a clone of someone else, or you have been brainwashed\n" +
                "into becoming a mental doppelganger of someone else. Find\n" +
                "someone who has completed this generator and replace 50% of\n" +
                "your Kojima name with 50% of their Kojima name.");
        roll.KojimaConditon();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");



    }

    public void Section6(String Beginning, String Name, String Suffix, String[] Names, int numName){
        //Section Title and blurb
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------\n" +
                "Section 6: NORMAL NAME\n" + "Kojima’s early work includes lots of characters that have names that are\n" +
                "widely considered to be “normal.” Was this just because, in the early years,\n" +
                "he didn’t have the power to say, “I’m Hideo Kojima, I can name someone\n" +
                "Die-Hardman if I want to” without people questioning him? Probably\n" +
                "-------------------------------------------------------------------------------------------------------------------\n");

        System.out.println("Your answer from Section 2, Number 1 along with any conditions you accrued in Section 4. Will be your full name.\n");

        Name = Beginning + " " + question.getAnswer(1) + Suffix;
        //
        System.out.println(" This is your full\n" +
                "Kojima name: " + Name +"\n\nThat’s your name. Your Kojima name is probably just your actual name.\n" +
                "Sorry if you were expecting something wild.");

        //Assigns name
        Names[numName] = Name;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

    }

    public void Section7(String Beginning, String Name, String Suffix, String[] Names, int numName){
        //First name
        String First = "";
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        //Section Title and blurb
        System.out.println("-------------------------------------------------------------------------------------------------------------------\n" +
                "Section 7: OCCUPATIONAL NAME\n" + "Kojima’s characters tend to be driven by the work that they do. That often\n" +
                "carries over to their names. You, too, can be nothing more than your job.\n" +
                "-------------------------------------------------------------------------------------------------------------------\n");

        System.out.println("Your answer from Section 2, Number 3 will be your last name: " + question.getAnswer(3));

        int result = roll.Roll(4);

        System.out.print("We now use a d4 to determine your First name\n");

        switch(result){
            case 1: First = question.getAnswer(16); break;
            case 2: First = question.getAnswer(7); break;
            case 3: First = question.getAnswer(14); break;
            case 4: First = question.getAnswer(17); break;
        }

        System.out.println("Your First name is: " + First + "\n");


        //Name
        Name = Beginning + " " + First + " " + question.getAnswer(3) + Suffix;
        System.out.println(" This is your full\n" +
                "Kojima name: " + Name);

        //Assigns name
        Names[numName] = Name;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

    }

    public void Section8(String Beginning, String Name, String Suffix, String[] Names, int numName) {
        //First name
        String First = "";
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        //Section Title and blurb
        System.out.println("-------------------------------------------------------------------------------------------------------------------\n" +
                "Section 8: HORNY NAME\n" + "Kojima’s characters and stories are irrevocably\n" +
                "horny. Weirdly horny, sure, but horny nonetheless.\n" +
                "-------------------------------------------------------------------------------------------------------------------\n");

        System.out.println("Your answer from Section 2, Number 4 will be your last name: " + question.getAnswer(4) + "\n");

        int result = roll.Roll(4);

        System.out.print("We now use a d4 to determine your First name\n");

        switch (result) {
            case 1: First = question.getAnswer(13); break;
            case 2: First = "Naked"; break;
            case 3: First = question.getAnswer(7); break;
            case 4: First = question.getAnswer(15); break;
        }

        System.out.println("Your First name is: " + First +"\n");

        System.out.println("If you feel like it, your middle name can be “Lickable.” I won’t stop you. (y/n)");

        String Middle = "";

        char lick = input.next().charAt(0);

        if (Character.isUpperCase(lick)) {
            lick = Character.toLowerCase(lick);
        }
       boolean valid;
       do {
           if (lick == 'y' || lick == 'n') {
               if(lick == 'y'){
                   Middle = "Lickable ";

               }
               valid = true;

           } else {
               System.out.println("Please input y/n");
               valid = false;

           }
       }
       while(valid == false);



        //Name
        Name = Beginning + " " + First + " " + Middle + question.getAnswer(4) + Suffix;
        System.out.println(" This is your full\n" +
                "Kojima name: " + Name);

        //Assigns name
        Names[numName] = Name;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

    }

    public void Section9(String Beginning, String Name, String Suffix, String[] Names, int numName){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        //First name
        String First = "The";
        String Last = "";

        //Section Title and blurb
        System.out.println("-------------------------------------------------------------------------------------------------------------------\n" +
                "Section 9: THE NAME\n" + "Kojima loves to make people have names that start with\n" +
                "the word “The” and they usually symbolize fears or \n" +
                "unstoppable forces. You are now that unstoppable force.\n" +
                "-------------------------------------------------------------------------------------------------------------------\n");

        System.out.println("Your First name will be 'The'\n");

        int result = roll.Roll(4);

        System.out.print("We now use a d4 to determine your Last name\n");

        switch (result) {
            case 1: Last = question.getAnswer(9);break;
            case 2: Last = question.getAnswer(10);break;
            case 3: Last = question.getAnswer(6);break;
            case 4: Last = question.getAnswer(21);break;
        }

        System.out.println("Your Last name is: " + Last + "\n");

        //Name
        Name = First + " " + Beginning + " " + Last + Suffix;
        System.out.println(" This is your full\n" +
                "Kojima name: " + Name);

        //Assigns name
        Names[numName] = Name;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

    }


    public void Section10(String Beginning, String Name, String Suffix, String[] Names, int numName){
        //name
        String Last = "";
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        //Section Title and blurb
        System.out.println("-------------------------------------------------------------------------------------------------------------------\n"
                +"Section 10: COOL NAME\n" + "Kojima loves to be cool. Sometimes, his idea of cool is a bit strange,\n" +
                "but it is always cool to Hideo Kojima, and that’s what matters.\n" +
                "-------------------------------------------------------------------------------------------------------------------\n");

        System.out.println("Your answer from Section 2, Number 23 will be your First name: " + question.getAnswer(23));

        int result = roll.Roll(4);

        System.out.print("We now use a d4 to determine your Last name\n");

        switch(result){
            case 1: Last = question.getAnswer(18); break;
            case 2: Last = question.getAnswer(19); break;
            case 3: Last = question.getAnswer(20); break;
            case 4: Last = question.getAnswer(7); break;
            case 5: Last  = question.getAnswer(9); break;
            case 6: Last  = question.getAnswer(14); break;
        }

        System.out.println("Your Last name is: " + Last + "\n");


        //Name
        Name = Beginning + " " + question.getAnswer(23) + " " + Last + Suffix;
        System.out.println(" This is your full\n" +
                "Kojima name: " + Name);

        //Assigns name
        Names[numName] = Name;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

    }

    public void Section11(String Name, String[] Names, int numName){
        //First name
        String Last = "";
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        //Section Title and blurb
        System.out.println("-------------------------------------------------------------------------------------------------------------------\n" +
                "Section 11: VIOLENT NAME\n" + "Kojima loves to be cool. Sometimes, his idea of cool is a bit strange,\n" +
                "but it is always cool to Hideo Kojima, and that’s what matters.\n" +
                "-------------------------------------------------------------------------------------------------------------------\n");

        System.out.println("Your answer from Section 2, Number 7 will be your First name: " + question.getAnswer(6));

        int result = roll.Roll(4);

        System.out.print("We now use a d4 to determine your Last name\n");

        switch(result){
            case 1: Last = question.getAnswer(20); break;
            case 2: Last = question.getAnswer(13); break;
            case 3: Last = question.getAnswer(21); break;
            case 4: Last = question.getAnswer(10); break;
        }

        System.out.println("Your Last name is: " + Last+  "\n");


        //Name
        Name = question.getAnswer(6) + " " + Last;
        System.out.println(" This is your full\n" +
                "Kojima name: " + Name);

        //Assigns name
        Names[numName] = Name;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }


    public void Section12(String Beginning, String Name, String Suffix, String[] Names, int numName){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        //Section Title and blurb
        System.out.println("-------------------------------------------------------------------------------------------------------------------\n" +
                "Section 12: NAME THAT LACKS SUBTEXT\n" + "Sometimes, Kojima gives up and just names a character exactly what they\n" +
                "are. Congratulations. You are exactly what you do.\n" +
                "-------------------------------------------------------------------------------------------------------------------\n");

        System.out.println("Your answer from Section 2, Number 11 will be your Full name: " + question.getAnswer(11));

        //Name
        Name = Beginning + " " + question.getAnswer(11) + Suffix;
        System.out.println(" This is your full\n" +
                "Kojima name: " + Name);

        //Assigns name
        Names[numName] = Name;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

    public void Section13(String[] Names, int numName){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        //Section Title and blurb
        System.out.println("-------------------------------------------------------------------------------------------------------------------\n"
                +"Section 13: Explaining Your Name\n" + "Kojima’s characters know that their names are meaningful, and they will tell\n" +
                "you it completely unprompted. You, too, must explain your name to any\n" +
                "potential friends, foes, or shadowy government institutions.\n"
                +"-------------------------------------------------------------------------------------------------------------------\n");
        if(numName>1){
            System.out.print("Here are all of your names: ");
            for(String name : Names){
                System.out.print(name +"-");
            }
            System.out.print("\n\n");
        }
        System.out.println("Here's a start:\n Hi I'm " + Names[0] + ",  and if you're wondering how I got this name, well, let me tell you.\n I...");

    }




    public void Section5(boolean loop, String Beginning, String Name, String Suffix, String[] Names, int numName){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("-------------------------------------------------------------------------------------------------------------------\n" + "" +
                "Section 5: Determining Your Name Category\n" + "Kojima names fall into a finite number of categories. This section will\n" +
                "determine the category in which you name belongs.\n" +
                "-------------------------------------------------------------------------------------------------------------------\n" );

        //Checks if player has 6 names to make lol
        if(loop = true){
            System.out.println("Well, looks like you have 6 different aliases you don't need this section!\n");
            Section6(Beginning, Name, Suffix, Names, numName);
            numName++;
            Section7(Beginning, Name, Suffix, Names, numName);
            numName++;
            Section8(Beginning, Name, Suffix, Names, numName);
            numName++;
            Section9(Beginning, Name, Suffix, Names, numName);
            numName++;
            Section10(Beginning, Name, Suffix, Names, numName);
            numName++;
            Section11(Name, Names, numName);
            numName++;
            Section12(Beginning, Name, Suffix, Names, numName);
            Section13(Names, numName);
        }
        else{
            System.out.println("You will now roll a d20 to determine your name category, once you have your name category that will outline the rules of your name.");
            int result = roll.Roll(20);
            if(result == 1){
                System.out.println("You have a NORMAL NAME");
                Section6(Beginning, Name, Suffix, Names, numName);
                Section13(Names, numName);
            }
            else if(result >1 && result <= 6){
                System.out.println("You have a OCCUPATIONAL NAME");
                Section7(Beginning, Name, Suffix, Names, numName);
                Section13(Names, numName);
            }
            else if(result >6 && result <= 10){
                System.out.println("You have a HORNY NAME");
                Section8(Beginning, Name, Suffix, Names, numName);
                Section13(Names, numName);
            }
            else if(result >10 && result <= 13){
                System.out.println("You have a THE NAME NAME");
                Section9(Beginning, Name, Suffix, Names, numName);
                Section13(Names, numName);
            }
            else if(result >13 && result <= 17){
                System.out.println("You have a COOL NAME");
                Section10(Beginning, Name, Suffix, Names, numName);
                Section13(Names, numName);
            }
            else if(result >17 && result <= 19){
                System.out.println("You have a VIOLENT NAME");
                Section11(Name, Names, numName);
                Section13(Names, numName);
            }
            else{
                System.out.println("You have a NAME THAT LACKS SUBTEXT NAME");
                Section12(Beginning, Name, Suffix, Names, numName);
                Section13(Names, numName);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

}


