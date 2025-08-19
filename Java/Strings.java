public class Strings {
    public static void main(String[] args) {
        reverse_String();
    }
    static void reverse_String(){
        String p="helllo";
        String r="";
        for(int i=p.length()-1;i>=0;i--){
            r+=p.charAt(i);
        }
        System.out.println(r);
    }
}
