import java.util.*;
public class sentence {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a sentence to get word count:");
       String str=sc.nextLine();
       HashMap<String,Integer> map=new HashMap<>();
       int count=0;
       
        char ch[]=str.toCharArray();
        
        int c=0;
        for(int i=0;i<ch.length;i++){
           if(ch[i]==' '){
             count++;
           }
        }
        
        String arr[]=str.split(" ");
        
        
        for(int i=0;i<count+1;i++){
            c=0;
            for(int j=0;j<count+1;j++){
                String value=compare(arr[i],arr[j]);
                if(value=="0"){
                    c++;
                  
                }
            }
            map.put(arr[i],c);
        }
        System.out.print(map);
       
        
    }
    static String compare(String str3,String str4){
        char ch1[]=str3.toCharArray();
        char ch2[]=str4.toCharArray();
        int c=0;
        int l1 = str3.length();
        int l2 = str4.length();
        int min = Math.min(l1,l2);
        for(int i=0;i<min;i++){
            if(ch1[i]==ch2[i]){
                 c++;
            }
        }
        if((c==l1)||(c==l2)){
            return "0";
        }
        else{
            return "1";
        }
    }
    
}

