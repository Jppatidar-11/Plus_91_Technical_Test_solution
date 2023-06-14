package exam.com;
import java.util.*;

public class ChefAndSon
{
    public static void main (String[] args) 
    {
       
        Scanner scan= new Scanner(System.in);
        int t,k,n;
        t=scan.nextInt();
        while(t>0)
        {
            n=scan.nextInt();
            k=scan.nextInt();
            int weight[]=new int[n];
            for(int i=0;i<n;i++)
            {
                weight[i]=scan.nextInt();
            }
            Arrays.sort(weight);
            int sumSon=0,sumChef=0;
            if(k<=n-k)
            {
                for(int i=0;i<k;i++)
                {
                    sumSon=sumSon+weight[i];
                }
                for(int i=k;i<n;i++)
                {
                    sumChef=sumChef+weight[i];
                }
            }
            else
            {
                for(int i=0;i<n-k;i++)
                {
                    sumSon=sumSon+weight[i];
                }
                for(int i=n-k;i<n;i++)
                {
                    sumChef=sumChef+weight[i];
                }
            }
            System.out.println(sumChef-sumSon);
            t--;
        }
}
}