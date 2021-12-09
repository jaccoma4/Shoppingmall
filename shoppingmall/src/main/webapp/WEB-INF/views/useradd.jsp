<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
    <style>
    .input{border: none}
    li{list-style: none; border: solid 1px; width: 440px; margin-left: 690px; text-align: left;}
    td{text-align: left; font-size: 15px;}
    </style>
</head>
<body>
<form action="userResult" style="text-align: center;">
        <ul>
            <li>
                <input class="input" type="text" name="name" placeholder="NAME"><br>
            </li>
            <li>
                <input class="input" type="text" name="id" placeholder="ID"><br>
            </li>
            <li>
                <input class="input" type="password" name="password" placeholder="PASSWORD"><br>
            </li>
            <li>
                <input class="input" type="password" name="password2" placeholder="Confirm PASSWORD"><br>
            </li>
            <li>
                <input class="input" type="text" name="email" placeholder="E-MAIL"><br>
            </li>
            <li>
                <input class="input" type="text" name="phone" placeholder="PHONE"><br>
            </li>
        </ul>
        <br>
        <input type="checkbox"> <strong>14세 이상입니다.</strong> <br>
        <div style="width: 440px; margin: auto; font-size: 13px">
        회원가입에 필요한 최소한의 정보만 입력 받음으로써<br>
        고객님의 개인정보 수집을 최소화하고 편리한 회원가입을 제공합니다. <br>
        
        <br>
            <fieldset>
                <input type="checkbox"> <strong>전체동의</strong>
            </fieldset>
        <fieldset>
            <table>
                <tr>
                    <td>
                        <input type="checkbox">이용약관 <button>내용</button>
                    </td>
                    <td>
                        <input type="checkbox">개인정보수집 <button>내용</button><br>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="checkbox">개인정보제3자제공 <button>내용</button>
                    </td>
                    <td>
                        <input type="checkbox">개인정보처리위탁 <button>내용</button>
                    </td>
                </tr>
                </table>
        </fieldset>
        <fieldset>
            <input type="checkbox"><strong>마케팅 수신동의</strong>
            <input type="checkbox">이메일
            <input type="checkbox">SNS
            <br><br>
            <div style="font-size: 11px;">쇼핑몰에서 제공하는 신상품 소식/ 할인쿠폰을 무상으로 보내드립니다!<br>
                단, 상품 구매 정보는 수신동의 여부 관계없이 발송됩니다.<br>
                제공 동의를 하지 않으셔도 서비스 이용에는 문제가 없습니다.<br>
            </div>
        </fieldset>
    </div>
        <br>
        <input type="submit" value="동의하고 가입하기" style="background-color: white; width: 300px; height: 60px; font-weight: bold;" >
    </form>

</body>
</html>