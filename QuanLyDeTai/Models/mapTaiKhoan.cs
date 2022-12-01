using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace QuanLyDeTai.Models
{
    public class mapTaiKhoan
    {
        public LOGIN ChiTiet(string TenDangNhap)
        {
            try
            {
                QuanLyDeTaiEntities db = new QuanLyDeTaiEntities();
                var model = db.LOGINs.SingleOrDefault(m => m.username == TenDangNhap.ToLower());
                return model;
            }
            catch
            {
                return null;
            }

        }
    }
}