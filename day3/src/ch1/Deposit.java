package ch1;

import java.util.Scanner;
public class Deposit {
    public static void main(String[] args) {
        boolean run = true;      
        int balance = 0;
        Scanner scanner = new Scanner(System.in);
 
        while(run) {
            System.out.println("-----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-----------------------------------");
            System.out.println("선택> ");
            
            int inputMenu = scanner.nextInt();
            switch(inputMenu) {
            case 1 : 
            	System.out.print("입금액을 입력하세요. : ");
            	int deposit_amount = scanner.nextInt();
            	balance += deposit_amount;
            	System.out.println(deposit_amount + " 원 입금 되었습니다.");
            	break;
            case 2: 
            	System.out.println("출금액을 입력하세요. : ");
            	int without_amount = scanner.nextInt();
            	if(balance < without_amount) {
            		System.out.println("출금액이 잔고보다 커서 출금할 수 없습니다.");
            		inputMenu = 2;
            		continue;
            		
            	}else {
            		balance -= without_amount;
            		System.out.println(without_amount +" 원을 출금합니다.");
            		System.out.println("현재 잔고 : "+ balance +"원");
            	}
            
            	break;
            	
            case 3 : 
            	System.out.println("현재 잔고 : "+ balance +"원");
            	break;
            case 4 : 
            	run = false;
            	break;
            default : System.out.println("잘못된 입력입니다. ");
            }
           
            
           
        
        }
        
        System.out.println("프로그램 종료");    
    }
}
