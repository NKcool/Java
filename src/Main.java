import local.pack.Human;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import static java.text.NumberFormat.getCurrencyInstance;


class CurrencyChecker {
    public void check() {
        System.out.println("Enter amount : ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        NumberFormat x = getCurrencyInstance(Locale.US);
        String US = x.format(num);

        NumberFormat y = getCurrencyInstance(Locale.CHINA);
        String CHINA = y.format(num);

        NumberFormat z = getCurrencyInstance(Locale.FRANCE);
        String FRANCE = z.format(num);

        DecimalFormat IndianCurrencyFormat = new DecimalFormat("##,##,###.00");
        String INDIA = IndianCurrencyFormat.format(num);


        System.out.println("US: " + US);
        System.out.println("India: Rs." + INDIA);
        System.out.println("China: " + CHINA);
        System.out.println("France: " + FRANCE);
    }
}

class Rezex {
    public void checkIp(String ip) {
        boolean isIp = false;
        String pattern = "([1][\\d][\\d]|[0][0][0]|([0][0]|)[\\d]|([0]|)[\\d][\\d]|[2][0-4][\\d]|[2][5][0-5])."
                + "([1][\\d][\\d]|[0][0][0]|([0][0]|)[\\d]|([0]|)[\\d][\\d]|[2][0-4][\\d]|[2][5][0-5])."
                + "([1][\\d][\\d]|[0][0][0]|([0][0]|)[\\d]|([0]|)[\\d][\\d]|[2][0-4][\\d]|[2][5][0-5])."
                + "([1][\\d][\\d]|[0][0][0]|([0][0]|)[\\d]|([0]|)[\\d][\\d]|[2][0-4][\\d]|[2][5][0-5])";

        try {
            Pattern pr = Pattern.compile(pattern);
            Matcher mr = pr.matcher(ip);
            if (mr.matches()) {
                System.out.println("Valid ip");
            }

        } catch (PatternSyntaxException e) {
            System.out.println(e);
            isIp = true;
        }
        if (isIp)
            System.out.println("not valid ip");
    }
}

class SyntexChecker {
    public void check(String pattern) {

        try {
            Pattern.compile(pattern);
            System.out.println("valid");
        } catch (PatternSyntaxException e) {
            System.out.println(e);
        }
    }
}

class MCQ {


    public void start() {
        ArrayList<String> questions = new ArrayList<>();
        questions.add("Number of primitive data types in Java are?\n(A) 6\n(B) 7\n(C) 8\n(D) 9");
        questions.add("Number of primitive data types in Java are?\n(A) 6\n(B) 7\n(C) 8\n(D) 9");
        questions.add("Number of primitive data types in Java are?\n(A) 6\n(B) 7\n(C) 8\n(D) 9");
        questions.add("Number of primitive data types in Java are?\n(A) 6\n(B) 7\n(C) 8\n(D) 9");
        questions.add("Number of primitive data types in Java are?\n(A) 6\n(B) 7\n(C) 8\n(D) 9");
        questions.add("Number of primitive data types in Java are?\n(A) 6\n(B) 7\n(C) 8\n(D) 9");

        ArrayList<String> ans = new ArrayList<>();
        ans.add("C");
        ans.add("C");
        ans.add("C");
        ans.add("C");
        ans.add("C");
        ans.add("C");

        ArrayList<Boolean> Userans = new ArrayList<>();


        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to MCQ test java are you ready to give the test ? : ");


        for (int i = 0; i < questions.size(); i++) {
            System.out.println(questions.get(i));
            System.out.printf("Enter your option: ");
            String input = sc.nextLine().toUpperCase();

            if (input.equals(ans.get(i))) {
                Userans.add(true);
            } else {
                Userans.add(false);
            }
        }

        int correct = 0;

        for (int i = 0; i < questions.size(); i++) {
            if (Userans.get(i)) {
                correct++;
            }

        }
        System.out.println("Your test score is " + correct + " out of " + ans.size());


    }
}

class Student {
    String name;
    int roll;

    private String schoolName = "DM";


    Student(){
        this("default name",00);      // --->  one constructor calling other one
    }

    Student(Student other){
        this.name = other.name;
        this.roll = other.roll;
    }
    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}

public class Main {
    public static void main(String[] args) {


//Scanner sc = new Scanner(System.in);


//while (true) {
//
//    System.out.println("Are you ready to give the test Y/N: ");
//    String ch = sc.nextLine();
//
//    if(ch.toUpperCase().equals("Y")){
//    MCQ obj = new MCQ();
//    obj.start();
//    break;
//    }
//    if(ch.toUpperCase().equals("N")){
//        System.out.println("OK bye :");
//        break;
//    }
//}
//
//



//        {
//
//            Student s1 = new Student("naveen",12);
//            Student s2 = new Student(s1);
//            Student s3 = new Student();
//
//            System.out.println(s1.name);
//            System.out.println(s2.name);
//            System.out.println(s3.name);
//        }         //class and object




    }
}