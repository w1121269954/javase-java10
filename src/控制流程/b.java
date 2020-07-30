package 控制流程;

public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 6;
		//135781012,31
		//46911,30
        //2
		switch(month){
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30天");
			break;
		case 2:
			System.out.println("28天");
			break;
	    default:
	        System.out.println("bufuhe");
		}
		
		
		//90-100输出优秀
		//80-89L良好
		//70-79中
		//60-69及格
		//60一下不及格
		
		int score = 89;
		if(score<0 || score>100)
		{
			System.out.println("输入不合法");
			return;//结束方法			
		}
		switch(score/10)
		{
		case 10:
		case 9:
			System.out.println("优秀");
			break;
		case 8:
			System.out.println("良好");
			break;
		case 7:
			System.out.println("中等");
			break;
		case 6:
			System.out.println("及格");
			break;
		default:
			System.out.println("不及格");
			break;
		}

	}

}
