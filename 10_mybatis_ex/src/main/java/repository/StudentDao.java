package repository;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import domain.StudentDto;

public class StudentDao {

	//my batis sqlSession을 만들 수 있는 sqlSessionFactory 선언
	private SqlSessionFactory sqlFactory;
	
	//싱글톤 패턴
	private static StudentDao dao=new StudentDao();
	
	private StudentDao() {
		//sql세션 생성
		try {
			String resource="mybatis/config/mybatis-config.xml";
			 InputStream in = Resources.getResourceAsStream(resource);
	      sqlFactory = new SqlSessionFactoryBuilder().build(in);	
		}
		catch (Exception e) {
			e.printStackTrace();		}
		
	}
	
	public static StudentDao getDao() {
		return dao;
	}
	
	//매퍼의 namespace
	private final String NS = "mybatis.mapper.student.";
	
	//등록 메소드
	 public int bookAdd(StudentDto dto) {
	    SqlSession ss = sqlFactory.openSession(false);  // false : 내가 커밋하겠다.
	    int addResult = ss.insert(NS + "stuAdd", dto);
	    if(addResult == 1) {
	      ss.commit();
	    }
	    ss.close();
	    return addResult;
	  }
	
}
