# 신한 GYC TOKYO Class IT 250909 
## 이것이 자바다 1권 
#### P 5 ~ P 17 요약 

## 1.1 프로그래밍 언어와 자바 
기계어 : 컴퓨터가 이해할 수 있는 언어 -> 0,1로 이루어진 이진코드를 사용
컴퓨터와 사람의 언어를 있는 프로그래밍 언어가 필요 
고급언어  | 저급언어
------------- | -------------
컴퓨터와 대화할 수 있는 언어중 사람이 쉽게 이해할 수 있는 언어 ( Java, c, c++, c#, 파이썬 ) | 기계어에 가까운 언어를 말함 ( 어셈블리어 등 ) 

고급언어 -> 컴파일러 -> 저급언어로 컴퓨터로 전달 

### 자바 특징 
- 모든 운영체제에서 실행 가능 : 자바로 작성된 프로그램은 모든 운영체제에서 실행 가능
- 객체지향 프로그래밍 : 객체를 만들고, 이 객체들을 서로 연결하여 더 큰 프로그램을 완성시키는 기법
- 메모리 자동정리
- 풍부한 무료 라이브러리

# JAVA 설치
### Oracle jdk
<img width="1379" height="578" alt="image" src="https://github.com/user-attachments/assets/7b40ca0b-ebc3-452d-9ecc-656ba770a528" />
*로그인 필요*
윈도우 > https://www.oracle.com/java/technologies/downloads/#java17-windows
Mac > https://www.oracle.com/java/technologies/downloads/#java17-mac

# Eclipse 설치
https://www.eclipse.org/downloads/

## JDK 설치 후 환경 변수 설정
1. 
<img width="657" height="168" alt="image" src="https://github.com/user-attachments/assets/59758062-795b-4e37-ab34-e4549a52c010" />
변수 이름 : JAVA_HOME
변수 값 : C:\Program Files\Java\jdk-17
2. 
시스템 변수 > 변수 : Path 편집 -> 새로만들기 -> %JAVA_HOME\bin -> 가장 위로 이동
3. 설치 확인하기

## 바이트코드 파일과 자바 가상 머신
텍스트 에디터에서도 확인 가능 
### 자바 가상 머신 
java : 바이트 코드 파일 특정 운영체제가 이해하는 기계어로 번역하고 실행하는 명령어 
java 명령어는 JDK와 함께 설치된 자바 가상 머신을 구동시켜 바이트 코드를 완전한 기계어로 번역하고 실행

바이트 코드 파일은 운영체제와 상관없이 모두 동일한 내용으로 생성
단, 자바 가상 머신은 운영체제에 따라 다름 
 

