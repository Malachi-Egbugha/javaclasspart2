public class Calculator {
    int inputone;
    int inputtwo;

    public Calculator(int inputone, int inputtwo) {
        this.inputone = inputone;
        this.inputtwo = inputtwo;
    }
    public  int Add(){
        return this.inputone + this.inputtwo;
    }
    public int Subtract(){
        return this.inputone - this.inputtwo;
    }
}
