package jptvr19game;

import java.util.Random;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pupil
 */
public class App 
{
    
        public void run()
        {
            System.out.println("Hallo");
            System.out.println("Угадай число:");
            //int myNumber = 2;                    
            
            
            Random random=new Random();
            int numRandom=random.nextInt(3-0+1)+3;
           // random.nextInt(max-min+1)+min;
            
          //  System.out.println(numRandom);
            for(int i=1;i<=3;i++)
            {
                System.out.println("Попытка нр."+i);
                Scanner scanner=new Scanner(System.in);
                int gamerNumber = scanner.nextInt();

                if(gamerNumber == numRandom)
                {
                System.out.println(":) Congradulation you`r win! Actually number was "+numRandom);
                }
                else
                {
                     System.out.println(":( You`r loose! Number was "+numRandom);
                }
             }
       
            
        }

    
}
