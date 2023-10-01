import java.util.*;
class persist{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
System.out.println(isPrime(n)?"Prime":"Not Prime");
}
boolean isPrime(int n)
{
for(int i=1;i*i<=n;i++){
if(n%i==0){
return false;
}
}
return true;
}
}
