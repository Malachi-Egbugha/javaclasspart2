abstract class Cal {
int inputone;
int inputtwo;

    public Cal(int inputone, int inputtwo) {
        this.inputone = inputone;
        this.inputtwo = inputtwo;
    }

    abstract  int Add();
    abstract int Subtract();
    abstract  int Multiply();
}