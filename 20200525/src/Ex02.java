import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
//ctrl + shift + o => 자동 임포트
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
//					// 옛날 버전
//				}
//			}));
			bw = Files.newBufferedWriter(filePath);
			bw.write("aaa");
			bw.write("bbb");
			//a.txt 파일의 내용이 바뀐다.
			bw.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("정상종료");
	}
}