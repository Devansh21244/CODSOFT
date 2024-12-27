import java.util.Scanner;
class range{
    public int generate(int max, int min){
        return (int) (Math.random()*(max-min+1)+min);
    }
}

public class game{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        range rg=new range();
        int TA=0;
        int win=0;

        while(true){
            System.out.println("Minimum number is:");
            int min=s.nextInt();
            System.out.println("Maximum number is:");
            int max=s.nextInt();
            s.nextLine();
            int c=rg.generate(max,min);
            int A=0;

            while(true){
                System.out.println("Guess a number between "+min+" and "+max);
                int g=s.nextInt();
                A++;

                if(g>c){
                    System.out.println("Greater Number");
                }
                else if(g<c){
                    System.out.println("Lower Number");
                          
                }
                else{
                    System.out.println("Correct guess");
                    win++;
                    break;
                }
            }
            TA=TA+A;
            System.out.println("Attempt="+A);
            System.out.println("Wins="+win);

            double winrate=(double) win/TA*100;
            System.out.printf("winrate is %.2f%%\n",winrate);
            System.out.println("Do you want to play again (yes / no)");
            String PA=s.next();
            if(!PA.equalsIgnoreCase("yes")){
                s.close();
                System.exit(0);

            }
          s.nextLine();
        }
    }
}