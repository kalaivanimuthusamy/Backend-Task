<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<script type="text/javascript">
function displayAddSub()
{
	
	document.getElementById("addBook").style.display="none";
	document.getElementById("delSubject").style.display="none";
	document.getElementById("delBook").style.display="none";
	document.getElementById("serSubject").style.display="none";
	document.getElementById("serBook").style.display="none";
	document.getElementById("addSubject").style.display="block";	
	
}

function displayAddBook()
{
	
	
	document.getElementById("delSubject").style.display="none";
	document.getElementById("delBook").style.display="none";
	document.getElementById("serSubject").style.display="none";
	document.getElementById("serBook").style.display="none";
	document.getElementById("addSubject").style.display="none";	
	
	document.getElementById("addBook").style.display="block";
}

function displayDelSub()
{
	document.getElementById("addBook").style.display="none";
	document.getElementById("delBook").style.display="none";
	document.getElementById("serSubject").style.display="none";
	document.getElementById("serBook").style.display="none";
	document.getElementById("addSubject").style.display="none";	
	
	document.getElementById("delSubject").style.display="block";
}

function displayDelBook()
{
	
	document.getElementById("addBook").style.display="none";
	document.getElementById("delSubject").style.display="none";
	
	document.getElementById("serSubject").style.display="none";
	document.getElementById("serBook").style.display="none";
	document.getElementById("addSubject").style.display="none";	
	
	document.getElementById("delBook").style.display="block";
}


function displaySerSub()
{
	
	document.getElementById("addBook").style.display="none";
	document.getElementById("delSubject").style.display="none";
	document.getElementById("delBook").style.display="none";
	document.getElementById("serBook").style.display="none";
	document.getElementById("addSubject").style.display="none";	
	document.getElementById("serSubject").style.display="block";
}

function displaySerBook()
{
	document.getElementById("addBook").style.display="none";
	document.getElementById("delSubject").style.display="none";
	document.getElementById("delBook").style.display="none";
	document.getElementById("serSubject").style.display="none";
	
	document.getElementById("addSubject").style.display="none";	
	document.getElementById("serBook").style.display="block";
}

function addSub()
{
	
	document.getElementById("menuform").action="addSub";	
}

function addBook()
{
	document.getElementById("menuform").action="addBook";	
}

function delSub()
{
	document.getElementById("menuform").action="delSub";	
}

function delBook()
{
	document.getElementById("menuform").action="delBook";	
}

function serSub()
{
	document.getElementById("menuform").action="serSub";	
}

function serBook()
{
	document.getElementById("menuform").action="serBook";	
}

</script>
</head>
<body>
	<h1>Menu</h1>

	<input type="button" value="AddSubject" onclick="displayAddSub()"/>
	<input type="button" value="AddBook" onclick="displayAddBook()"/>
	<input type="button" value="DeleteSubject" onclick="displayDelSub()"/>
	<input type="button" value="DeleteBook" onclick="displayDelBook()"/>
	<input type="button" value="SearchSubject" onclick="displaySerSub()"/>
	<input type="button" value="SearchBook" onclick="displaySerBook()"/>
	

	<form method="post" id="menuform" action="">    
        
        <div id="addSubject" style="display:none">
        <table>
        <br>
        <tr><b>Add Subject</b> </tr> 
             
         <tr>    
          <td>Subtitle :</td>    
          <td><input type="text" name="subtitle"></td>  
         </tr>   
         <tr>    
          <td>DurationInHours :</td>    
          <td><input type="text" name="durationInHours"></td>  
         </tr>   
         <tr>    
          <td colspan="2"><input type="submit" value="Submit" onclick="addSub()"/></td>    
         </tr>    
        </table> 
        </div>  
        
        
        
        <div id="addBook" style="display:none">
        <table >  
        <br>
        <tr><b>Add Book</b> </tr>  
             
         <tr>    
          <td>Title :</td>    
          <td><input type="text" name="title"></td>  
         </tr>   
         <tr>    
          <td>Price :</td>    
          <td><input type="text" name="price"></td>  
         </tr>   
         <tr>  
         <tr>    
          <td>Volume :</td>    
          <td><input type="text" name="volume"></td>  
         </tr>   
         <tr>    
          <td>PublishDate :</td>    
          <td><input type="text" name="publishDate"></td>  
         </tr>   
         <tr>  
          <td colspan="2"><input type="submit" value="Submit" onclick="addBook()"/></td>    
         </tr>    
        </table> 
        </div>  
        
        
        
        <div id="delSubject" style="display:none">
        <table >  
        <br>
        <tr><b>Delete Subject</b> </tr>  
         <tr>    
          <td>Enter SubjectId : </td>   
          <td><input type="text" name="delSubjectId"></td>  
         </tr>    
         
         <tr>    
          <td colspan="2"><input type="submit" value="Submit" onclick="delSub()"/></td>    
         </tr>    
        </table> 
        </div>  
        
        
        
        <div id="delBook" style="display:none">
        <table >  
        <br>
        <tr><b>Delete Book</b> </tr>  
         <tr>    
          <td>Enter BookId : </td>   
          <td><input type="text" name="delBookId"></td>  
         </tr>    
         
         <tr>    
          <td colspan="2"><input type="submit" value="Submit" onclick="delBook()"/></td>    
         </tr>    
        </table> 
        </div>  
        
        
        <div id="serSubject" style="display:none">
        <table >
        <br>
        <tr><b>Search Subject</b> </tr>    
         <tr>    
          <td>Enter SubjectId : </td>   
          <td><input type="text" name="serSubId"></td>  
         </tr>    
         
         <tr>    
          <td colspan="2"><input type="submit" value="Submit" onclick="serSub()"/></td>    
         </tr>    
        </table> 
        </div>  
        
        
        <div id="serBook" style="display:none">
        <table >   
        <br>
        <tr><b>Search Book</b> </tr> 
         <tr>    
          <td>Enter BookId : </td>   
          <td><input type="text" name="serBookId"></td>  
         </tr>    
         
          <td colspan="2"><input type="submit" value="Submit" onclick="serBook()"/></td>    
         </tr>    
        </table> 
        </div>  
         
       </form>    
</body>
</html>
