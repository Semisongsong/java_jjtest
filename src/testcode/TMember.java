package testcode;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import mainsrc.Member;

public class TMember {
	Member newMember;
	Member oldMember;
	
	@Test
	public void test1() {
		//System.out.println(newMember);
		//System.out.println(oldMember);
		//assertEquals(newMember, oldMember);
		//assertNull(newMember);
		//assertSame(newMember, oldMember);
		if(newMember == null) {
			System.out.println("ok");
		}
		assertTrue(newMember == null);
	}
	
	@Before
	public void test2() {
		newMember = new Member();
		oldMember = new Member();
	}	
	// ������ ���� �׽�Ʈ�� �ϱ� ���ؼ��� ���̺귯��(JUnit)�� �߰��Ѵ�.
	// JUnit�̶�? ������ ���� �׽�Ʈ�� �������ִ� �����ӿ�ũ
	// ���Ǵ� ������̼�
	/*
	 * @Test //@Test�� ����� �޼��尡 �׽�Ʈ�� �����Ѵ�. (��� �� ���ִ�.)
	 * @Before //@Test�� ����� �޼��尡 ����Ǳ����� ����
	 * @Ignore //�׽�Ʈ�� �������� �ʴ´�.
	 * 
	 * */
	
	/*
	 * sysout���δ� �ֿܼ� ����� ���������
	 * ����(assert)�޼���� �׽�ũ�� ����� �Ǻ��Ѵ�. 
	 * ���� ��� asserEquals(����, ������)
	 * ���� ���� �޼���� ���󰪰� �������� ��ġ�ϸ� ����, �ƴϸ� ����
	 * */
	
	/*
	 *	jUnit �޼ҵ�
	 *	assertEquals(a,b) ��ü �Ǵ� ���� ��ġ�ϴ°�?
	 *	assertArrayEquals(a,b) �迭�� ���� ��ġ�ϴ°�
	 *	assertSame(a,b) ���� ��ü�ΰ�?
	 *	assertTrue(a,b) ������ ���ΰ�?
	 *	assertTure(a) ��ü�� null�� �ƴѰ� ?
	 *	assertNotNull(a) = ��ü�� null�ΰ� ?
	 * */
}
