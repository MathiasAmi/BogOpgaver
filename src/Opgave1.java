public class Opgave1 {

    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        System.out.println("Learning Java now");
        System.out.println("Programming is fun");


//Opgave 1.2
        System.out.println("");
        System.out.println("Opgave 1.2");

        System.out.println("I love Java");
        System.out.println("I love Java");
        System.out.println("I love Java");
        System.out.println("I love Java");
        System.out.println("I love Java");

//Opgave 1.3
        System.out.println("");
        System.out.println("Opgave 1.3");

        System.out.println("    J");
        System.out.println("J  aaa   v    vaaa");
        System.out.println("J     aa     v  v   a  a");
        System.out.println("J   aaaa       v     aaaa");

//Opgave 1.4
        System.out.println("");
        System.out.println("Opgave 1.4");

        System.out.println("a   a^2   a^3   a^4");
        System.out.println("1    1     1      1");
        System.out.println("2    4     8      16");
        System.out.println("3    9     27     81");
        System.out.println("4    16    64     256");

//Opgave 1.5
        System.out.println("");
        System.out.println("Opgave 1.5");

        // Bruger ikke anførselstegn her, da den skal regne et stykke, og ikke skrive en tekst.

        System.out.println((7.5 * 6.5 - 4.5 * 3) / (47.5 - 5.5));

//Opgave 1.6
        System.out.println("");
        System.out.println("Opgave 1.6");

        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7+ 8 + 9 + 10);

//Opgave 1.7
        System.out.println("");
        System.out.println("Opgave 1.7");

        double pi = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11);
        System.out.println(pi);
        double pi1 = 4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
        System.out.println(pi1);

//Opgave 1.8
        System.out.println("");
        System.out.println("Opgave 1.8");

        final double PI = 3.14159;
        double radius = 6.5;
        double perimeter = 2 * radius * PI;
        double area = radius * radius * PI;

        System.out.println("circle perimeter =");
        System.out.println(perimeter);
        System.out.println("circle area =");
        System.out.println(area);

//Opgave 1.9
        System.out.println("");
        System.out.println("Opgave 1.9");

        double area1 = 5.3 * 8.6;
        double perimeter1 = 2 * (5.3 + 8.6);

        System.out.println(area1);
        System.out.println(perimeter1);

//Opgave 1.10
        System.out.println("");
        System.out.println("Opgave 1.10");

        double distance = 15;
        double time = 60*50+30;
        double Mph = ((distance/1.6)/(time)*(60*60));
        System.out.println("Mp/h " + Mph);



//Opgave 1.11
        System.out.println("");
        System.out.println("Opgave 1.11");

        double BirthPerYear = (60 * 60 * 24 * 365) / 7;
        double DeathPerYear = -(60 * 60 * 24 * 365) / 13;
        double NewImmigrant = (60 * 60 * 24 * 365) / 45;

        double Population = 312032486;
        double year1 = Population + BirthPerYear + DeathPerYear + NewImmigrant;
        double year5 = (BirthPerYear + DeathPerYear + NewImmigrant) * 5 + Population;
        System.out.println("Year one population =" + year1);
        System.out.println("population after 5 years =" + year5);

//Opgave 1.12

        System.out.println("");
        System.out.println("Opgave 1.12");

        double distance1 = 24;
        double time1 = 60*60+45+30;

        double kph = ((distance1*1.6)/(time1)*(60*60));
        System.out.println("Kp/h " + kph);
        
    }
}


