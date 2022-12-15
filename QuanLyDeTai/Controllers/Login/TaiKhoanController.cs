using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using QuanLyDeTai.Models;

namespace QuanLyDeTai.Areas.Admin.Controllers
{
    public class TaiKhoanController : Controller
    {
        public ActionResult DangNhap()
        {
            return View();
        }
        public ActionResult DangNhap(string tenDangNhap, string matKhau)
        {
            if (string.IsNullOrEmpty(tenDangNhap) == true || string.IsNullOrEmpty(matKhau) == true)
            {
                ViewBag.thongbao = "Chưa nhập đầy đủ thông tin";
                return View();
            }
            //2. Tìm tài khoản trong database
            var taiKhoan = new mapTaiKhoan().ChiTiet(tenDangNhap);
            //3.Kiểm tra tồn tại tài khoản
            if (taiKhoan == null)
            {
                ViewBag.thongbao = "Không tồn tại tài khoản";
                ViewBag.TenDangNhap = tenDangNhap;
                return View();
            }
            //4. Kiểm tra mật khẩu
            if (taiKhoan.password != matKhau)
            {
                ViewBag.thongbao = "Tài khoản hoặc mật khẩu không đúng";
                ViewBag.TenDangNhap = tenDangNhap;
                return View();
            }
            //5.Đăng nhập thành công
            Session["user"] = taiKhoan;
            //chuyển hướng
            return Redirect("/HomeAdmin/homeadmin");
        }

    }
}