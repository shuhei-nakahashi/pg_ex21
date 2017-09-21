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
		String kugirimoji = "=====================";//区切り文字

		String KeiyakusyaInfoFlg			= "1";//契約者情報フラグ
		String KanyuServiceInfoFlg		= "2";//加入サービス情報フラグ
		String TsuwaRecordFlg			= "5";//通話記録フラグ
		String KugiriFlg					= "9";//区切りフラグ

		String KazokuCode = "C1";//家族サービスコード
		String HirutokuCode = "E1";//昼得サービスコード

		boolean KazokuCodeFlg = false;//家族サービス加入フラグ
		boolean HirutokuCodeFlg = false;//昼得サービス加入フラグ

		int KazokuService = 100;//家族サービス基本料金
		int HirutokuService = 200;//昼得サービス基本料金

		File inputfile = new File(inputfileName);
		BufferedReader br = new BufferedReader(new FileReader(inputfile));

		File outputfile = new File(outputfilename);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(outputfile)));

		//入力ファイルを1行ずつ読み込み1桁目に設定されているフラグの数字によって各処理を行う
	    String line;

	    int TsuwaRyoukin = 0;//通話料金
	    int KihonRyoukin = 1000;//基本料金

	    int tmpTsuwaRyoukin = TsuwaRyoukin;//通話料金計算用変数
	    int tmpKihonRyoukin = KihonRyoukin;//基本料金計算用変数

	    while ((line = br.readLine()) != null) {
	    		//フラグが"契約者情報フラグ"であれば電話番号をファイルに書き込む
	    		if(firstCh(line)==KeiyakusyaInfoFlg)
	    			pw.print(KeiyakusyaInfoFlg);
	    			pw.print(" ");
	    			pw.print(KeiyakusyaInfoWrite(line));
	    			pw.print(kaigyouCode);

	    		//フラグが"加入サービス情報フラグ"であれば基本料金を計算する
	    		if(firstCh(line)==KanyuServiceInfoFlg){
	    			String KanyuCode = line.substring(2,3);
	    			String KanyuInfo = line.substring(5);

	    			if(KanyuCode == KazokuCode && KazokuCodeFlg == false){
	    				tmpKihonRyoukin = tmpKihonRyoukin + KazokuService;
	    				KazokuCodeFlg = true;
	    			}

	    			if(KanyuCode == HirutokuCode && HirutokuCodeFlg == false){
	    				tmpKihonRyoukin = tmpKihonRyoukin + HirutokuService;
    					HirutokuCodeFlg = true;
	    		}

	    		}
	    		//フラグが"通話記録フラグ"であれば通話料金を計算する
	    		if(firstCh(line)==TsuwaRecordFlg)
	    			tmpTsuwaRyoukin = TsuwaRecordWrite(line,tmpTsuwaRyoukin);

	    		//フラグが"区切りフラグ"であれば基本料金、通話料金、区切り文字列をファイルに書き込む
	    		if(firstCh(line)==KugiriFlg){

	    			//基本料金をファイルに書き込む
	    			pw.print(KanyuServiceInfoFlg);
	    			pw.print(" ");
	    			pw.print(tmpKihonRyoukin);
	    			pw.print(kaigyouCode);

	    			//通話料金をファイルに書き込む
	    			pw.print(TsuwaRecordFlg);
	    			pw.print(" ");
	    			pw.print(tmpTsuwaRyoukin);
	    			pw.print(kaigyouCode);

	    			pw.print(KugiriFlg);
	    			pw.print(" ");
	    			pw.print(kugirimoji);
	    			pw.print(kaigyouCode);
	    			//通話料金と基本料金の初期化
	    			tmpTsuwaRyoukin=TsuwaRyoukin;
	    			tmpKihonRyoukin=KihonRyoukin;
    				KazokuCodeFlg = true;
    				HirutokuCodeFlg = true;
	    		}
	    }

		return outputfilename;
	}


	//情報初期化メソッド
	private void Syokika() {

	}

	//通話料金を計算するメソッド
	private int TsuwaRecordWrite(String inputLine,int inputTsuwaRyoukin) {
		String StartDate = inputLine.substring(2,11);
		String StartTime = inputLine.substring(13,17);
		String TsuwaJikan = inputLine.substring(19,21);
		String Dnis = inputLine.substring(23);



		return 0;
	}

	private void KanyuServiceInfoWrite(String line) {
		// TODO 自動生成されたメソッド・スタブ

	}
/*
	private void KugiriWrite(String inputline) {
		String kugirimoji = "=====================";


	}*/

	//電話番号を取得するメソッド
	private String KeiyakusyaInfoWrite(String inputLine) {
		return inputLine.substring(3);
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
