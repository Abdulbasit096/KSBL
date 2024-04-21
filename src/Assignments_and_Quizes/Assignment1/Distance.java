package Assignments_and_Quizes.Assignment1;

public class Distance {



    private double inch , feet , yard , rod , furlong;

    public double getFeet() {
        return feet;
    }

    public double getYard() {
        return yard;
    }

    public double getRod() {
        return rod;
    }

    public double getFurlong() {
        return furlong;
    }

    public double getInch(){
        return this.inch;
    }


    public Distance(double measurement , String unit) throws Exception {
        switch (unit.toLowerCase()){
            case "inch":
                this.inch = measurement;
                this.feet = measurement/12;
                this.yard = feet*3;
                this.rod= this.yard*5.5;
                this.furlong= this.rod*40;
                break;
            case "feet":
                this.feet = measurement;
                this.inch = this.feet*12;
                this.yard = feet*3;
                this.rod=this.yard*5.5;
                this.furlong=this.rod*40;
                break;
            case "yard":
                this.yard = measurement;
                this.feet = measurement*3;
                this.inch = this.feet*12;
                this.rod = this.yard*5.5;
                this.furlong=this.rod*40;
                break;
            case "rod":
                this.rod = measurement;
                this.yard = measurement/5.5;
                this.feet = this.yard/3;
                this.furlong = this.rod*40;
                this.inch = this.feet*12;
                break;
            case "furlong":
                this.furlong = measurement;
                this.rod = this.furlong/40;
                this.yard = this.rod/5.5;
                this.feet = this.yard/3;
                this.inch = this.feet*12;
                break;
            default:
                this.inch=0;
                this.yard=0;
                this.feet=0;
                this.rod=0;
                this.furlong=0;
                showWrongUnitError();
        }
    }

    public void showWrongUnitError() throws Exception {
        throw new Exception("Wrong unit provided, provide one of these (inch , feet , yard , rod or furlong)");
    }

    public String addDistance(Distance distance){
        double thisDis = this.getInch();
        double secondDis = distance.getInch();

        return ((int) (this.getInch() + distance.getInch())) + " inches.";
    }

    private void inchToFeet(){
            this.feet = this.inch/12;
    }
    private void feetToYard(){
        this.yard = this.feet*3;
    }

}
