
public class Swap {
	
	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 20;
		//郊餓走 省澗陥 ^_^....
		swap(i1, i2);
		System.out.println(i1 + ", " + i2);
		
		Value v1 = new Value();
		Value v2 = new Value();
		v1.setValue(10);
		v2.setValue(20);  
		swap2(v1, v2);
		
//		System.out.println(v1 + ", " + v2); //-----------1
		System.out.println(v1.getValue() + ", " + v2.getValue()); //----------------2
		
	}
	
	public static void swap(int a, int b) {
		//昔什渡什澗 持掩走 照持掩走 乞牽艦 握陥 承 呪 蒸陥!
		//鷺薫 照拭辞税 痕呪級精 乞砧 什澱拭 酵微陥!!!@@@@
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void swap2(Value a, Value b) {
		//--------------a
		Value tmp = a;
		a = b;
		b = tmp;
		//床檎.... 爽社 背習葵 蟹紳陥...ぬばぬばぬばぬ (1引 a税 繕杯)
		//悦汽 訊 1引 b税 繕杯生稽澗 葵戚 照郊餓走???ぬばぬば
		//梓端税 送羨企脊....? 原濁亜走稽 Value tmp亜 stack拭 赤醸奄 凶庚昔亜......ぬばぬばぬば
		//尻走沢戚 stack 戚虞壱 杯艦陥. 蒸嬢閃 獄鍵陥壱.
		//益撹 梓端稽 幻級檎 鞠澗 依戚 焼艦虞, 敗呪研 紫遂馬澗 依戚 匂昔闘!@@@@@@@@@@@
		//-----------b
//		int tmp = a.getValue();
//		a.setValue(b.getValue());
//		b .setValue(tmp);		
	}

}
