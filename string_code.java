import java.util.HashMap;
public class string_code {
    static boolean check(String x){
        boolean flag=false;
        int c=0;
        int m=0;
        char ch;
        HashMap<Character,Integer> hm=new HashMap<>();
        int l=x.length();
        for(int i=x.length()-1;i>=0;i--){
            ch=x.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }
            else{
                hm.put(ch, 1);
            }
        }
        if(l%2==0){
            for(int i=0;i<l;i++){
                ch=x.charAt(i);
                if(hm.containsKey(ch)){
                    if(hm.get(ch)%2!=0){
                        flag=false;
                    }
                    else{
                        flag=true;
                    }
                }
            }
        }
        else if(l%2!=0){
            for(int i=0;i<l;i++){
                ch=x.charAt(i);
                if(hm.containsKey(ch)){
                    if(hm.get(ch)%2!=0){
                        c++;
                    }
                    else{
                        m++;
                    }
                }
            }
            if(c==1 && m%2==0){
                flag=true;
            }
            else{
                flag=false;
            }
        }    
        return flag;
    }
    public static void main(String[] args) {
        String x="abc";
        boolean result=check(x);
        System.out.println(result);
    }
}