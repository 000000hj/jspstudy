/**
 * 본문을 모두 읽은 뒤 JavaScript를 수행할 수 있도록 load 이벤트 처리한다.
 * 방법1. window.onload =function(){}
 * 방법2. $(document).ready(function(){})
 * 방법3. $(function(){})
 */
 
 
 $(function(){
  
   $('.gnb a').mouseover(function(){
  $(this).css('background-color','silver');
 
  
})
  
$('.gnb a').mouseout(function(){
  $(this).css('background-color','transparent');
  
})

/*logo div에 이미지 태그를 만들어서 넣기*/
var img= new Image();
$(img).attr('src',getContextPath()+'/resource/images/naver.png');
$(img).css('width','150px');
$('.logo').html(img);

  
})

function getContextPath(){
  // location.href === http://localhost:8080/jsp/ex03_layout/main1.jsp
  // location.host === localhost:8080
  var begin = location.href.indexOf(location.host) + location.host.length;
  var end = location.href.indexOf('/', begin + 1);
  return location.href.substring(begin, end);
}



