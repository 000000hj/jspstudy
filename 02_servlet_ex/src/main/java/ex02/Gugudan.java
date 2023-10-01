package ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Gugudan
 */
@WebServlet("/gugudan")
public class Gugudan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Gugudan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	//요청 인코딩
	  request.setCharacterEncoding("UTF-8");
	
  //요청파라미터
	  String strNum1=request.getParameter("num1");
	  String strNum2=request.getParameter("num2");
	  String strAnswer=request.getParameter("answer");
	 
	  int num1=0;
	  int num2=0;
	  int answer=0;
	  int result=0;
	  
	  //null처리(공백이 아니고 null 이 아니라면 형변환)
	  if(strNum1!=null&&!strNum1.isEmpty())
	  {
	    num1=Integer.parseInt(strNum1);
	  }
	  if(strNum2!=null&&!strNum2.isEmpty())
    {
      num2=Integer.parseInt(strNum2);
    }
	  
	 if(strAnswer!=null&&!strAnswer.isEmpty())
	  {
	      answer=Integer.parseInt(strAnswer);
	   }
	    
	  

	//응답 인코딩
	  response.setContentType("text/html; charset=UTF-8");
	
	// 스트림
	  PrintWriter out=response.getWriter();
	
    // 응답하기
    out.println("<script>");
    if(num1 * num2 == answer) {
      out.println("alert('정답입니다.')");
    } else {
      out.println("alert('오답입니다.')");
    }
    out.println("location.href='/servlet_ex/ex02/NewFile.html'");
    out.println("</script>");
    out.flush();
    out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
