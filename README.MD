# Design Pattern.

## 패턴 목록
1. [데코레이터 패턴 :  객체를 감싸서 새로운 행동을 추가](https://github.com/qweasd147/DesignPattern/tree/master/src/pattern/decorator/README.MD)
2. [스테이트 패턴 : 상태를 기반으로 한 행동을 캡슐화 한 다음 위임을 통해서 필요한 행동을 선택](https://github.com/qweasd147/DesignPattern/blob/master/src/pattern/state/README.MD)
3. [이터레이터 패턴 : 컬렉션이 어떤식으로 구현 되었는지 드래내진 않으면서도 컬렉션 내에 있는 모든 객체에 대해 반복 작업을 처리하고 싶을때](https://github.com/qweasd147/DesignPattern/blob/master/src/pattern/iterator/README.MD)
4. [퍼사드 패턴 : 일련의 클래스에 대해서 간단한 인터페이스로 제공.(간단해서 안함....)]()
5. [프록시 패턴 : 객체를 감싸서 그 객체에 대한 접근을 제어하고 싶을때](https://github.com/qweasd147/DesignPattern/blob/master/src/pattern/proxy/README.MD)
6. [팩토리 메소드 패턴 : 생성할 구상 클래스를 서브클래스에서 결정](https://github.com/qweasd147/DesignPattern/blob/master/src/pattern/factory/README.MD)
7. [어뎁터 패턴 : 객체를 감싸서 다른 인터페이스에 제공(말그대로 adapter 역할)](https://github.com/qweasd147/DesignPattern/blob/master/src/pattern/adapter/README.MD)
8. [옵저버 패턴 : 상태가 변경되면 다른 객체들한테 연락을 돌림(변화를 감지)](https://github.com/qweasd147/DesignPattern/blob/master/src/pattern/observer/README.MD)
9. [템플릿 메소드 패턴 : 알고리즘의 개별 단계를 구현하는 방법을 서브클래스에서 결정(구현)](https://github.com/qweasd147/DesignPattern/blob/master/src/pattern/template/README.MD)
10. [추상 팩토리 패턴 : 클라이언트에서 구상 클래스를 지정하지 않으면서도 일군의 객체를 생성하고 싶을때](https://github.com/qweasd147/DesignPattern/blob/master/src/pattern/abstractFactory/README.MD)
11. [커맨드 패턴 : 요청을 객체로 감싼다.](https://github.com/qweasd147/DesignPattern/blob/master/src/pattern/command/README.MD)
12. [브릿지 패턴 : 구현 뿐만 아니라 추상화 부분까지 바뀔 가능성이 높을 시](https://github.com/qweasd147/DesignPattern/blob/master/src/pattern/bridge/README.MD)


# 소스 참고한거

#### 1. 인프런(https://www.inflearn.com/) / 자바 디자인 패턴의 이해 – Gof Design Pattern
    초기 디자인 패턴 배울때 인강을 통해 공부하였고, 정리가 부족하여 소스내 old 폴더에 따로 보관
    
### 2. 토비의 스프링
    프록시 패턴만 함. 책에서는 프록시 패턴의 예제로 트랜잭션을 다뤘는데 그걸 참고해서 따로 소스를 작성함.
    책에 많은 디자인 패턴은 없지만(스프링 책이니까) 데코레이션이나 프록시 패턴은 꽤나 자세히 설명하고 있음

### 3. Head First Design Pattern
    책 자체는 대부분이 쉽게 쓰여있고, 내용도 좋음. 작성한 디자인 패턴의 대부분을 여기서 참고함
