package serializable;

import java.io.*;
import java.util.Base64;

public class Deserializable {
    public static void main(String[] args) {
        Member member = new Member("김태민", "s20014@gsm.hs.kr", 19);
        byte[] serializedMember = new byte[0];

        try(ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            try(ObjectOutputStream oos = new ObjectOutputStream(baos)) {
                oos.writeObject(member);
                //serializedMember -> 직렬화된 member객체
                serializedMember = baos.toByteArray();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // byte배열로 생성된 직렬화 데이터를 base64로 반환
        String base64Member = Base64.getEncoder().encodeToString(serializedMember);
        System.out.println("base64Member = " + base64Member);

        //직렬화 끝
        //지금부터는 역직렬화 하는방법
        try(ByteArrayInputStream bais = new ByteArrayInputStream(serializedMember)) {
            try(ObjectInputStream ois = new ObjectInputStream(bais)) {
                // 역직렬화된 Member 객체를 읽어옴
                Object objectMember = ois.readObject();
                Member deserializableMember = (Member) objectMember;
                System.out.println("deserializableMember = " + deserializableMember);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
