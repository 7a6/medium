<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<TITLE>Relationships</TITLE>
</HEAD>
<BODY>
	<H1>Relationships</H1>
	<UL>
		<c:forEach var="student" items="${studentList}" varStatus="”status”">
			<LI><A href="member.do?id=${status.index}"> <c:out
						value="${member}"></c:out>
			</A></LI>
		</c:forEach>
	</UL>
</BODY>
</HTML>