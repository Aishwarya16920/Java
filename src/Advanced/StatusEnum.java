package Advanced;

public class StatusEnum {
    public static void main(String[] args){
        Status s = Status.RUNNING;
        System.out.println(s);

        System.out.println(s.ordinal());

        Status[] arr = Status.values();
        System.out.println(arr[1]);

        for(Status status: arr){
            System.out.println(status);
            System.out.println(status.ordinal());
        }
    }
}
