package _25_����ģʽ.section3;

/**
 * @author cbf4Life cbf4life@126.com
 *         I'm glad to share my knowledge with you all.
 */
public class Client {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //���Ԫ�ض���
            Element el = ObjectStructure.createElement();
            //���ܷ����߷���
            el.accept(new Visitor());
        }
    }
}
