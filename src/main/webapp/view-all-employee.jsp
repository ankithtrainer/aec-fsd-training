<%@page import="java.util.List,com.aec.training.entity.Employee" %>

<%
    List<Employee> listOfEmployees  = (List<Employee>) request.getAttribute("employeeList");
 %>
 
 <table>
	<tr>
		 <td>
			Emp Id
		 </td>	
		 <td>
		     Name		
		  </td>
		  <td>
			 Email	
		  	  </td>
			  <td>
			  	 City			
			  	  </td>
				 <td>
				  Phone	
				 </td>
				 <td>
					Address
			     </td>			
				 
    </tr>		
	
	<% 
	for(Employee emp:listOfEmployees ) {
			
	%>
	<tr>
			 <td>
				<%=emp.getEmpId()%>
			 </td>	
			 <td>
				<%=emp.getEmpname()%>
		
			  </td>
			  <td>
				<%=emp.getEmpemail()%>
	
			  	  </td>
				  <td>
					<%=emp.getEmpcity()%>
		
				  	  </td>
					 <td>
						<%=emp.getEmpephone()%>

					 </td>
					 <td>
						<%=emp.getEmpeaddress()%>

				     </td>			
					 
	    </tr>		
	<%	
			}
	%>
	
	
	
	
 </table	
	
	
 
 