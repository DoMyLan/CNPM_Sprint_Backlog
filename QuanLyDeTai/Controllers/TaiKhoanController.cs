using QuanLyDeTai.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace QuanLyDeTai.Controllers
{
    public class TaiKhoanController : Controller
    {
        // GET: TaiKhoan
        public ActionResult DangNhap()
        {
            return View();
        }
        [HttpPost]
        public ActionResult DangNhap(string TenDangNhap, string MatKhau)
        {
            //1. Kiểm tra nếu chưa nhập đầy đủ tên đăng nhập và password
            if (string.IsNullOrEmpty(TenDangNhap) == true || string.IsNullOrEmpty(MatKhau) == true)
            {
                ViewBag.thongbao = "Chưa nhập đầy đủ thông tin";
                return View();
            }
            //2. Tìm tài khoản trong database
            var taiKhoan = new mapTaiKhoan().ChiTiet(TenDangNhap);
            //3.Kiểm tra tồn tại tài khoản
            if (taiKhoan == null)
            {
                ViewBag.thongbao = "Không tồn tại tài khoản";
                ViewBag.TenDangNhap = TenDangNhap;
                return View();
            }
            //4. Kiểm tra mật khẩu
            if (taiKhoan.password != MatKhau)
            {
                ViewBag.thongbao = "Tài khoản hoặc mật khẩu không đúng";
                ViewBag.TenDangNhap = TenDangNhap;
                return View();
            }
            //5.Đăng nhập thành công
            Session["user"] = taiKhoan;
            //chuyển hướng
            return RedirectToAction();
        }
    }
}