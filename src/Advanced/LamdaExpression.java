package Advanced;

public class LamdaExpression {
    public static void main(String args[]){
        LambdaExpressionInterface obj = () ->{
            System.out.println("In Show");
        };
        obj.show();
    }
}
