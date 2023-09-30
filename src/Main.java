public class Main {
    public static void main(String[] args) {
        String s= "I love you";
        System.out.println(s);

        System.out.println(s + " forever");

        System.out.println(s.substring(0,8));

        String s1=s.substring(0,2);
        String s2=s.substring(2,7).replace("love","hate");
        String s3=s.substring(7,10);
        System.out.println(s1+s2+s3);

    }
}
