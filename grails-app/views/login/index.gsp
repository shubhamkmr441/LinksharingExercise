<%@ page contentType="text/html;charset=UTF-8" %>
<head style="alignment:right">
    <meta name="layout" content="main"/>
    <title></title>
</head>
<body>
<div id="div1" align="right">
    <g:form id="1" action="signin"  style="border: groove;background-color: #48802C;width: 40% ">

        User Name* :  <g:textField name="Username1" value="" >vvv </g:textField>
        <br/>
        Password*  :  <g:passwordField   name="password1" value=""  > vvvv </g:passwordField>
        <br/>
        <g:submitButton name="Submit1"  type="submit" value="Login" >SIGNIN</g:submitButton>
    </g:form>
</div>
<br/>
<div id= "div2" align="right">
    <g:form id = "form2" controller="user" action="register"  style="border:outset ;background-color: #48802C; width:40%">
        First Name* <g:textField name="firstname1"/>
        <br/>
        Last Name* <g:textField name="Lastname1"/>
        <br/>
        Email* <g:textField name="Email1"/>
        <br/>
        UserName*  <g:textField name="Username2"/>
        <br/>
        Password*  <g:passwordField name="password2"/>
        <br/>
        Confirm Password* <g:passwordField name="confpassword"/>
        <br/>
        Photo <input id="inputfield" type="file" name="file1"/>
        <g:submitButton name="Register" />
    </g:form>
</div>

</body>
</html>