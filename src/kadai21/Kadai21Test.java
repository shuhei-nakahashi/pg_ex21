package kadai21;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

public class Kadai21Test {


	@Test
	public void RecordToInvoiceTest() throws FileNotFoundException {
		Kadai21 kd21 = new Kadai21();
		assertEquals("C:\\Users\\shuhei\\Desktop\\kadai21\\invoice.dat",kd21.recordToInvoice("C:\\Users\\shuhei\\Desktop\\kadai21\\record.log"));
	}


	@Test
	public void fileInputTest() throws FileNotFoundException {
		//Kadai21 kd21 = new Kadai21();
		//assertTrue(kd21.fileInput("C:\\Users\\shuhei\\Desktop\\kadai21\\record.log"));
	}

}
