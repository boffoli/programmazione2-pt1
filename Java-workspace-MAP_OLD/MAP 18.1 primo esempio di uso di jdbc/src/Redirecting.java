// ridirezionamento dello standard I/O 

import java.io.*;

class Redirecting {	
	public static void main(String[] args)
	throws IOException {		// Solleva eccezioni alla console
		BufferedInputStream in =new 
		BufferedInputStream(new FileInputStream("Redirecting.java"));
		PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("test.out")));
		System.setIn(in);
		System.setOut(out);
		System.setErr(out);
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s = br.readLine()) != null)
			System.out.println(s);
		out.close(); // Ricordatene!
	}
} 

