### Stream으로 병렬 처리하자.
* Stream을 사용하여 외부 반복을 내부 반복으로 바꾸면 자바 라이브러리가 Stream 요소를 처리하기 때문에 따로 개발자가 성능을 고민할 필요가 없다.
* 이는 Java7 전과 후로 나눠진다. Java7 이전에는 데이터 컬렉션을 병렬로 처리하기 힘들었지만 이후에는 포크/조인 프레임워크 기능을 제공한다.

### 연산이 필요할 시 Wrapper Class 사용을 피하고 Primitive Type을 사용하자.
* Wrapper Class 타입 변수의 연산이 일어날 시 Auto Unboxing 이 일어나 Primitive Type으로 연산을 하기때문이다. 