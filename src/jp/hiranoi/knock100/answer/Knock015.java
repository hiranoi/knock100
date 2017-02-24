package jp.hiranoi.knock100.answer;

/**
 * 
 * @author hiranoi
 *
 *         java.lang.String型のインスタンス変数を持つクラスで、
 *         コンストラクタでその変数に代入すべき値を取る場合と、取らない場合がある。 取らない場合、デフォルトの文字列"no
 *         name"を設定する。このクラスを実装せよ。
 */
public class Knock015 {
    private String name;

    public Knock015(String name) {
        this.name = name;
    }

    public Knock015() {
        this.name = "no name";
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Knock015 knock015a = new Knock015("hirano");
        Knock015 knock015b = new Knock015();
        System.out.println(knock015a.getName());
        System.out.println(knock015b.getName());
    }

}
