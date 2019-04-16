<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html> 
<html>
    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <title>Prueba proyecto películas</title>
    </head>

    <body>
        <h1>Prueba proyecto películas</h1>

        <h2>Servlets disponibles:</h2>
        <ul>
            <li>Youtube</li>
            <li>AliExpress</li>
        </ul>
        <div>
        	<form action='/searchController' method='post'>
			<input type='text' placeholder='Busca un anime' class='busqueda' name='query' required/>
			<input type='submit' class='enviar' name='searchBtn' title='search' value='Buscar'>
			</form>
        </div>
    </body>
</html>
