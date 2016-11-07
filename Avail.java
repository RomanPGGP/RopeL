import java.io.*;
//import java.util.HashMap;
//import java.util.Map;
import java.util.*;
class Temporal{
		String nombre;
		Integer valor;
		Integer direccion;
		Integer edo;
		public Temporal(String nombre, Integer valor, Integer direccion, Integer edo){
			this.nombre = nombre;
			this.valor = valor;
			this.direccion = direccion;
			this.edo = edo;
		}
}
public class Avail{
		HashMap l;
		String nom;
		
		public Avail(){
			l = new HashMap();
			
			for (Integer i=0; i<10 ; i++) {
				Integer dir=100 + i;
				nom = 'T' + i.toString();
				Temporal r = new Temporal(nom, new Integer(0), dir, new Integer(0));
				l.put(dir,r);
			}
		}

		public Integer GetTemp()
		{	
				Iterator it = l.values().iterator();
				while(it.hasNext()){
				Temporal r= (Temporal)it.next();
					if(r.edo == 0)
					{
						r.edo=1;
						return r.direccion; 
					}
				}
			return -1;
		}
		public void Retrieve(Integer dir)
		{
			Temporal t;
			t = (Temporal)(l.get(dir));
			t.edo=0;
		}

		public void Imprimir(){
			Iterator it = l.values().iterator();
			while(it.hasNext()){
				Temporal r= (Temporal)it.next();
				System.out.println(r.nombre + ":" + r.valor +  ":" + r.direccion);
			}
		}
}

/*

*/