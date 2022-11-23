# CNPM_Sprint_Backlog
THÀNH VIÊN:
1. Đỗ Thị Mỹ Lan             Mssv: 20110666
2. Nguyễn Hữu Đạt            Mssv: 20110630
3. Bùi Quốc Tĩnh             Mssv: 20110737

# ĐỀ TÀI: Xây dựng "Website Đăng ký đề tài khoa CNTT" dựa trên nền tảng ASP.NET MVC
## Day 1: Tìm hiểu về mô hình ASP.NET & mô hình MVC
### 1. Tìm hiểu về mô hình MVC
MVC là viết tắt của 3 từ M - Model, V - View, C - Controller. Mô hình MVC là một kiến trúc phần mềm hay mô hình thiết kế phần mềm giúp chúng ta tách ứng dụng của chúng ta thành những phần độc lập có những nhiệm vụ riêng biệt.

a. Model
-  Model là thành phần chứa các phương thức xử lý logic, kết nối và truy xuất database, mô tả dữ liệu,...
b. View
-  View là thành phần hiển thị thông tin, tương tác với người dùng.
c. Controller
-  Controller là thành phần điều hướng, là chất kết dính giữa model và view, có nhiệm vụ nhận những request từ người dùng, tương tác với model để lấy thông tin       và gửi cho view để hiển thị lại cho người dùng.

Mô hình MVC giúp bạn tạo được các ứng dụng phân tách rạch ròi các khía cạnh (logic về nhập liệu, logic xử lý tác vụ và logic về giao diện). Mô hình MVC chỉ ra mỗi loại logic kể trên nên được thiếp lập ở đâu trên ứng dụng. Logic giao diện (UI logic) thuộc về views. Logic nhập liệu (input logic) thuộc về controller. Và logic tác vụ (Business logic – là logic xử lý thông tin, mục đích chính của ứng dụng) thuộc về model. Sự phân chia này giúp bạn giảm bớt được sự phức tạp của ứng dụng và chỉ tập trung vào mỗi khía cạnh cần được cài đặt ở mỗi thời điểm.

Mô hình MVC giúp thực hiện dự án một cách dể dàng và nhanh chóng, trong lúc HTML designer thiết kế giao diện ở tần view thì hai lập trình viên còn lại sẻ đảm nhận logic ở tầng controller và các tác vụ ở tầng model.
  
### 2. Tìm hiểu ASP.NET
#### 2.1. ASP.NET là gì?
ASP. NET là một mã nguồn mở dành cho web được tạo bởi Microsoft. Hiện mã nguồn này chạy trên nền tảng Windows và được bắt đầu vào đầu những năm 2000. 
ASP.NET cho phép các nhà phát triển tạo các ứng dụng web, dịch vụ web và các trang web động.
ASP.NET được biên dịch dưới dạng Common Language Runtime (CLR), có khả năng hỗ trợ các lập trình viên viết mã ASP.NET với bất kỳ ngôn ngữ nào được hỗ trợ bởi.NET language, ví dụ: C#, VB.Net và J#,… Tiếp theo, phần dưới đây sẽ giúp bạn hiểu rõ hơn ASP.NET là gì qua các lịch sử, cấu trúc của ASP.NET.
#### 2.2. ASP.NET core là gì?
ASP.NET Core là một phiên bản mới của ASP.NET chạy trên mọi nền tảng mọi máy tính, bao gồm Windows, MacOS và Linux. Giống như ASP.NET, nó là mã nguồn mở, được tạo bởi Microsoft. Mã nguồn cho phép các nhà phát triển tạo app, dịch vụ web và các trang web động.
### 2.3. Cấu trúc và những thành phần của ASP.NET
Dưới đây là những phân tích về cấu trúc thành phần của ASP.NET là gì, nó bao gồm những yếu tố: Ngôn ngữ, thư viện và thời gian chạy CLR. 
- Language/Ngôn ngữ: Là tập con của .NET Framework, tại đây có rất nhiều ngôn ngữ lập trình khác nhau phải kể đến như C#, VB.net, PHP, JavaScript,… Trong đó C# và VB.net được sử dụng phổ biến nhất trong ứng dụng phát triển ứng dụng web. 
- Library/Thư viện: .ASP. NET Framework gồm có một bộ các lớp library chuẩn. Web library là thư viện được dùng phổ biến nhất cho các ứng dụng web. Web library bao gồm tất cả các thành phần cần thiết sử dụng trong phát triển các ứng dụng web-based.
- Common Language Runtime/Thời gian chạy CLR: CLR là một trong các cơ sở hạ tầng của phần đông các kiểu ngôn ngữ lập trình phổ thông. Trong đó, CLR thực hiện các tác vụ chính để xử lý các trường hợp đặc biệt và thu gom rác.
