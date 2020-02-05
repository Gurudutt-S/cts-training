<%@ include file="header.jsp" %>
	<%
		Date date = new Date();
		out.println(date);
	%>

	<%=getSum(3, 4)%>

	<%!public static int getSum(int a, int b) {
		return a + b;
	}%>
</body>
</html>