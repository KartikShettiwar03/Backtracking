public class prblm_3_{ 
    public static void findPermutaion(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0 ; i<str.length() ; i++){
            char curr = str.charAt(i);
            // abc -> a + c = ac
            String Newstr = str.substring(0,i) + str.substring(i+1, str.length());
            findPermutaion(Newstr,ans+curr);
        }
    }
    public static void main(String args[]){
        findPermutaion("abc","");
    }
}