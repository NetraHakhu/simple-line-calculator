//arrys, map,hashmap,scanner
// mean= single traversal=0(n)
//median= array sorting =O(n log n)
// mode= frequency- o(n)
//percentage= cont time= 0(1)

import java.util.*;

public class StatisticsUtil {

    public static double mean(double[] arr) {
        double sum = 0; for (double x : arr) sum += x; return sum / arr.length;
    }
// add all elemets and divide by number of elements= array traversal
    public static double median(double[] arr) {
        Arrays.sort(arr); int n = arr.length;
        return n % 2 == 0 ? (arr[n/2] + arr[n/2 -1])/2.0 : arr[n/2];
    }

    public static double mode(double[] arr) {
        Map<Double,Integer> freq = new HashMap<>();
        for(double x:arr) freq.put(x,freq.getOrDefault(x,0)+1);
        double mode=arr[0]; int max=0;
        for(Map.Entry<Double,Integer> e:freq.entrySet()) if(e.getValue()>max){max=e.getValue(); mode=e.getKey();}
        return mode;
    }

    public static double percentage(double obtained, double total) { return (obtained/total)*100; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Statistics Utility\n1.Mean 2.Median 3.Mode 4.Percentage");
        System.out.print("Enter choice: "); int choice=sc.nextInt();

        if(choice>=1 && choice<=3){
            System.out.print("Enter number of elements: "); int n=sc.nextInt();
            double[] arr=new double[n];
            System.out.println("Enter numbers:"); for(int i=0;i<n;i++) arr[i]=sc.nextDouble();
            switch(choice){
                case 1: System.out.println("Mean = "+mean(arr)); break;
                case 2: System.out.println("Median = "+median(arr)); break;
                case 3: System.out.println("Mode = "+mode(arr)); break;
            }
        } else if(choice==4){
            System.out.print("Enter obtained marks: "); double ob=sc.nextDouble();
            System.out.print("Enter total marks: "); double tot=sc.nextDouble();
            System.out.println("Percentage = "+percentage(ob,tot)+"%");
        } else System.out.println("Invalid choice");
//        sc.close();
    }
}
