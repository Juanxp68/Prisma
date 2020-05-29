/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Nucks
 */
public class AreaPrismaOOP {
    
     //hola
	
	
	public static void main(String[] args) throws Exception {
		
		  Random sc = new Random();
		  Prisma objetos=null;
		  ArrayList<Float> Areas=new ArrayList<>();
		
		
		System.out.println("--------------------------");
		System.out.println("--------------------------");
		System.out.println("CREACION DE OBJETOS PRISMA");
		System.out.println("--------------------------");
		System.out.println("--------------------------");
		
		
		
		for (int i=1; i<=3;i++) {
			
		System.out.println("Creado el objeto prisma "+i+" con: ");
		objetos= new Prisma(sc.nextInt(15)+1);
		System.out.println("-Base: " +objetos.ObtenerbaseTriangulo());
		objetos.setalturaPrisma(sc.nextInt(15)+1); 
		System.out.println("-Altura: " +objetos.ObteneralturaPrisma());
		System.out.println("-Area: " +objetos.areaTotal());
		System.out.println();
		Areas.add((float) objetos.areaTotal());
		
			
			
		}
		
		System.out.println("--------------------------");
		System.out.println("--------------------------");
		System.out.println("Ordenados de mayor a menor");
		Collections.sort(Areas);
		Collections.reverse(Areas);
		
	
	
		for(int j=0;j<Areas.size();j++) {
		System.out.println("-Prisma "+(j+1)+": " +(Areas.get(j)));
		}
		

		
		
		
		
		
	}
	
	
}


	
	
	

    
    
    

