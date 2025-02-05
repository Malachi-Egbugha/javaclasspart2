public class Imple extends Cal{
    public Imple(int inputone, int inputtwo) {
        super(inputone, inputtwo);
    }

    @Override
    int Add(){
        return super.inputone + super.inputtwo;
    }

    @Override
    int Multiply() {
        return super.inputone * super.inputtwo;
    }

    @Override
    int Subtract() {
        return super.inputone - super.inputtwo;
    }
}
