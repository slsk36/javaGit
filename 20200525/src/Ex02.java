import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
//ctrl + shift + o => �ڵ� ����Ʈ
import java.nio.file.Paths;

public class Ex02 {

	public static void main(String[] args) {
		
		Path filePath = Paths.get("d:\\a.txt");
		BufferedWriter bw = null;
		
		try {
//			bw = new BufferedWriter(new OutputStreamWriter(new OutputStream() {
//				
//				@Override
//				public void write(int b) throws IOException {
//					// ���� ����
//				}
//			}));
			bw = Files.newBufferedWriter(filePath);
			bw.write("aaa");
			bw.write("bbb");
			//a.txt ������ ������ �ٲ��.
			bw.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("��������");
	}
}
