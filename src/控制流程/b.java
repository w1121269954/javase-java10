package ��������;

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
			System.out.println("31��");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30��");
			break;
		case 2:
			System.out.println("28��");
			break;
	    default:
	        System.out.println("bufuhe");
		}
		
		
		//90-100�������
		//80-89L����
		//70-79��
		//60-69����
		//60һ�²�����
		
		int score = 89;
		if(score<0 || score>100)
		{
			System.out.println("���벻�Ϸ�");
			return;//��������			
		}
		switch(score/10)
		{
		case 10:
		case 9:
			System.out.println("����");
			break;
		case 8:
			System.out.println("����");
			break;
		case 7:
			System.out.println("�е�");
			break;
		case 6:
			System.out.println("����");
			break;
		default:
			System.out.println("������");
			break;
		}

	}

}
