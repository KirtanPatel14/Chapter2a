package com.company;

class Fraction {
    private int numerator;    //attributes
    private int denominator;

    // constructor
    public Fraction(int n, int d)  // constructor
    {
        numerator = n;
        denominator = d;
    }

    public Fraction(){

        numerator = 1;
        denominator = 2;
    }

    public int getNum()
    {
        return numerator;
    }
    public int getDenom()
    {
        return denominator;
    }
    public Fraction add(Fraction other)
    {
        int n = this.numerator*other.denominator + this.denominator*other.numerator;
        int d = this.denominator * other.getDenom();
        Fraction result = new Fraction(n,d);
        return result;
    }

    // TODO  subtract()
    public Fraction subtract(Fraction other){
        int n = this.numerator*other.denominator - this.denominator*other.numerator;
        int d = this.denominator* other.denominator;
        Fraction result = new Fraction(n,d);
        return result;
    }
    // TODO multiply()
    public Fraction multiply(Fraction other){
        int n = this.numerator* this.denominator;
        int d = this.denominator* other.denominator;
        Fraction result = new Fraction(n,d);
        return result;
    }

    public String toString(){
        String s = numerator + "/" +denominator;
        return s;
    }

    // TODO reciprocal()
    public Fraction reciprocal(){
        int n = denominator;
        int d = numerator;
        Fraction result = new Fraction(n,d);
        return result;
    }


    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,4);   // create an instance of fraction
        Fraction f2 = new Fraction(4,5);
        Fraction g2 = new Fraction(4,6);   // create an instance of fraction
        Fraction g1 = new Fraction(7,8);

        Fraction f3 = f1.add(f2);
        Fraction f4 = f1.subtract(f2); // add 2 fractions
        Fraction f5 = f1.multiply(f2);
        Fraction f6 = f1.reciprocal();
        System.out.println("3/4 + 4/5 = " + f3);
        System.out.println("3/4 - 4/5= "+ f4);// print the answer
        System.out.println("3/4 x 4/5= "+ f5);
        System.out.println("the reciprocal of 3/4 is "+f6);

        Fraction g3 = g1.add(g2);
        Fraction g4 = g1.subtract(g2);
        Fraction g5 = g1.multiply(g2);
        Fraction g6 = g1.reciprocal();
        System.out.println("7/8 + 4/6 = " + g3);
        System.out.println("7/8 - 4/6= "+ g4);// print the answer
        System.out.println("7/8 x 4/6= "+ g5);
        System.out.println("the reciprocal of 7/8 is "+g6);
    }

}

/*  Output
3/4 + 4/5 = 31/20
3/4 - 4/5= -1/20
3/4 x 4/5= 12/20
the reciprocal of 3/4 is 4/3
7/8 + 4/6 = 74/48
7/8 - 4/6= 10/48
7/8 x 4/6= 56/48
the reciprocal of 7/8 is 8/7
*/