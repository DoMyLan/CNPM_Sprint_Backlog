# CNPM_Sprint_Backlog
THÀNH VIÊN:
1. Đỗ Thị Mỹ Lan             Mssv: 20110666
2. Nguyễn Hữu Đạt            Mssv: 20110630
3. Bùi Quốc Tĩnh             Mssv: 20110737

ĐÈ TÀI:      Xây dựng "Website Đăng ký đề tài khoa CNTT" dựa trên nền tảng ASP.NET MVC
Day 1: Tìm hiểu về mô hình ASP.NET & mô hình MVC
  1. Tìm hiểu về mô hình MVC
  MVC là viết tắt của 3 từ M - Model, V - View, C - Controller. Mô hình MVC là một kiến trúc phần mềm hay mô hình thiết kế phần mềm giúp chúng ta tách ứng dụng của chúng ta thành những phần độc lập có những nhiệm vụ riêng biệt.

    a. Model
      -  Model là thành phần chứa các phương thức xử lý logic, kết nối và truy xuất database, mô tả dữ liệu,...
    b. View
      -  View là thành phần hiển thị thông tin, tương tác với người dùng.
    c. Controller
      -  Controller là thành phần điều hướng, là chất kết dính giữa model và view, có nhiệm vụ nhận những request từ người dùng, tương tác với model để lấy thông tin       và gửi cho view để hiển thị lại cho người dùng.

  Mô hình MVC giúp bạn tạo được các ứng dụng phân tách rạch ròi các khía cạnh (logic về nhập liệu, logic xử lý tác vụ và logic về giao diện). Mô hình MVC chỉ ra mỗi loại logic kể trên nên được thiếp lập ở đâu trên ứng dụng. Logic giao diện (UI logic) thuộc về views. Logic nhập liệu (input logic) thuộc về controller. Và logic tác vụ (Business logic – là logic xử lý thông tin, mục đích chính của ứng dụng) thuộc về model. Sự phân chia này giúp bạn giảm bớt được sự phức tạp của ứng dụng và chỉ tập trung vào mỗi khía cạnh cần được cài đặt ở mỗi thời điểm.

  Mô hình MVC giúp thực hiện dự án một cách dể dàng và nhanh chóng, trong lúc HTML designer thiết kế giao diện ở tần view thì hai lập trình viên còn lại sẻ đảm nhận logic ở tầng controller và các tác vụ ở tầng model.
  
  2. Tìm hiểu ASP.NET
