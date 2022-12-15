using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace QuanLyDeTai.Models
{
    public class mapTaiKhoan
    {
        public login ChiTiet(string tenDangNhap)
        {
            try
            {
                QuanLyDeTaiEntities db = new QuanLyDeTaiEntities();
                var model = db.logins.SingleOrDefault(m => m.username == tenDangNhap.ToLower());
                return model;
            }
            catch
            {
                return null;
            }
        }
    }
}