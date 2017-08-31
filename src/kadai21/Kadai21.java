package kadai21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Kadai21 {

	//ファイル変換用メソッド
	public String recordToInvoice(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		FileReader filereader = new FileReader(file);
		return "C:\\Users\\shuhei\\Desktop\\kadai21\\invoice.dat";
	}

}
