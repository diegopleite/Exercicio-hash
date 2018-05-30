package Texto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;







public class listas {
	private static ArrayList<String> texto1= new ArrayList<>();
	private static ArrayList<String> texto2= new ArrayList<>();
	private static ArrayList<String> texto3= new ArrayList<>();
	private static ArrayList<String> texto4= new ArrayList<>();
	private static ArrayList<String> texto5= new ArrayList<>();
	private static ArrayList<String> texto6= new ArrayList<>();
	private static ArrayList<String> texto7= new ArrayList<>();
	private static ArrayList<String> texto8= new ArrayList<>();
	private static ArrayList<String> texto9= new ArrayList<>();
	private static ArrayList<String> texto10= new ArrayList<>();
	private static HashSet<Conjunto> conjunto = new HashSet<Conjunto>();
	private static TreeMap<Integer, HashSet<Conjunto>> map = new TreeMap<Integer, HashSet<Conjunto>>();
	
	public static void adicionarmap (Integer a,HashSet<Conjunto> b) {
		map.put(a, b);
	}
public static TreeMap<Integer, HashSet<Conjunto>> listarmap(){
	return map;
}
	public static void adicionarconjunto(Conjunto a) {

		conjunto.add(a);
	}
	public static void adicionarpalavra(String a) {
		
		
		if(verificasetem(a)) {
			adicionafrequencia(a);
		}
		else {
			Conjunto c1 = new Conjunto (a,1);
			adicionarconjunto(c1);
		}
	}

	public static HashSet<Conjunto> listartodas2() {

		return conjunto;
	}
	public static void limpar() {

		 conjunto.clear();
	}
	public static boolean verificasetem(String a) {
		for (Conjunto b : listartodas2()) {
			if (b.getpalavra().equals(a)) {
				return true;
			}
		}
		return false;
	}
	public static void adicionafrequencia(String a) {
		for (Conjunto b : listartodas2()) {
			if (b.getpalavra().equals(a)) {
				Conjunto c = new Conjunto (b.getpalavra(),b.getfrequencia()+1);
				listartodas2().remove(b);
				listartodas2().add(c);
				break;
								
			}
		}
	
	}
	public static HashSet<Conjunto> clone(HashSet<Conjunto> a) {
		HashSet<Conjunto> c = new HashSet<Conjunto>();
		for (Conjunto b : a) {
			
			c.add(b);
		}
		return c;
	}

	public static void adicionalista(String a, int b) {
		
		if (b==1) {
			
			
			texto1.add(a);
		}
		if (b == 2) {
			texto2.add(a);
		}
		if (b == 3) {
			texto3.add(a);
		}
		if (b == 4) {
			texto4.add(a);
		}
		if (b == 5) {
			texto5.add(a);
		}
		if (b == 6) {
			texto6.add(a);
		}
		if (b == 7) {
			texto7.add(a);
		}
		if (b == 8) {
			texto8.add(a);
		}
		if (b == 9) {
			texto9.add(a);
		}
		if (b == 10) {
			texto10.add(a);
		}

	}
public static void adicionaporindex(int index,String a, int b) {
		
		if (b==1) {
			
			
			texto1.add(index, a);
		}
		if (b == 2) {
			texto2.add(index, a);
		}
		if (b == 3) {
			texto3.add(index, a);
		}
		if (b == 4) {
			texto4.add(index, a);
		}
		if (b == 5) {
			texto5.add(index, a);
		}
		if (b == 6) {
			texto6.add(index, a);
		}
		if (b == 7) {
			texto7.add(index, a);
		}
		if (b == 8) {
			texto8.add(index, a);
		}
		if (b == 9) {
			texto9.add(index, a);
		}
		if (b == 10) {
			texto10.add(index, a);
		}

	}
public static void removedalista(int p, int b) {
		
		if (b==1) {
			
			
			texto1.remove(p);
		}
		if (b == 2) {
			texto2.remove(p);
		}
		if (b == 3) {
			texto3.remove(p);
		}
		if (b == 4) {
			texto4.remove(p);
		}
		if (b == 5) {
			texto5.remove(p);
		}
		if (b == 6) {
			texto6.remove(p);
		}
		if (b == 7) {
			texto7.remove(p);
		}
		if (b == 8) {
			texto8.remove(p);
		}
		if (b == 9) {
			texto9.remove(p);
		}
		if (b == 10) {
			texto10.remove(p);
		}

	}

	public static ArrayList<String> listartodas(int a) {
		if (a == 1) {
			return texto1;
		}
		if (a == 2) {
			return texto2;
		}
		if (a == 3) {
			return texto3;
		}
		if (a == 4) {
			return texto4;
		}
		if (a == 5) {
			return texto5;
		}
		if (a == 6) {
			return texto6;
		}
		if (a == 7) {
			return texto7;
		}
		if (a == 8) {
			return texto8;
		}
		if (a == 9) {
			return texto9;
		}
		if (a == 10) {
			return texto10;
		}
		return null;
	}

	public static boolean procurasetem (String a, int j) {
		
		for (Conjunto b : map.get(j)) {
			if (b.getpalavra().equals(a)) {
				return true;
			}
		}
				
			
		
		return false;
	}
	public static HashSet<Conjunto> frequencia (int j) {
		return map.get(j);
	}

	
	
	public static HashSet<String> temnos2(int j ,int j2) {
	HashSet<String> a = new HashSet<String>();
	for (Conjunto b : map.get(j)) {
		for (Conjunto c : map.get(j2)) {
		if (c.getpalavra().equals(b.getpalavra())) {
			a.add(c.getpalavra());
			break;
		}
		}
	}
	return a;
	}
	

}
