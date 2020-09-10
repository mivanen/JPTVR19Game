package jptvr19game;

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
            if(myNumber == gamerNumber)
            {
            System.out.println("Congradulation you`r win!");
            }
            else
            {
                 System.out.println("You`r loose!");
            }
            
        }
   
    
}
