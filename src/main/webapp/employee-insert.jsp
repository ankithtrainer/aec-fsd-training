<html>

  <head>Spring Boot Employee Insert Page</head>
  
  <body bgcolor="powderblue">
     <form method="post" action="insert-emp-data">
         <table>
         
            <tr>
               <td> Employee Id </td>                   
               <td> <input type="text" name="empid"/></td>
            </tr>
             <tr>
               <td> Employee Name </td>                   
               <td> <input type="text" name="empname"/></td>
            </tr>
             <tr>
               <td> Employee Email</td>                   
               <td> <input type="text" name="empemail"/></td>
            </tr>
             <tr>
               <td> Employee City</td>                   
               <td> <input type="text" name="empcity"/></td>
            </tr>
             <tr>
               <td> Employee Phone</td>                   
               <td> <input type="text" name="empephone"/></td>
            </tr>
             <tr>
               <td> Employee Address</td>                   
               <td> <text-area type="text" name="empeaddress" rows=10 col=100> </text-area>
               
               </td>
            </tr>
            <tr>
               <td>
                   <input type="submit" name="submit"/>
               </td>
               <td>
                   <input type="reset" name="submit"/>
               </td>
            </tr>
         
         </table>
     
     
     </form>
  
  
  
  </body>


</html>