/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.java.konversi.suhu;

import java.util.Scanner;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author asus
 */
@Controller
public class suhu {
        public static void main (String[]args){
        double c,r,f,k; 
   Scanner input = new Scanner(System.in);
        System.out.print("Celsius");
          c = input.nextInt(); 
          r = c*4/5; 
          f = (c*9/5)+32;
          k = c+273.15; 
        System.out.println("  ");   
        System.out.println("Reamur = "+r);     
        System.out.println("Fahrenheit = "+f); 
        System.out.println("Kelvin = "+k);     
    }
}
    

