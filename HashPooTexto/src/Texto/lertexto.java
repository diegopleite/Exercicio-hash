package Texto;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class lertexto {
	public static int c = 0;
	public static int c2 = 0;

	public static void pegatexto(ArrayList<String> a) {

		String[] files = new String[] { "texto01.txt", "texto02.txt", "texto03.txt", "texto04.txt", "texto05.txt",
				"texto06.txt", "texto07.txt", "texto08.txt", "texto09.txt", "texto10.txt" };
		for (String fname : files) {
			c = c + 1;

			// System.out.format("%nFile: %s%n", fname);

			try {
				carregaDados(fname, c, a);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// System.out.println(listas.listartodas(2));
		for (int j = 1; j < 11; j++) {
			for (int i = 0; i < listas.listartodas(j).size(); i++) {
				if (listas.listartodas(j).get(i).equals("")) {

					listas.removedalista(i, j);
					i = i - 1;
				}
				if((i+1)<listas.listartodas(j).size()) {
				if ((listas.listartodas(j).get(i).equals("a") || listas.listartodas(j).get(i).equals("d"))
						&& listas.listartodas(j).get(i + 1).equals("c")) {
					if (listas.listartodas(j).get(i).equals("a")) {
						listas.adicionaporindex(i, "a.c", j);
						listas.removedalista(i + 1, j);
						listas.removedalista(i + 1, j);
					}
					if (listas.listartodas(j).get(i).equals("d")) {
						listas.adicionaporindex(i, "d.c", j);
						listas.removedalista(i + 1, j);
						listas.removedalista(i + 1, j);
					}
				}
			}
			}
		}
		// System.out.println(listas.listartodas(2));
	}

	public static void carregaDados(String fileName, int c, ArrayList<String> a) throws IOException {

		Path path1 = Paths.get(fileName);
		try (BufferedReader reader = new BufferedReader(Files.newBufferedReader(path1, Charset.forName("utf8")))) {
			String line;
			while ((line = reader.readLine()) != null) {
				line = line.toLowerCase().replaceAll("[^a-zA-Z0123456789��������������������������-]", " ");
				String[] palavras = line.split(" ");
				for (String pal : palavras) {
					c2=0;
					if (pal != null && !pal.equals(""))
						// System.out.format("%s ", pal);
						for (int i = 0; i < a.size(); i++) {
							if (a.get(i).equals(pal)) {
								c2 = c2 + 1;
								break;
							}

						}
					if (c2 == 0) {
						listas.adicionalista(pal, c);
					}
				}
				// System.out.format("\n");

			}
		}

	}
}
