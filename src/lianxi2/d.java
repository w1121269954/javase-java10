package lianxi2;

public class d {

	/*
	 *\r回到行首
	 *
	 *有你口的编码
	 *0-9:十进制0是48
	 *A-Z:十进制A是65
	 *a-z:十进制a是97
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a = 'a';
		char b = '中';
		char c = '\u03a9';
		System.out.println(c);
		
		
		System.out.println("escape\\bchar");
	    System.out.println("escape\\tchar");
	    System.out.println("escape\\rchar");
	    System.out.println("escape\\nchar");
	    System.out.println("\\我在斜线里\\");
	    System.out.println("\'我在单引号里\'");
	    System.out.println("\"我在双引号里\"");
	    System.out.println("我没有双引号");
		
	    //布尔
	    boolean flag = true ;
	    boolean flag2 = false;
	    
	}

}
