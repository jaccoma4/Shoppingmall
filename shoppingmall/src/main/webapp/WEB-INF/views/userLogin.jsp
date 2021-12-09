<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
    <style>
        form{text-align: center;}
        li{list-style: none; border: solid 1px; width: 300px;height: 40px;  margin: auto; text-align: center;}
        div{font-size: 10px; margin-left: auto; margin-right: 100px; margin-top: -10px;}
        .size{width: 280px; border: none;}
        a{color: black; text-decoration: none;}
    </style>
</head>
<body>
  
    <form action="main">
        <ul>
            <li>
                <input class="size" type="text" name="id" placeholder="ID 입력"><br>
            </li>
            <li>
                <input class="size" type="password" name="password" placeholder="PASSWORD 입력"><br>
            </li>
        </ul>
        <div>
        <a href="findId">SEARCH ID</a> / <a href="findPassword">SEARCH PASSWORD</a> <br>
    </div>
    <br>
    <br>
    <br>
    <input type="submit" value="LOGIN" style="width: 300px; height: 30px; margin-left:40px; background-color: white; border: solid 1px black;">
</form>
  
</body>
</html>