public class Fraction {
    int numer;
    int denom;
    int cel;

    public Fraction(int numer, int den) {
        this.numer = numer;
        denom = den;

        //Finding int
        if (this.numer % denom == 0) {
            cel = this.numer / denom;
            this.numer -= denom * cel;
        } else if (this.numer > denom) {
            for (int i = denom; i <= this.numer; i++) {
                if (this.numer % i == 0) {
                    cel = this.numer / denom;
                    this.numer -= denom * cel;
                }
            }
        }

        //Abbreviating fraction
        int del = this.numer > denom ? denom : this.numer;
        while (del > 1) {
            if (this.numer % del == 0 && denom % del == 0) {
                this.numer /= del;
                denom /= del;
            } else del--;
        }
    }

    //Setters
    public void setNumer(int numer) {
        this.numer = numer;
    }

    public void setDenom(int denom) {
        if (denom != 0)
            this.denom = denom;
    }


    //Summation
    Fraction sumFraction(Fraction secondFrac) {
        int celp = cel;
        Fraction result = new Fraction(numer * secondFrac.denom + secondFrac.numer * denom, denom * secondFrac.denom);
        secondFrac.cel += celp;
        result.cel += secondFrac.cel;
        return result;
    }

    //Printing
    @Override
    public String toString() {
        if (numer == 0) return cel + "";
        if (cel != 0)
            return cel + " int " + numer + "/" + denom;
        else return numer + "/" + denom;
    }
}
