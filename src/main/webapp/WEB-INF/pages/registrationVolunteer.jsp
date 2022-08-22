<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration form</title>
</head>
<body>
<h1>Fill in the form to register as a volunteer</h1>
<form action="/main" method="post">
    <label for="firstName">First name</label>
    <input type="text" id="firstName" name="firstName" placeholder="firstName"><br>
    <label for="secondName">Second name</label>
    <input type="text" id="secondName" name="secondName" placeholder="secondName"><br>
    <label for="middleName">Middle name</label>
    <input type="text" id="middleName" name="middleName" placeholder="middleName"><br>
    <label for="DoB">Date of Birth</label>
    <input type="date" id="DoB" name="DoB"><br>
    <label for="sex">Sex</label>
    <select id="sex">
        <option value="sexNotDefined">sex is not defined</option>
        <option value="female">female</option>
        <option value="male">male</option>
    </select><br>
    <label for="login">Login</label>
    <input type="text" id="login" name="login"><br>
    <label for="password">Password</label>
    <input type="password" id="password" name="password"><br>
    <label for="phoneNumber">Phone number +375</label>
    <select>
        <option>25</option>
        <option>29</option>
        <option>44</option>
    </select>
    <input type="text" id="phoneNumber" name="phoneNumber"><br>
    <label for="email">Email</label>
    <input type="email" id="email" name="email">
    <br>
    <input type="submit">
</form>
</body>
</html>
