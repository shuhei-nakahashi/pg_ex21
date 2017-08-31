package kadai21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class Kadai21 {

	//通話記録ファイルを入力とし請求書を作成するメソッド
	public String recordToInvoice(String inputfileName) throws IOException {

		String outputfilename		=	"C:\\Users\\shuhei\\Desktop\\kadai21\\output\\invoice.dat";

		String kaigyouCode = "0x0A";	//改行コード
		int maxKetaForLine = 80;		//1行の最大桁数
		int numberOfLines = 10000000;//最大行数

		String KeiyakusyaInfoFlg			= "1";//契約者情報フラグ
		String KanyuServiceInfoFlg		= "2";//加入サービス情報フラグ
		String TsuwaRecordFlg				= "5";//通話記録フラグ
		String KugiriFlg					= "9";//区切りフラグ

		File inputfile = new File(inputfileName);
		BufferedReader br = new BufferedReader(new FileReader(inputfile));

		File outputfile = new File(outputfilename);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(outputfile)));

		//入力ファイルを1行ずつ読み込み1桁目に設定されているフラグの数字によって各処理を行う
	    String line;
	    while ((line = br.readLine()) != null) {
	    		//フラグが"契約者情報フラグ"であれば電話番号をファイルに書き込む
	    		if(firstCh(line)==KeiyakusyaInfoFlg)
	    			KeiyakusyaInfoWrite(line);

	    		//フラグが"加入サービス情報フラグ"であれば基本料金を計算する
	    		if(firstCh(line)==KanyuServiceInfoFlg)
	    			KanyuServiceInfoWrite(line);

	    		//フラグが"通話記録フラグ"であれば通話料金を計算する
	    		if(firstCh(line)==TsuwaRecordFlg)
	    			TsuwaRecordWrite(line);

	    		//フラグが"区切りフラグ"であれば区切り文字列をファイルに書き込む
	    		if(firstCh(line)==KugiriFlg)
	    			KugiriWrite(line);
	    }



		return outputfilename;
	}

	private void TsuwaRecordWrite(String line) {
		// TODO 自動生成されたメソッド・スタブ

	}

	private void KanyuServiceInfoWrite(String line) {
		// TODO 自動生成されたメソッド・スタブ

	}

	private void KugiriWrite(String inputline) {
		String kugirimoji = "=====================";


	}

	private void KeiyakusyaInfoWrite(String line) {

	}

	//1桁目に設定されているFlgの数字を返すメソッド
	private String firstCh(String inputLine) {
		return inputLine.substring(0);
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

	public int calcKihonService(String string) {



		return 1000;
	}

}
