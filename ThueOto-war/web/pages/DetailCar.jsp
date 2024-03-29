<%-- 
    Document   : DetailCar
    Created on : Mar 29, 2024, 2:36:41 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="entityBean.CarEntity"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="sessionBean.Car"%>
<%@page import="javax.naming.InitialContext"%>

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
    
//    List<CarEntity> listCar = car.initListCar();
//    int id = (int ("name");
//    CarEntity carEnti = car.getDetailCar(listCar, i);
    %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mitsubishi Xpander 2021</title>
    <link rel="stylesheet" href="../css/style1.css"> <!-- Kết nối tệp CSS -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

</head>

<body>
    <!-- <header>
        <div class="container">
            <div class="logo">
                <a href="#"><img src="https://ib.vib.com.vn/banners/Promotion/20230809115819127_logo.jpg"
                        alt="Logo"></a>

            </div>
            <nav>
                <ul>
                    <li><a href="#">Menu item 1</a></li>
                    <li><a href="#">Menu item 2</a></li>
                    <li><a href="#">Menu item 3</a></li>
                    Add more menu items as needed 
                </ul>
            </nav>
        </div>
    </header> -->


    <main>
        <div class="info-bar">
            <div class="container">
                <ul>
                    <li><a href="#specs">Đặc điểm</a></li>
                    <li><a href="#documents">Giấy tờ thuê xe</a></li>
                    <li><a href="#location">Vị trí xe</a></li>
                    <li><a href="#owner">Chủ xe</a></li>
                    <!-- Add more info items as needed -->
                </ul>
            </div>
        </div>

        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="car-images">
                        <div class="container">
                            <img class="main-img"
                                src="https://n1-pstg.mioto.vn/cho_thue_xe_o_to_tu_lai_thue_xe_du_lich_hochiminh/mitsubishi_xpander_2021/p/g/2022/01/10/08/kWj-GgCY2tnKK1j8OyhZ1w.jpg"
                                alt="Main Image">
                            <div class="sub-images">
                                <img src="https://n1-pstg.mioto.vn/cho_thue_xe_o_to_tu_lai_thue_xe_du_lich_hochiminh/mitsubishi_xpander_2021/p/g/2022/01/10/08/GnSe5I7fxDjknlQwLa1q5A.jpg"
                                    alt="Sub Image 1">
                                <img src="https://n1-pstg.mioto.vn/cho_thue_xe_o_to_tu_lai_thue_xe_du_lich_hochiminh/mitsubishi_xpander_2021/p/g/2022/01/22/11/VtYgkEKdL6fLj-cWdf7P7Q.jpg"
                                    alt="Sub Image 2">
                                <img src="https://n1-pstg.mioto.vn/cho_thue_xe_o_to_tu_lai_thue_xe_du_lich_hochiminh/mitsubishi_xpander_2021/p/g/2022/01/22/12/Qmmo4B_hpEAAhHiUUbSctw.jpg"
                                    alt="Sub Image 3">
                                <!-- Add more sub images as needed -->
                            </div>

                        </div>
                        <h2 class="container title-car">MITSUBISHI XPANDER 2021</h2>
                        <p class="container">100+ chuyến - Quận 4, TP. Hồ Chí Minh</p>

                    </div>

                </div>
            </div>
        </div>


        <hr>





        <div class="row">
            <div class="col-md-8">
                <h4 class="characteristic">Đặc Điểm</h4>
                <div class="row">
                    <div class="col-md-3">

                        <div class="seat-info">
                            <!-- <img src="https://static.vecteezy.com/system/resources/previews/014/661/896/non_2x/racing-car-seat-line-icon-vector.jpg" alt="Seat Icon" class="icon-left"> -->
                            <div class="seat-content">
                                <div class="seat-count">Số ghế</div>
                                <div class="seat-description">7 chỗ</div>
                            </div>
                        </div>



                    </div>
                    <div class="col-md-3">
                        <div class="seat-info">
                            <div class="seat-count">Truyền Động</div>
                            <div class="seat-description">Số tự động</div>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="seat-info">
                            <div class="seat-count">Nhiên liệu</div>
                            <div class="seat-description">Xăng</div>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="seat-info">
                            <div class="seat-count">NL tiêu hao</div>
                            <div class="seat-description">6 lít/100km</div>
                        </div>
                    </div>

                </div>
                <hr>
                <h4 class="characteristic">Mô Tả</h4>
                <div class="characteristic seat-count"> Xe mới đăng kí 2/2022. Mua kết hợp đi gia đình và cho thuê.
                    Ưu tiên gia đình hàng đầu nên đảm bảo sạch sẽ, cho khách hàng có những chuyến du lịch thú vị cùng
                    người thân của mình.</div>

                <hr>
                <h4 class="characteristic">Các tiện nghi khác</h4>
                <div class="row characteristic">
                    <div class="col-md-3">
                        <div class="seat-info">
                            <div class="seat-count"><i class="fa-regular fa-location-dot"></i> Bản đồ</div>

                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="seat-info">
                            <div class="seat-count">Túi khí an toàn</div>

                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="seat-info">
                            <div class="seat-count">Bluetooth</div>

                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="seat-info">
                            <div class="seat-count">Camera hành trình</div>

                        </div>
                    </div>
                </div>
                <br>

                <div class="row characteristic">
                    <div class="col-md-3">
                        <div class="seat-info">
                            <div class="seat-count">Camera lùi</div>

                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="seat-info">
                            <div class="seat-count">Định vị GPS</div>

                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="seat-info">
                            <div class="seat-count">Khe cắm USB</div>

                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="seat-info">
                            <div class="seat-count">Lốp dự phòng</div>

                        </div>
                    </div>
                </div>
                <hr>
                <h4 class="characteristic">Giấy tờ thuê xe</h4>

                <div class="rental-car">
                    <p>Chọn 1 trong 2 hình thức</p>
                        <h5>GPLX & CCCD gắn chip (đối chiếu)</h5>
                        <h5>GPLX (đối chiếu) & Passport (giữ lại)</h5>
                </div>
                
                
            </div>
            <div class="col-md-4">
                <div class="card">
                    <div class="card-body">
                        <h3 class="card-title">
                            825/ngày
                            <div class="card card-child">
                                <div class="card-body">
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="seat-count">Nhận xe</div>
                                            <div class="seat-description">28/3/2024 21:00</div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="seat-count">Trả xe</div>
                                            <div class="seat-description">29/3/2024 21:00</div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="card">
                                <div class="card-body">
                                    
                                    <h6>Địa điểm giao xe</h6>
                                    <h6>Quận 4, TP. Hồ Chí Minh</h6>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-md-6">
                                    <h6>Đơn giá thuê xe</h6>
                                    <h6>Bảo hiểm thuê xe</h6>
                                    <hr>
                                    <h6>Tổng cộng</h6>
                                </div>
                                <div class="col-md-6">
                                    <h6>947.000đ/ngày</h6>
                                    <h6>84.000đ/ngày</h6>
                                    <hr>
                                    <h6>1.030.000đ x 1 ngày</h6>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-md-6">
                                    <h5>Thành Tiền</h5>
                                </div>
                                <div class="col-md-6">
                                    <h5>912.000đ</h5>
                                </div>
                                <button class="btnchoose-hire" type="submit" onclick="openform()">Chọn Thuê</button>
                                
                            </div>
                        </h3>
                    </div>
                </div>
            </div>
        </div>





    </main>

    <footer>
        <!-- Footer content -->
    </footer>

    <script src="scripts.js"></script>
<script>
    function openform() {
        var result = confirm("Bạn cần xác thực GPLX và số điện thoại mới có thể đặt xe");
        if (result) {
            // Chuyển sang trang FormRetalCar.html
            window.location.href = "FormRetalCar.jsp";
        } else {
            // Tắt hộp thông báo
        }
    }
</script>

</body>

</html>
