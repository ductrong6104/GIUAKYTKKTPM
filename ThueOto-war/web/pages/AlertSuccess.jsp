<%-- 
    Document   : AlertSuccess
    Created on : Mar 29, 2024, 8:43:48 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Announce Hire Success</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.">
    <style>
        .image-success img {
            width: 100%;
            height: auto; /* Chỉ đặt chiều rộng, chiều cao tự động điều chỉnh */
            border-radius: 10px; /* Bo tròn góc của hình ảnh */
        }

        .card-title {
            text-align: center;
            margin-top: 20px; /* Khoảng cách từ tiêu đề đến hình ảnh */
        }

        .card-body {
            padding: 20px; /* Thêm padding cho card-body */
        }

        .row {
            margin-top: 20px; /* Khoảng cách giữa hai phần thông tin */
        }

        p {
            border-bottom: black solid 1px;
            padding: 10px 0; /* Thêm padding cho mỗi dòng thông tin */
            margin-bottom: 0; /* Loại bỏ khoảng cách dưới cùng của mỗi dòng */
        }

        .anoun {
            text-align: center;
            margin-top: 20px; /* Khoảng cách từ card đến phần thông báo */
        }
    </style>
</head>
<body>
    <div class="container">
        <h1 style="color: greenyellow;">Thêm thông tin giấy phép lái xe thành công!</h1>
        
        <div class="card">
            <div class="card-body">
                <div class="card-title">
                    <h4>Cảm ơn bạn đã tin tưởng chúng tôi</h4>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <p>Mã Đơn</p>
                        <p>Mã Xe</p>
                        <p>Ngày Nhận</p>
                        <p>Địa Điểm</p>
                        <p>Tổng Tiền</p>
                    </div>
                    <div class="col-md-6">
                        <p>#DH123134</p>
                        <p>MITSUBISHI XPANDER 2021</p>
                        <p>28/3/2024</p>
                        <p>Quận 4, TP. HCM</p>
                        <p>912.000đ</p>
                    </div>
                </div>
            </div>
        </div>

        <div class="anoun">
            <!-- Nội dung thông báo -->
        </div>
    </div>
</body>
</html>

