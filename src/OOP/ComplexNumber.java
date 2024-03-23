package OOP;

public class ComplexNumber {
    private double magnitude;
    private double angle;

    private double real;
    private double imaginary;
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
        calc_polar();
    }

    public ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }


    public String showRect(){
        StringBuilder form = new StringBuilder();
        form.append((int)this.real);
        form.append("+");
        form.append((int)this.imaginary);
        form.append("\033[3mi\033[0m");
        return form.toString();
    }

    public String showPolar(){
        return this.magnitude + "/" + this.angle;
    }

//    public String getPolar(){
//
//    }
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }



    public double getMagnitude() {
        return magnitude;
    }

    public double getAngle() {
        return angle;
    }





    public void calc_polar(){
        this.magnitude = Math.sqrt(Math.pow(this.real,2)+Math.pow(this.imaginary,2));
        this.angle = Math.atan(this.imaginary/this.real);
    }




}
