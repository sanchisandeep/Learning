import java.util.Scanner;
public class unionarrays
{
    public static void main(String[] args) 
    {
        int m, n, k, i = 0, flag = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in first array:");
        m = s.nextInt();
        System.out.print("Enter no. of elements you want in second array:");
        n = s.nextInt();
        k = m;
        int a[] = new int[m];
        int b[] = new int[n];
        int c[] = new int[m+n];
        int d[] = new int[m];
        System.out.println("Enter all the elements in first array:");
        for(i = 0; i < m; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println("Enter all the elements in second array:");
        for(i = 0; i < n; i++)
        {
            b[i] = s.nextInt();
        }
        for(i = 0; i < m; i++)
        {
            c[i] = a[i];
        }
        for(i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(b[i] != a[j])
                {
                    flag = 1;
                }
                else
                {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)
            {
                c[k] = b[i];
                k++;
            }
        }
		System.out.print("Union:");
	}
}