<%-- 
    Document   : DSXe
    Created on : Mar 28, 2024, 8:49:48 PM
    Author     : ADMIN
--%>


<%@page import="entityBean.CarEntity"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="sessionBean.Car"%>
<%@page import="javax.naming.InitialContext"%>
<%@page contentType="text/html" pageEncoding="UTF-8"
        %>
<%!
    private Car car = null;
    public void jspInit () {
        try {
//        tim class Converter trong client server
        InitialContext ic = new InitialContext () ;
        car = (Car) ic.lookup (Car.class.getName () ) ;
           System.out.println("abc");
        } catch (Exception ex) {
        System.out.println("Couldn't create converter bean. " + ex.getMessage ()) ;

        }
    }
    public void jspDestroy () {
        car = null;
    }
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
        <link rel="shortcut icon" type="image/x-icon" href="https://cdn-icons-png.flaticon.com/512/3097/3097180.png">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&display=swap">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
        
        <title>AUTOMOBILE</title>
        
        <link rel="stylesheet" href="../css/style.css">
    </head>

    <body>
        <header>
            <nav class="navbar navbar-expand-lg">
                <div class="container">
                    <div>
                        <a class="navbar-brand" href="">AUTOMOBILE</a>
                    </div>
                    
                    <button type="button" class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#menu"> 
                        <span class="navbar-toggler-icon"></span>
                    </button>

                    <div>
                        <button class="btn btn-primary">Đăng ký</button>
                    </div>
            
                </div>
            </nav>
         </header>

         <main>

            <!-- <div class="container">
                <div class="event-card">
                    <div class="location">
                        <p>Địa điểm</p>
                        <h4>Hồ Chí Minh
                            <img src="../images/down-arrow.png" data-bs-toggle="modal" data-bs-target="#myModal1"></img>
                        </h4>
                    </div>
                    <div class="time">
                        <p>Thời gian</p>
                        <h4>9:00, 27-03-2024 - 15:00, 28/03/2024
                            <img src="../images/down-arrow.png" data-bs-toggle="modal" data-bs-target="#myModal2"></img>
                        </h4>
                       
                    </div>
                </div>

                
            </div> -->
            <div class="container">
                <div class="event-card">
                    <div class="location">
                        <p>Địa điểm:</p>
                        <h4 id="locationH4">Hồ Chí Minh</h4>
                        

                    </div>
                    <div class="time">
                        <p>Thời gian:</p>
                        <!-- <h4>9:00, 27-03-2024 - 15:00, 28/03/2024</h4> -->
                        <h4 id="defaultTime">Chọn thời gian</h4>
                    </div>
                </div>
            </div>

            <script>
                var urlParams = new URLSearchParams(window.location.search);
                var city = urlParams.get('city');
                var time = urlParams.get('time');

                // Đặt giá trị thành phố vào phần tử h4
                document.getElementById("locationH4").innerText = city;
                document.getElementById("defaultTime").innerText = time;
               
                
            </script>

            <div class="container py-3">
                <div class="row">
                    
                    <% List<CarEntity> listCar = car.initListCar();
                        for (CarEntity carEnti: listCar ){
                        %>
                            <div href="" class="col-md-4">
                            <a class="card" href="DetailCar.jsp?id=<%=carEnti.getId()%>">
                            <img src="../images/mitsubishi_1.jpg">
                            <div class="card_chitiet">
                                <h4><%= carEnti.getName() %></h4>
                                <span style="display: flex;">
                                    <p><img src="../images/location.png">Quận 10, TP.HCM</p>
                                    <p class="text-right"><%= carEnti.getPrice() %>k/ngày</p>
                                </span>
                                
                            </div>
                        </a>
                    </div>
                       <% }%>
                    
                          

                </div>
            </div>

            

         </main>
    </body>
</html>
<script>
    console.log(<%= listCar %>);
</script>
