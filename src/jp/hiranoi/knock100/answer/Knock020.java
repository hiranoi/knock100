package jp.hiranoi.knock100.answer;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author hiranoi
 *
 *         以下の配列MEDALSについて、ジェネリクスを用いた場合のリストと用いない場合のリストにそれぞれ要素を入れ、
 *         それぞれのリストについて、全要素を順番に出力するためのプログラムを実装せよ。 private static final String[]
 *         MEDALS = new String[]{"GOLD", "SILVER", "BRONZE"};
 *
 */

public class Knock020 {

    private static final String[] MEDALS = new String[] { "GOLD", "SILVER", "BRONZE" };

    public static void main(String[] args) {
        List<String> genList = Arrays.<String>asList(MEDALS);
        printList(genList);
        List nonGeneList = Arrays.asList(MEDALS);
        printList(nonGeneList);
    }

    /**
     * listの要素を出力する(ジェネリクスあり)
     * 
     * @param list
     *            メダルのリスト
     */
    private static void printList(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }

}
