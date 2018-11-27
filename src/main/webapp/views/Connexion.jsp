

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MiniProjetJava</title>
    </head>
    <body>
        <h1>Identifiez vous</h1>
        
        <form method="POST">
		<label>Login : </label>
                <input name="login">
                
                <p></p>
                <label>Password :</label>
                <input name="mdp" type="password" >
		<input name="action" value="Connexion" type="SUBMIT">
	</form>
        <p> ${erreurAut}</p> 
    </body>
</html>
