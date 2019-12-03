<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Product Entry</title>
</head>
<body>

	<form:form id="bookingForm" modelAttribute="jaan"
		action="process-flight" method="post">

		<table align="center">
			<tr>
				<td>Trip Type:</td>
				<td>
				One Way:
				<form:radiobutton path="trip" value="One Way" size="50"/> 
				Round Trip:
				<form:radiobutton path="trip" value="Round Trip" size="50"/>
				</td>
				
			</tr>
			<tr>
				<td><form:label path="from">From : </form:label></td>
				<td><form:input path="from" name="from" id="from" size="50"/></td>
			</tr>
			<tr>
				<td><form:label path="to">To :</form:label></td>
				<td><form:input path="to" name="to" size="50"
						id="to" /></td>
			</tr>
			<tr>
				<td>Choose Airline</td>
				<td>
				<form:select path="airLine">
				<form:option value="Choose your preferred Airline"></form:option>
				<form:option value="Delta Airlines"></form:option>
				<form:option value="American Airlines"></form:option>
				<form:option value="United Airlines"></form:option>
				<form:option value="Kam Airlines"></form:option>
				<form:option value="UAE Airlines"></form:option>
				<form:option value="German Airline"></form:option>
				<form:option value="Turkish Airline"></form:option>
				</form:select>
				</td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><form:button id="submit" name="submit">Submit</form:button>
				</td>
			</tr>
			<tr></tr>
		</table>
	</form:form>

</body>
</html>