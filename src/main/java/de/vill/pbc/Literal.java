package de.vill.pbc;

public class Literal implements Cloneable{
    public String name;
    public double factor;
    public boolean sign = true;
    public Literal(){}
    public Literal(double factor, String name, boolean sign) {
        this.name = name;
        this.factor = factor;
        this.sign = sign;
    }

    @Override
    public Literal clone() {
        Literal literal = null;
        try {
            literal = (Literal) super.clone();
        } catch (CloneNotSupportedException e) {
            literal = new Literal();
            literal.name = this.name;
            literal.factor = this.factor;
            literal.sign = this.sign;
        }
        return literal;
    }

    @Override
    public String toString() {
        String signString = "+";
        if (factor < 0) {
            signString = "";
        }
        return " " + signString + String.format("%.0f", factor) + " * " + (sign ? name : "neg(" + name + ")");
    }
}
