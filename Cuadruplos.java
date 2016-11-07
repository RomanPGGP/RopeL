import java.io.*;
//import java.util.HashMap;
//import java.util.Map;
import java.util.*;
class Expresion{
		String operacion;
		Integer valor1;
		Integer valor2;
		Integer result;

		public Expresion(String operacion, Integer valor1, Integer valor2, Integer result){
			this.operacion = operacion;
			this.valor1 = valor1;
			this.valor2 = valor2;
			this.result = result;
		}
}
public class Cuadruplos{
		HashMap l;
		Integer cont = 1;
		public Cuadruplos(){
			l = new HashMap();
		}
		public Expresion Insertar(String op, Integer v1, Integer v2, Integer res){
			Expresion r = new Expresion(op, v1, v2, res);
			l.put(cont,r);
			cont++;
			return r;
		}
		public void Rellena(Integer dir, Integer contador)
		{
			Expresion aux = (Expresion)l.get(dir);
			aux.result = contador;
		}

		public Integer GetCont()
		{
			return cont-1;
		}

		public void Imprimir(){
			Iterator it = l.values().iterator();
			Integer cnt = 0;
			while(it.hasNext()){
				Expresion r= (Expresion)it.next();
				System.out.println( cnt +" "+ r.operacion + " : " + r.valor1 + " : " + r.valor2 + " : " + r.result);
				cnt++;
			}
		}
}