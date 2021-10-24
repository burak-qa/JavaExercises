public class ExercisesDay1 {
    String name = "Burak", surName= "Sahin";
	boolean studentMi = false;
	int not=85, yas=40;
	double aver= 78.5;

    //Main Method
    public static void main(String[] args) {
        average(85.2, 90.3);  //method call
    };
    //Method
    public static void average(double num1, double num2) {
    System.out.println("the average of the two numbers you entered:" + (num1+num2)/2);
    };
}
