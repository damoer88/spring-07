package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ʽ jdbc:mysql://����IP:�˿ں�/���ݿ���
		String url="jdbc:mysql://192.168.129.200:3306/test1";
        String user="root";
        String password="wenrouxiang";
        Connection con=null;
        PreparedStatement pstmt = null;
        ResultSet rs=null;
		try {
			//ѡ��Ҫ���������ݿ�����-----��������(����)
			Class.forName("com.mysql.jdbc.Driver");
			//�������� ����Ip �˿ں� �û��� ����
			//ѡ��Ҫ���������ݿ�
			con = DriverManager.getConnection(url, user, password);		
			//���������(дsql���)
			pstmt = con.prepareStatement("select * from student");
			//����sql��䲢�鿴��� �������ɾ�ĵĻ��򷵻���Ӱ�������,����ǲ�ѯ ���ص��ǲ�ѯ���
			//���е�ʱ��ע�� �������ɾ�������executeUpdate ����int �����ѯ �����executeQuery ����ResultSet
			rs= pstmt.executeQuery();
			//�鿴�����
			while(rs.next()){
				System.out.println(rs.getInt("id")+"  "+rs.getString("name"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(rs!=null)
					rs.close();
				if(pstmt!=null)
					pstmt.close();
				if(con!=null)
					con.close();				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}