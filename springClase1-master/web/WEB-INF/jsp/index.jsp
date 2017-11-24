<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        
      <div class="form-group" align="center">
     <form action="ver.htm" method="POST">
              
            <H1>¿ESTAS ESTRESADO AMIGUITO?</H1>
              
               <input type="radio" name="desicion" value="v1" checked>Si<br>
                <input type="radio" name="desicion" value="v2">No <br>
                
                <label>¿Te has arrancado el cabello ultimamente?</label> <br>
                      <input type="radio" name="desicion2" value="v2"checked>No <br>
                       <input type="radio" name="desicion2" value="v1">Si <br>
                       
                   <label>¿Has tenido llanto incontrolable por las noches?</label> <br>
                      <input type="radio" name="desicion3" value="v2"checked>No <br>
                       <input type="radio" name="desicion3" value="v1">Si <br>
                       
                   <label>¿Has Tenido ganas de cometer un Asesinato premeditado?</label> <br>
                      <input type="radio" name="desicion4" value="v2"checked>No <br>
                       <input type="radio" name="desicion4d" value="v1">Si <br>     
                
                
                <input type="submit" value="Envia">
            
            </div>
        </form>
    </body>
</html>
