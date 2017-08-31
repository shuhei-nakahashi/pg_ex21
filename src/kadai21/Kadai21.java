package kadai21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;



public class Kadai21 {

	//ファイル変換用メソッド
	public String recordToInvoice(String fileName) throws FileNotFoundException {

		String kaigyouCode = "0x0A";
		int maxKetaForLine = 80;
		int numberOfLines = 10000000;

		File file = new File(fileName);
		FileReader filereader = new FileReader(file);



		return "C:\\Users\\shuhei\\Desktop\\kadai21\\output\\invoice.dat";
	}

	//
	public String checkKeiyakusyaInfo(String string) {
		// TODO 自動生成されたメソッド・スタブ
		return "090-1234-0001";
	}

	public Object checkKanyuInfo(String string) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
