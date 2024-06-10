package first_class_collection;

import java.util.List;

/**
 * 일급 컬렉션이란? Collection을 Wrapping하면서, 그 외 다른 멤버 변수가 없는 상태를 뜻한다.
 *
 * 일급 컬렉션 상태에서의 이점은?
 *
 * 1. 비지니스에 종속적인 자료구조
 * 2. Collection의 불변성을 보장.
 * 3. 상태와 행위를 한 곳에서 관리.
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 1. 비지니스에 종속적인 자료구조
         * 도메인이 축구인 서비스가 하나 있습니다.
         * 이 서비스에선 필연적으로 축구 팀의 정보가 필요합니다.
         *
         * 축구 규정상 한 팀에는 11명의 정원이 게임에 출전할 수 있습니다.
         * 여기서 출전 하는 팀의 플레이어 11명이 아니라면 로직 수행이 불가능 합니다.
         *
         * 그렇다면 정원이 11명인지 검증하는 로직이 필요합니다.
         * 물론 로직이야 추가하면 그만이겠지만 이 FootballTeam 객체를 사용하는 모든 장소에서는 검증 로직은 필연적으로 존재해야 합니다.
         * 너무 불필요한 작업이고, 실수로 검증 로직을 작성하지 않았다면 side effect로 이어지기 때문에
         *
         * 서비스의 요구사항에 맞는 FootballTeam 자료구조를 일급 컬렉션으로 구현하면 됩니다.
         * FootballTeam 내부에서는 생성자를 통한 생성 이전에 검증 로직이 구현되어 있기 때문에
         * 개발자는 서비스 로직에 집중 할 수 있겠죠?
         */
        FootballTeam chelsea = new FootballTeam(List.of(
                        "palmer",
                        "madueke",
                        "jackson",
                        "gallagher",
                        "mudryk",
                        "caisedo",
                        "cucurella",
                        "silva",
                        "fofana",
                        "reece",
                        "petrovic"
                ));

        chelsea.doA();

        /**
         * 만약 아래의 코드를 실행한다면?
         * FootballTeam footballTeam = new FootballTeam(List.of());
         * footballTeam.doA();
         *
         * catch
         * Exception in thread "main" java.lang.IllegalArgumentException: 플레이어의 인원수가 11명이 아닙니다.
        **/

        /**
         * 2. Collection의 불변성을 보장.
         * 현재 제가 작성한 일급 컬렉션인 ImmutableCollection의 값은 영원히 불변입니다.
         * ImmutableCollection의 행위는 컬렉션의 생성과 그 컬렉션의 크기를 반환하는 size() 메소드밖에 없기 떄문입니다.
         * 이렇게 일급 컬렉션은 불변을 보장합니다.
         *
         * 3. 상태와 행위를 한 곳에서 관리.
         * ImmutableCollection의 값과 로직은 함께 존재합니다.
         * 지금은 한개의 로직만이 존재하기 때문에 와 닿지 않을 수 있지만
         * 여기서 만약 여러가지 행위들이 추가 된다면
         *
         * 사이즈를 구해야하는 로직이 있는 메소드에 따로,
         * 컬렉션의 값을 알아야하는 메소드에 따로 중구난방 하게 흩뿌려져 있을것입니다.
         *
         * 이렇게 행위들을 일급 컬렉션 안에서 관리하면 더욱 더 좋은 코드가 될 것입니다.
         *
         */
        ImmutableCollection collection = new ImmutableCollection(List.of("martial", "taemin"));
        System.out.println(collection.size());

    }
}
