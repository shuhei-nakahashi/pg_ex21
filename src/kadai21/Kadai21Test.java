package kadai21;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class Kadai21Test {

	//出力されるファイル名の確認
	@Test
	public void RecordToInvoiceTest() throws IOException {
		Kadai21 kd21 = new Kadai21();
		assertEquals("C:\\Users\\shuhei\\Desktop\\kadai21\\output\\invoice.dat",kd21.recordToInvoice("C:\\Users\\shuhei\\Desktop\\kadai21\\input\\record.log"));
	}


	//@Test
	public void fileReadLineOneTest() throws FileNotFoundException {
		Kadai21 kd21 = new Kadai21();
		assertEquals("090-1234-0001",kd21.checkKeiyakusyaInfo("C:\\Users\\shuhei\\Desktop\\kadai21\\record.log"));
	}


	//基本サービス料金のテスト
	//@Test
	public void calcKihonServiceTest() throws FileNotFoundException {
		Kadai21 kd21 = new Kadai21();
		assertEquals(1000,kd21.calcKihonService("C:\\Users\\shuhei\\Desktop\\kadai21\\record.log"));
	}

}
