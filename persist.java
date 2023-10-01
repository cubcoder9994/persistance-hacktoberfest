import java.util.*;
class persist{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for(int i=1;i*i<=n;i++){
if(n%i==0){
System.out.println("Not Prime");
break;
}
}
System.out.println("Prime");
}
}
