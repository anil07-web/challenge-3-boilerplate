import java.util.Scanner;

   class Task3 {
        public static void main(String[] args) {  
            float i,fa;
            char c;
            Scanner obj=new Scanner(System.in);
            do{
            System.out.println("Enter the temperature in Degree Celsius:");
             i=obj.nextFloat();
             fa=9*i/5+32;
            System.out.println("Temperature(Celsius)= "+i+"             Temperature(Fahrenheit)="+fa);
            System.out.println("Do you wish to continue(y/n)?");
              c=obj.next().charAt(0);
            }while(c=='y'||c=='Y');

}
}
