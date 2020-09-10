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
            int myNumber = 2;                    
            Scanner scanner=new Scanner(System.in);
            int gamerNumber = scanner.nextInt();
            
            Random random=new Random();
            int numRandom=random.nextInt(3);
            System.out.println(numRandom);
            
            
            
            if(myNumber == numRandom)
            {
            System.out.println(":) Congradulation you`r win! Actually number was "+numRandom);
            }
            else
            {
                 System.out.println(":( You`r loose! Number was "+numRandom);
            }
            
        }

    
}
