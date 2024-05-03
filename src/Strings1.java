public class Strings1 {
    public static void main(String[] args) {
        String name="Phani";
//        StringBuilder name1=new StringBuilder("Phani");
//        name1.reverse();
//        System.out.println(name1);
        String reverse="";
        for(int i=name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.println(reverse);
        char revereseI=reverse.charAt(0);
        System.out.println(revereseI);
        System.out.println(Character.toUpperCase(revereseI));
        System.out.println(Character.toLowerCase(reverse.charAt(reverse.length()-1)));
        System.out.println(reverse.substring(1,4));
     String first= String.valueOf(Character.toUpperCase(revereseI));
     String last= String.valueOf(Character.toLowerCase(reverse.charAt(reverse.length()-1)));
        String middle=reverse.substring(1,4);
        String output=first+middle+last;
        System.out.println(output);


    }
}
