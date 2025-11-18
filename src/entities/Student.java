package entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade () {

        return (grade1 + grade2 + grade3);

    }

    public String toString () {

        double amount = finalGrade ();

        if (amount>= 18) {
            return "\nParabéns você passou!"
                    +"\nSua nota final foi de: "
                    + String.format("%.2f", amount);
        }
        else {
            double missing = 18 - amount;
            return "\nInfelizmente você reprovou!"
                    +"\nSua nota final foi de: "
                    + String.format("%.2f", amount)
                    +"\nFaltaram: "
                    + String.format("%.2f", missing) + " pontos.";
        }
    }
}
