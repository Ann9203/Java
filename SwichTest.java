/*
���ߣ�ѩ
���ڣ�2015��5��8��
���ܣ�ͨ��if���ʵ�����ڣ�����
���裺
	1.����һ��ifTest����
	2.дһ��������
	3.swichTest
*/
class SwichTest{
	public static void main(String[] args){
		//ע�ⵥ��ƴд
		//�������һ���ӡ���������
		int month=4;
		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println(month+"��Ϊ����");
				break;
				
			case 6:
			case 7:
			case 8:
				System.out.println(month+"��Ϊ�ļ�");
				break;
				
			case 9:
			case 10:
			case 11:
				System.out.println(month+"��Ϊ�＾");
				break;
				
			case 12:
			case 1:
			case 2:
				System.out.println(month+"��Ϊ����");
				break;
				
			default:
				System.out.println("û���������");
				break;
			
			}
		}
	}