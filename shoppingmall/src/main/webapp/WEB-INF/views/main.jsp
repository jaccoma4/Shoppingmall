<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	/*.video{display:block; align: middle; width:500px; height:500px;}*/
	#shop_now{text-align: center;}
	.product{width: 236px; height: 354px; float: left; margin: 30px; margin-bottom: 60px;}
	#main_img{display: block; margin: 0px auto;}
</style>

</head>
<body>
	<div><jsp:include page="MainTopToolbar.jsp"/></div>
	<div class="video">
		
		<iframe width=100% height=880px src="/resources/video/main_video.mp4" onload="resizeFrame(this)"  frameborder=0></iframe>         
	</div>
	<div id="shop_now">SHOP NOW</div>
	<div id="middle_product">
		<span class="product">
		<img alt="" src="/resources/img/man_top_01.jpg" width="236px" height="354px" autoplay loop ><br>
		목폴라<br>
		KRW 480,000
		</span>
		<span class="product">
			<img alt="" src="/resources/img/man_top_01.jpg" width="236px" height="354px" autoplay loop ><br>
			목폴라<br>
			KRW 480,000
		</span>
		<span class="product">
			<img alt="" src="/resources/img/man_top_01.jpg" width="236px" height="354px" autoplay loop ><br>
			목폴라<br>
			KRW 480,000
		</span>
		<span class="product">
			<img alt="" src="/resources/img/man_top_01.jpg" width="236px" height="354px" autoplay loop ><br>
			목폴라<br>
			KRW 480,000
		</span>
		<span class="product">
			<img alt="" src="/resources/img/man_top_01.jpg" width="236px" height="354px" autoplay loop ><br>
			목폴라<br>
			KRW 480,000
		</span>
	</div>
	<div id="main_img">
	
		<img alt="" src="/resources/img/main_img_man.png" width="405px" height="600px">
		<img alt="" src="/resources/img/main_img_woman.png" width="405px" height="600px">
	</div>
	
	
	
</body>
</html>