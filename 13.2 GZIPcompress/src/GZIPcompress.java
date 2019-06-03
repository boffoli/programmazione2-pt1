// Usa il formato GZIP per comprimere un file
import java.io.*;
import java.util.zip.*;

public class GZIPcompress {	
	public static void main(String[] args)
		throws IOException {
			BufferedReader in =new BufferedReader(new FileReader(args[0]));
			BufferedOutputStream out =new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream("test.gz")));
			System.out.println("Writing file");
			int c;
			
			while((c = in.read()) != -1)		//compressione
				out.write(c);
			in.close();
			out.close();
			System.out.println("Reading file");
			BufferedReader in2 =new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("test.gz"))));
			String s;
			
			while((s = in2.readLine()) != null) 	//decompressione
				System.out.println(s);
		}
}
