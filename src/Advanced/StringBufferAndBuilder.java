package Advanced;

public class StringBufferAndBuilder {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Chocolate");
        System.out.println(sb.capacity());

        sb.append(" Icecream");
        String str = sb.toString();
        System.out.println(sb);

        sb.deleteCharAt(3);
        System.out.println(sb);

        sb.insert(3, 'c');
        System.out.println(sb);

        sb.setLength(30);
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        System.out.println(sb);

        System.out.println("________________");

        StringBuilder stringBuilder = new StringBuilder("Chocolate");
        System.out.println(stringBuilder.capacity());

        stringBuilder.append(" Icecream");
        String str1 = stringBuilder.toString();
        System.out.println(stringBuilder);

        stringBuilder.deleteCharAt(3);
        System.out.println(stringBuilder);

        stringBuilder.insert(3, 'c');
        System.out.println(stringBuilder);

        stringBuilder.setLength(30);
        stringBuilder.ensureCapacity(100);
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder);

    }
}
