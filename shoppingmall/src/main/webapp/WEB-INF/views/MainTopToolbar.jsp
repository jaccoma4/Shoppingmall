<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
       li{list-style: none;}
        #top_menu_bar{
            display: flex;
            justify-content:space-around;
        
        }
        #left_menu_bar{ transform: translateX(-150px);}
        #right_menu_bar{ transform: translateX(80px);}
        input[type="text"]{border:none;}
        
</style>
</head>
<body>
	<div id="top_menu_bar">
        <span id="left_menu_bar">
            <ul>
                <li>MEN</li>
                <li>WOMEN</li>
                <li>COLLECTION</li>
            </ul>
        </span>
        <span class="center_logo"><img src="/resources/img/WooYoungMi_MainLogo.png" alt="메인로고" width="200px" height="50px"></span>
        <span id="right_menu_bar">
            <input type="text" placeholder="SEARCH">
            <span>JOIN</span>
            <span>LOGIN</span>
            <span>CART(0)</span>
        </span>
    </div>
</body>
</html>