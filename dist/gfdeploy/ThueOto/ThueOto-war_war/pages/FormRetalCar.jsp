<%-- 
    Document   : FormRetalCar
    Created on : Mar 29, 2024, 2:36:50 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>RentailCar</title>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

    <style>
        .btnsubmit {
            background-color: rgb(126, 190, 126);
            border-radius: 15px;
            margin-top: 70px;
            padding: 5px 40px 5px 40px;
            size: 15px;
            color: white;

            width: 100%;

            border: none;
            /* Xóa viền */
            outline: none;
        }

        .card-title {
            text-align: center;
        }

        .all-group {
            text-align: center;
        }

        .group {
            text-align: left;
        }

        .card {
            max-width: 500px;
            margin: auto;
            /* Đưa card ra chính giữa màn hình */
            margin-top: 50px;
            /* Khoảng cách từ card đến đỉnh màn hình */
            background-color: rgb(250, 251, 252);
        }

        .card-body {
            padding: 30px;
            /* Khoảng cách bên trong card */
        }

        .font-control {
            width: 100%;
        }

        .group {
            position: relative;
        }

        .image-rental {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            opacity: 0;
            cursor: pointer;
        }

        .upload-label {
            position: absolute;
            top: 0;
            left: 0;
            width: 40%;
            height: 100px;
            background-color: #007bff;
            /* Màu nền của nút chọn */
            color: #fff;
            /* Màu chữ */
            text-align: center;
            line-height: 40px;
            /* Điều chỉnh căn giữa theo chiều dọc */
            border-radius: 5px;
            cursor: pointer;
        }

        .preview-image {
            display: none;
            max-width: 100px;
            /* Kích thước tối đa của hình xem trước */
            max-height: 100px;
            /* Kích thước tối đa của hình xem trước */
        }
    </style>

</head>

<body>
    <div class="container">
        <div class="card">
            <div class="card-body">
                <div class="card-title">
                    <h2>Xác thực giấy phép lái xe</h2>
                </div>
                <div class="all-group">
                    <div class="group">
                        <p>Số phép lái xe</p>
                        <input type="text" class="font-control">
                    </div>
                    <div class="group">
                        <p>Họ và tên</p>
                        <input type="text" class="font-control">
                    </div>
                    <div class="group">
                        <p>Ngày sinh</p>
                        <input type="date" class="font-control">
                    </div>
                    <br>
                    <div class="group">
                        <p>Ảnh giấy phép lái xe</p>
                        <input type="file" class="image-rental" id="image-upload" accept="image/*">
                        <label for="image-upload" class="upload-label">Chọn ảnh</label>
                        <img id="preview-image" src="#" alt="Preview" class="preview-image">
                    </div>

                    <button class="btnsubmit" type="submit" class="font-control">Xác Thực</button>
                </div>
            </div>
        </div>
    </div>
</body>

</html>
