package jp.hiranoi.knock100.answer;

/**
 * 
 * @author hiranoi
 *
 *         ユニークな名前とIDを持ち、名前とIDどちらでもインスタンスが取得できるenumを実装せよ。
 *         例として、十二支を表現するenumを実装せよ。
 */
public class Knock018 {
    public enum Junishi {
        NE("ね"), USHI("うし"), TORA("とら"), U("う"), TATSU("たつ"), MI("み"), UMA("うま"), HITSUJI("ひつじ"), SARU("さる"), TORI(
                "とり"), INU("いぬ"), I("い");

        Junishi(String name) {
            this.name = name;
        }

        private String name;

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        System.out.println(Junishi.TORA.getName());
    }
}
