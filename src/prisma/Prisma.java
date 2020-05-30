/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisma;

/**
 *Clase Prisma Prisma
 * @author Nucks
 * 
 */
public class Prisma {


    int baseTriangulo;
    int alturaPrisma;	

	 
Prisma(int baseTriangulo) {
	
   this.baseTriangulo=baseTriangulo;
	
}

Prisma(int baseTriangulo, int alturaPrisma) {
	
	   this.baseTriangulo=baseTriangulo;
	   this.alturaPrisma=alturaPrisma;		
	}


public int  ObtenerbaseTriangulo() {
	
	return baseTriangulo;
}

public int ObteneralturaPrisma() {
	
	return alturaPrisma;
}

public void setalturaPrisma(int alturaPrisma) {
	
	this.alturaPrisma=alturaPrisma;
}

	
	
public float alturaTriangulo () {
	
	double h=0.86602540378*baseTriangulo;
	return (float) h;
}


public float areaBase () {
	
	float areabase=(baseTriangulo*alturaTriangulo())/2;
	return areabase;
}

public float perimetro () {
	
	float perimetro=(3*baseTriangulo);
	return perimetro;
	
}

public float areaLateral () { 
	
	float arealateral=(perimetro()*(alturaPrisma));
	return arealateral;
	
}

public float areaTotal () {
	
	
	float areaTotal=2*(areaBase() +areaLateral());
	return areaTotal;
	
}
	
}




