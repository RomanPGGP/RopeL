import java.io.*;
//import java.util.HashMap;
//import java.util.Map;
import java.util.*;
class Simbolo{
		String nombre;
		Integer valor;
		Integer direccion;
		public Simbolo(String nombre, Integer valor, Integer direccion){
			this.nombre = nombre;
			this.valor = valor;
			this.direccion= direccion;
		}
	}
public class TabladeSimbolos{
		HashMap l;
		Integer direccionCount=1;
		public TabladeSimbolos(){
			l = new HashMap();
		}
		public Simbolo Insertar(String nombre){
			Simbolo s = new Simbolo(nombre, new Integer(0), direccionCount++);
			l.put(nombre,s);
			return s;
		}
		public Simbolo Buscar(String nombre, Integer nvalor){
				Simbolo s;
				s = (Simbolo)(l.get(nombre));
				s.valor = nvalor;
			return s;
		}
		public Integer GetDireccion(String nombre){ 
				Simbolo s;
				s = (Simbolo)(l.get(nombre));
			return s.direccion;
		}
		public void Imprimir(){
			Iterator it = l.values().iterator();
			while(it.hasNext()){
				Simbolo s= (Simbolo)it.next();
				System.out.println(s.nombre + ":" + s.valor + ":" + s.direccion);
			}
		}
	}