package Texto;

import java.util.ArrayList;



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
	private static ArrayList<String> pfrequencia= new ArrayList<>();
	private static ArrayList<Integer> nfrequencia= new ArrayList<>();
	private static ArrayList<String> exclusivo1= new ArrayList<>();
	private static ArrayList<String> exclusivo2= new ArrayList<>();
	
	


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
		
			for (int i=0; i<listartodas(j).size();i++) {
				if (a.equals(listartodas(j).get(i))) {
					return true;
				}
			
		}
		return false;
	}

	public static ArrayList<String> frequencia (int j) {
		int aux =0;
		int frq=0;
		pfrequencia.clear();
		nfrequencia.clear();
		
		pfrequencia.add(listartodas(j).get(0));
		for (int i=0; i<listartodas(j).size();i++) {
		if (pfrequencia.get(0).equals(listartodas(j).get(i))) {
			frq=frq+1;
		}
		}
		nfrequencia.add(frq);
		frq=0;
		
		for (int i=0; i<listartodas(j).size();i++) {
			for(int k=0;k<pfrequencia.size();k++) {
				if (pfrequencia.get(k).equals(listartodas(j).get(i))) {
					aux = aux+1;
					break;
				}
			}
			if (aux==0) {
				pfrequencia.add(listartodas(j).get(i));
				for (int l=0; l<listartodas(j).size();l++) {
					if (pfrequencia.get(pfrequencia.size()-1).equals(listartodas(j).get(l))) {
						frq=frq+1;
					}
				}
				nfrequencia.add(frq);
			}
			aux=0;
			frq=0;
			
	}
		return pfrequencia;
	}
	public static ArrayList<Integer> nfrequencia (){
		return nfrequencia;
	}
	
	public static void temnos2(int j ,int j2) {
		frequencia(j);
		for (int i=0;i<pfrequencia.size();i++) {
			exclusivo1.add(pfrequencia.get(i));
		}
		frequencia(j2);
		for (int i=0;i<pfrequencia.size();i++) {
			exclusivo2.add(pfrequencia.get(i));
		}
		
		
		for (int i=0; i<exclusivo1.size();i++) {
			for (int k=0; k<exclusivo2.size();k++) {
				if (exclusivo1.get(i).equals(exclusivo2.get(k))) {
					System.out.println("A palavra "+"'"+exclusivo1.get(i)+"'"+" aparece nos 2 arquivos");
					break;
				}
			}
		}
	}
	

}
