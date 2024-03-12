public class SkipACharacter {
    public static void main(String[] args) {

        String a="babachar";
        String ans=skip(a);
        System.out.println(ans);
    }
    public static String skip(String a){
        StringBuilder s=new StringBuilder();
        char[] ch=a.toCharArray();
        for(char c:ch){
            if(c!='a'){
                s.append(c);
            }
        }
        return s.toString();

    }
}