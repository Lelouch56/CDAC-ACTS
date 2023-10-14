import java.util.Scanner;

class VowelCount{
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String input=sc.nextLine();
    int l=input.length();
    int count=0;
    for(int i=0;i<l;i++){
        char c= input.charAt(i);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            count=count+1;
        }
    }

    System.out.println(count);
    sc.close();
 }
}
