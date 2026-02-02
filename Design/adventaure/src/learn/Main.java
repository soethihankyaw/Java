package learn;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

import learn.characters.King;

public class Main {

	public static void main(String[] args) {
//		var king = new King();
//		king.fignt();
		
		String s = "[MTBPay]";

		// encode as EBCDIC

		// encode as EBCDIC
		byte[] b = s.getBytes("Cp1047");

		// decode as Latin1 (wrong)
		String wrong = new String(b, StandardCharsets.ISO_8859_1);

		System.out.println(wrong);

	}

}
