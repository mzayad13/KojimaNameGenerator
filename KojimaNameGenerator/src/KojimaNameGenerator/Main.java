package KojimaNameGenerator;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static boolean multiple = false;
    //Name(s)
    public static String Beginning = "";
    public static String Suffix = "";
    public static String Name = "";
    public static int numName = 0;


    public static Question q = new Question();

    public static String[] Names = new String[7];


    public static Sections s = new Sections();

    public static boolean debug = false;

    public static void main(String[] args) {


        //Sections
        if(debug) {

            multiple = true;
            s.Section4();
            s.Section5(multiple, Beginning, Name, Suffix, Names, numName);
        }
        else {
            s.Section1(multiple);
            s.Section2();
            s.Section3();
            s.Section4();
            s.Section5(multiple, Beginning, Name, Suffix, Names, numName);
        }

    }
}
