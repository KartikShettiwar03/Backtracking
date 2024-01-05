public class prblm_2_ {
    public static void subsets(String str,String ans,int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
            System.out.println(ans);
            }
            return;
        }
        String temp = "";
        temp += str.charAt(i);
        subsets(str,ans+temp,i+1);
        subsets(str,ans,i+1);
    }
    public static void main(String args[]){
        String str = "abc";
        subsets(str,"",0);
    }
}
