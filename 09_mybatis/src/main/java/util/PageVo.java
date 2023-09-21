package util;

public class PageVo {


  private int page;     // 현재 페이지 번호(요청 파라미터로 받는다.)
  private int total;    // 전체 항목의 개수(DB에서 구한 뒤 받는다.)
  private int display;  // 한 페이지에 표시할 항목의 개수(요청 파라미터로 받는다.)
  private int begin;    // 한 페이지에 표시되는 항목의 시작 번호(계산한다.)
  private int end;      // 한 페이지에 표시되는 항목의 종료 번호(계산한다.)
  
  private int totalPage;        // 전체 페이지의 개수(계산한다.)
  private int pagePerBlock =3; // 한 블록에 표시되는 페이지의 개수(임의로 정한다.)
  private int beginPage;        // 한 블록에 표시되는 페이지의 시작 번호(계산한다.)
  private int endPage;          // 한 블록에 표시되는 페이지의 종료 번호(계산한다.)
	
	public void setPaging(int page,int total,int display) {
		
		//한 페이지를 나타낼 때 필요한 정보
		
		//받은 정보 저장
		
	}
  
  
}
