package JankenAPPm;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

//自分と相手を作成
public class JankenAPPform {
	//グー・チョキパ・ーを決定
	public static void main(String[] args) throws IOException {
		//入力
		Scanner sc = new Scanner(System.in);
		
		//手
		String[] hand = {"グー","チョキ","パー"};
		//おみくじ
		String[] omikujis = {"大吉","中吉","中吉","小吉","小吉","小吉","吉","吉","吉","吉","末吉","末吉","末吉","末吉","末吉","凶","凶","凶","凶","大凶","大凶"};
		//くじ乱数
		Random r = new Random();
		String omikuji = omikujis[r.nextInt(21)];
		
		
		//挨拶
		System.out.println("これからじゃんけん３回勝負をおこないます。勝ったらおみくじを引けますよ笑");
		//名前の入力
		System.out.println("まずは名前を教えてください！");
		Scanner input = new Scanner(System.in);
		//キーボード入力を受け付ける
		String name = input.next();
		
		System.out.println(name + "さんですね、それでは始めます！");
		
			
		//勝利数
		int win = 0;
		//負け数
		int lose = 0;
		//引き分け
		int drow = 0;
		//ゲーム開始
		for(int i = 1 ; i <= 3 ; i++) {
			System.out.println("---------------------------");
			System.out.println(i + "回目です！");
			
			//自分の手
			System.out.println(name + "さんは何を出しますか？(0:グー，1:チョキ，2:パー)");
			int me = sc.nextInt();
			
			//コンピュータの手
			int cp = (int)(Math.random() * 3);
			//お互いの表示
			System.out.println("あなたは" + hand[me]);
			System.out.println("コンピューターは" + hand[cp]);
			//勝負の式
			switch((3 + me - cp) % 3) {
			case 0:{
				System.out.println("あいこです！");
				++drow;
			}
			break;
			case 1:{
				System.out.println("負けましたね");
				++lose;
			}
			break;
			case 2:{
				System.out.println("勝ちましたよ！");
				++win;
			}
			break;
			}
		}
		//結果発表
		System.out.println("結果発表！！！！！！！");
		System.out.println("勝ち数は" + win + "回です。");
		System.out.println("負け数は" + lose + "回です。");
		System.out.println("あいこは" + drow + "回です。");
		//勝った場合
		if(win > lose) {
			System.out.println("おめでとうございます！" + name + "さんの勝ちです！今日の運勢は" + omikuji + "ですよ！またのお越しを〜");
		//負けた場合
		}else if(win < lose){
			System.out.println("負けてしまいましたね！勝ったらおみくじ引けますよ！またのお越しを〜");
		//あいこの場合
		}else{
			System.out.println("結果はあいこですね！勝ったらおみくじ引けますよ！またのお越しを〜");
		}
		System.out.println("ありがとうございました!");
	}
	
	
}
