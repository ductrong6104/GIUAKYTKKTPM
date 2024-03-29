<%-- 
    Document   : themXe
    Created on : Mar 28, 2024, 9:56:41 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Car Form</title>
</head>
<body>

<h2>Add Car Form</h2>

<form action="addCar.jsp" method="post">
    <label for="carName">Car Name:</label><br>
    <input type="text" id="carName" name="carName"><br>

    <label for="numSeats">Number of Seats:</label><br>
    <input type="number" id="numSeats" name="numSeats"><br>

    <label for="fuelType">Fuel Type:</label><br>
    <select id="fuelType" name="fuelType">
        <option value="Petrol">Petrol</option>
        <option value="Diesel">Diesel</option>
        <option value="Electric">Electric</option>
    </select><br>

    <label for="transmission">Transmission:</label><br>
    <select id="transmission" name="transmission">
        <option value="Manual">Manual</option>
        <option value="Automatic">Automatic</option>
    </select><br>

    <label for="fuelConsumption">Fuel Consumption (L/100km):</label><br>
    <input type="number" id="fuelConsumption" name="fuelConsumption"><br>

    <label for="description">Description:</label><br>
    <textarea id="description" name="description" rows="4" cols="50"></textarea><br>

    <label for="price">Price:</label><br>
    <input type="number" id="price" name="price"><br>

    <input type="submit" value="Add Car">
</form>

</body>
</html>

