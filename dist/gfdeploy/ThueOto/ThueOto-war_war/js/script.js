// Mở modal
function openModal1() {
    var modal = new bootstrap.Modal(document.getElementById("myModal1"));
    modal.show();

    
    // Set default city value to "Hồ Chí Minh"
    document.getElementById("inputText").value = "Hồ Chí Minh";

    

}





// Đóng modal và hiển thị lại giao diện
function closeModal1() {
    var modal = new bootstrap.Modal(document.getElementById("myModal1"));
    modal.hide();
    document.body.classList.remove('modal-open'); // Xóa class 'modal-open' từ body để hiển thị giao diện
    var backdrop = document.querySelector('.modal-backdrop');
    backdrop.parentNode.removeChild(backdrop); // Xóa backdrop để hiển thị giao diện
}



// Mở modal và hiển thị DatePicker
function openModal2() {
     // Mở modal chọn thời gian
     var modal = new bootstrap.Modal(document.getElementById('myModal2'));
     modal.show();

     
}

// Đóng modal
function closeModal() {
    var modal = new bootstrap.Modal(document.getElementById("myModal2"));
    modal.hide();
    document.body.classList.remove('modal-open'); // Xóa class 'modal-open' từ body để hiển thị giao diện
    var backdrop = document.querySelector('.modal-backdrop');
    backdrop.parentNode.removeChild(backdrop); // Xóa backdrop để hiển thị giao diện
}

