package kadai21;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

public class Kadai21Test {


	@Test
	public void RecordToInvoiceTest() throws FileNotFoundException {
		Kadai21 kd21 = new Kadai21();
		assertEquals("C:\\Users\\shuhei\\Desktop\\kadai21\\output\\invoice.dat",kd21.recordToInvoice("C:\\Users\\shuhei\\Desktop\\kadai21\\input\\record.log"));
	}


	@Test
	public void fileReadLineOneTest() throws FileNotFoundException {
		Kadai21 kd21 = new Kadai21();
		assertEquals("090-1234-0001",kd21.checkKeiyakusyaInfo("C:\\Users\\shuhei\\Desktop\\kadai21\\record.log"));
	}

	@Test
	public void fileReadLineTwoTest() throws FileNotFoundException {
		Kadai21 kd21 = new Kadai21();
		assertEquals("090-1234-0001",kd21.checkKanyuInfo("C:\\Users\\shuhei\\Desktop\\kadai21\\record.log"));
	}



}
