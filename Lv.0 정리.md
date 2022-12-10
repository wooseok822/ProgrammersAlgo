# Lv.0 총 정리

StringBuilder: String과 문자열을 더할 때 새로운 객체를 생성하는 것이 아니라 기존의 데이터에
               더하는 방식을 사용하기 때문에 속도가 빠르며 부하가 적다.

StringBuilder sb = new StringBuilder(); 를 통해 선언하고
append를 통해 문자열을 더한다.
StringBuilder의 인스턴스인 sb의 문자열을 출력하기 위해서는 toString()을 쓴다.
StringBuilder는 sb.reverse() 처럼 문자열을 거꾸로 출력할 수도 있다.
