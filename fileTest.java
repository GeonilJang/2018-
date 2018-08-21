import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class fileTest {
	public static void main(String []args) throws Exception {
		FileInputStream fi = new FileInputStream("D:\\test.txt");
		FileOutputStream fo = new FileOutputStream("D:\\test1.txt");
		
		
//		int n = 0;
//		while((n = fi.read()) != -1) {
//			fo.write(n);
//			System.out.print((char)n);
//		}
//		
//		BufferedInputStream bis = null;
//		BufferedOutputStream bw= null;
//		DataInputStream dis = null;
//		
//		
//		File file = new File("D:\\test.txt");
//		fi = new FileInputStream(file);
//		bis = new BufferedInputStream(fi);
//		dis = new DataInputStream(bis);
//		
//		while(dis.available() != 0) {
//			System.out.println(dis.readLine());
//		}
//		
//		
//		
//		bw = new BufferedOutputStream(System.out);
//		
//		
//		int data = 0;
//		System.out.println(bis.read());
//		
//		
//		while((data = bis.read()) != -1) {
//			
//			bw.write((char)data);
//			bw.flush();
//		}
//		
//		fo.close();
//		fi.close();
//		bw.close();
//		bis.close();

		BufferedInputStream bis = new BufferedInputStream(fi);
		BufferedOutputStream bos = new BufferedOutputStream(fo);
		
//		int len = 0 ;
//		while(bis.available() > 0) {
//			len++;
//			bos.write(bis.read());
//		}
		int n = 0;
		while((n = bis.read()) != -1) {
			bos.write(n);
			System.out.print((char)n);
		}
		
//		System.out.printf("총 %,d\n",len);
//		bos.flush();
		bis.close();
		bos.close();
		
		
	}
}
