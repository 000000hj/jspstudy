package EX01_Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.json.XML;

/**
 * Servlet implementation class ServletEx2
 */
@WebServlet("/servletex2")
public class ServletEx2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEx2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청 인코딩
		request.setCharacterEncoding("UTF-8");
		
		//요청 파라미터를 
		String strAnswer=request.getParameter("answer");
		String strNum1=request.getParameter("num1");
		String strNum2=request.getParameter("num2");
		
		// 타입 바꿔서 비교하기
		 int answer=Integer.parseInt(strAnswer);
		 int num1=Integer.parseInt(strNum1);
		 int num2=Integer.parseInt(strNum2);
		 String str="";
		 
		 if(answer==num1*num2)
		 {
			 str="정답입니다";
		 }
		 else {
			str="오답입니다";
		}
		
		
		 JSONObject person=new JSONObject();
	    person.put("answer",answer);
	    person.put("num1",num1);
	    person.put("num2",num2);
	    
	   JSONObject resJSON = new JSONObject();
	   resJSON.put("person",person);
	  
	  String responseXML=XML.toString(resJSON);
	  System.out.println(responseXML);
	  
	  
	  // 4. 응답 데이터 타입과 인코딩
	  response.setContentType("application/xml; charset=UTF-8");
	  
	  //5. 응답 스트림 생성
	  PrintWriter out =response.getWriter();
	  
	  //6.응답
	  out.println(responseXML);  //$.ajax({success: function(resData){}...})
	  													// function의 매개변수 resData로 responseXML
		
		//응답
	/*	out.println("<script>");
		out.println("alert("+str+");");
		out.println("</script>");
		out.flush();
		out.close();*/
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
