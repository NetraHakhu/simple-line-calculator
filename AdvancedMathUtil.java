//sin cos tan= 0(1)
//LOG , SQRT EXPONENT o(1)
//FACTORIAL= LOOP(0(N)


import java.util.Scanner;

public class AdvancedMathUtil {

    public static double sin(double d){return Math.sin(Math.toRadians(d));}
    public static double cos(double d){return Math.cos(Math.toRadians(d));}
    public static double tan(double d){return Math.tan(Math.toRadians(d));}
    public static double log(double d){return Math.log10(d);}
    public static double sqrt(double d){return Math.sqrt(d);}
    public static long factorial(int n){long f=1;for(int i=1;i<=n;i++) f*=i; return f;}

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Advanced Math Utility\n1.sin 2.cos 3.tan 4.log 5.sqrt 6.factorial 7.exponent(a^b)");
        System.out.print("Enter choice: "); int choice=sc.nextInt();
        switch(choice){
            case 1: System.out.print("Angle in degrees: "); System.out.println("sin="+sin(sc.nextDouble())); break;
            case 2: System.out.print("Angle in degrees: "); System.out.println("cos="+cos(sc.nextDouble())); break;
            case 3: System.out.print("Angle in degrees: "); System.out.println("tan="+tan(sc.nextDouble())); break;
            case 4: System.out.print("Number: "); System.out.println("log="+log(sc.nextDouble())); break;
            case 5: System.out.print("Number: "); System.out.println("sqrt="+sqrt(sc.nextDouble())); break;
            case 6: System.out.print("Integer: "); System.out.println("factorial="+factorial(sc.nextInt())); break;
            case 7:
                System.out.print("Base a: "); double a=sc.nextDouble();
                System.out.print("Exponent b: "); double b=sc.nextDouble();
                System.out.println(a+"^"+b+"="+Math.pow(a,b)); break;
            default: System.out.println("Invalid choice");
        }
//        sc.close();
    }
}
