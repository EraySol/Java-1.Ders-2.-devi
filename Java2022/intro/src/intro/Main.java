package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello word!");
		String üstmetin="İlginizi çekebilir";
		String altmetin="Vade Hesabı";
		
        System.out.println(üstmetin);	
        
        double dolarbugun=18.20;
        double dolardun=18.21;
        
       
        
        String okyonu="";
        
        if (dolarbugun<dolardun) {
 		
     	   okyonu="down.svg";
     	   System.out.println(okyonu);
 	}
        else if(dolarbugun>dolardun) 
        {
        	okyonu="up.svg";
      	   System.out.println(okyonu);
        }
        else {
        	okyonu="equal.svg";
       	   System.out.println(okyonu);
		}
        
        String[]kredı= {"krediler,kredi hızlı,ihtiyaç kredisi,tüketici kredisi"};
        
        for (int i = 0; i < kredı.length; i++) {
			System.out.println(kredı[i]);
		}
	}

}
