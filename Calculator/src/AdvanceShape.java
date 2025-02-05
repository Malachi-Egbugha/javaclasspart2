public class AdvanceShape extends  Calculator {
    int length;
    int breadth;
    int height;

    public AdvanceShape(int length, int height, int breadth, int inputone, int inputtwo)
    {
        super(inputone, inputtwo);
        this.length = length;
        this.height = height;
        this.breadth = breadth;
    }
    public void AreaTriangleAddition (){
        System.out.print(super.Add());
        System.out.print(this.length * this.breadth * this.height);

    }


}
