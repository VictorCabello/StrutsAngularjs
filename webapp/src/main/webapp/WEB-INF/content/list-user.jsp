<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <sj:head jquerytheme="redmond"/>
        <style>
        body{
            font-size: 10pt;
        } 
        </style>
    </head>
    <body>
        <h1>User List</h1>
        <ul>
            <s:iterator value="list">
                <li><s:property value="username" /></li>
            </s:iterator>
        </ul>
    </body>
</html>
