package hw5;

/*
身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
與數字的亂數組合，如圖
 */
public class Exer5 {
	public static void main(String[] args) {
		Exer5 exer5 = new Exer5();
		// 隨機驗證碼
		StringBuilder authCode;
		authCode = exer5.getAuthCode();
		System.out.println("本次產生的隨機驗證碼為：");
		System.out.println(authCode);
	}

	public StringBuilder getAuthCode() {
		StringBuilder authCode = new StringBuilder();
		// 將所有可能出現的驗證碼都列出
		String randomString = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

		// 從中隨機取8個字元組成隨機驗證碼
		while (authCode.length() < 8) {
			authCode.append(randomString.charAt((int) (Math.random() * randomString.length())));
		}
		return authCode;
	}
}
