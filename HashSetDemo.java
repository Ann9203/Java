import java.util.*;
/*
setԪ�ص����� Ԫ�ز������ظ�
	hasset:�ײ���hash��
	    ��֤Ԫ�ز��ظ���
	    	Hascode   Equals��������
	    	���ж�HashCode�������ͬ���ж�Equals
*/
class HashSetDemo
{
	public static void main(String[] args)
	{
		HashSet ha=new HashSet();
		ha.add("java01");
		ha.add("java01");
		ha.add("java02");
		ha.add("java03");
		System.out.println(ha);
		}
	}