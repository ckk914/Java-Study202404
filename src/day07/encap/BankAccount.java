package day07.encap;

public class BankAccount {
//- 계좌 잔액(balance), 계좌 번호(accountNumber), 계좌 주인의 이름(accountHolder) 필드를 private로 선언하세요.
    private String accountNumber;        //계좌번호
    private String accountHolder;        //계좌 주인 이름
    private long balance;                  //잔액

//    BankAccount myAccount = new BankAccount("123-456-789", "김철수", 10000);
    //생성자
    BankAccount(String accountNumber,String accountHolder,int balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    //잔액 조회
    public long getBalance() {
        return balance;
    }
    //예금
    public void deposit(int i) {
        if(i<0){
            System.out.println("입금액은 음수일 수 없습니다.");
            return;
        }
         this.balance+=i;
    }
    //인출
    public void withdraw(int i) {
        if(balance>i) {
            this.balance -= i;
        }
        else{
            System.out.println("잔액이 부족하거나, 잘못된 출금액입니다.");
        }
    }
}
