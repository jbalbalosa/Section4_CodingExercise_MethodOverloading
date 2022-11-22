public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        System.out.println("-- Udemy: Java Programming Masterclass --");
        System.out.println("-- Method Overloading                  --");
        System.out.println("-----------------------------------------");

        /*int newScore = calculateScore("Jeff", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();*/

        double feetToCentimeter = calcFeetAndInchesToCentimeters(2, 2);
        System.out.println("feetToCentimeter = " + feetToCentimeter);

        double feetToInches = calcFeetAndInchesToCentimeters(6);
        System.out.printf("feetToinches = " + feetToInches);
    }
/*
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed player "  + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("Unnamed player, no player sore");
        return 0;
    }*/

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0 && (inches >= 0 && inches <=12)){
            return ((feet * 12) + inches) * 2.54;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
            return inches / 12;
        }
        return -1;
    }

}