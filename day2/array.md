# 배열 ( Array ) 타입 
- 배열은 연속된 공간에 값을 나열하고, 그 값에 인덱스를 부여해 좋은 자료구조
```java
int sum = 0;
for(int i = 0; i < 30; i++ ) {
  sum += score[i];
}
int avg = sum / 30; 
```
-> 위의 코드에서 30인 학생의 점수를 적은 코드로 손쉽게 처리할 수 있다. 

## 배열의 특징
- 배열은 같은 타입의 값만 관리한다.
- 배열의 길이는 늘리거나 줄일 수 없다.

## 배열 변수 선언
```java
타입[] 변수;
타입 변수[];
```
```java
int[] intArray; == int intArray[];
double[] doubleArray; == double doubleArray[];
String[] strArray; == String strArray[];
```
배열 변수는 참조 변수이다. 배열도 객체이므로 힙 영역에 생성되고 배열 변수는 힙 영역의 배열 주소를 저장
참조할 배열이 없으면 배열 변수도 null로 초기화 
```
타입[] 변수 = null; 
```
-> 배열 변수가 null값을 가진 상태에서 변수[인덱스]로 값을 읽거나 저장하게 되면 NullPonterException이 발생

## 값 목록으로 배열 생성
배열에 저장될 값의 목록이 있다면 간단하게 배열 생성 가능
```
String[] season = {"Spring", "Summer", "Fall","Winter"};
```
대입 연산자로 수정도 가능 

중괄호 {} 로 감싼 값의 목록을 배열 변수에 대입할 때 주의할 점 
-> 배열 변수를 미리 선언한 후에는 값 목록을 변수에 대입할 수 없다. 

배열 변수를 선언한 시점과 값 목록이 대입되는 시점이 다르다면 다음과 같이 new타입을 중괄호 앞에 붙여 주면 됨 
```java
String[] names = null;
names = new String[] {"신용권", "홍길동", "김자바"};
```
int[] 배열 타입을 갖는 printItem() 메소드가 있다고 가정할 때, 매개값으로 중괄호를 감싼 값 목록을 주면 컴파일 에러가 발생
```java
// 메소드 선언
void printItem(int[] scores){...}
// 잘못된 메소드 호출
printItem({95,85,90)}; // 컴파일 에러
```
// 올바른 메소드 호출 
```java
printItem(new int[] {95,85,90});
```

## new 연산자로 배열 생성
```java
int[] intArray = new int[5];
```
-> 길이가 정해진 배열을 생성 

- 배열 초기화
```java
int[] scores = new int[30];
```
변경은 이전과 동일 

### 배열의 길이
```java
// length는 읽기만 가능 
intArray.length = 10; // 컴파일 에러 발생 
```
## 다중 배열 
2차원 3차원 밴열도 만들 수 있다. 
```java
// 2차원 배열 선언방법1
int[ ][ ] num;
// 2차원 배열 선언방법2
int num [ ][ ];
```
기존과 동일함 
