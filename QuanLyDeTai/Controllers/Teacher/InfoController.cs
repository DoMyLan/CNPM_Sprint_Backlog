using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using QuanLyDeTai.Models;

namespace QuanLyDeTai.Controllers.Teacher
{
    public class InfoController : Controller
    {
        
        // GET: Info
        // Lấy ra thông tin của giáo viên
        public ActionResult Index(string id)
        {
            QuanLyDeTaiEntities db = new QuanLyDeTaiEntities();
            Models.Teacher teacher = db.Teachers.Where(row => row.teacherId == id).FirstOrDefault();
            return View();
        }

        // Chỉnh sửa thông tin giáo viên
        public ActionResult Update(Models.Teacher data)
        {
            QuanLyDeTaiEntities db = new QuanLyDeTaiEntities();
            Models.Teacher teacher  = db.Teachers.Where(row => row.teacherId == data.teacherId).FirstOrDefault();

            if (data.teacherName != string.Empty)
                teacher.teacherName = data.teacherName;
            if (data.email != string.Empty)
                teacher.email = data.email;
            if (data.phone != string.Empty)
                teacher.phone = data.phone;
            if (data.degree != string.Empty)
                teacher.degree = data.degree;
            teacher.lead = data.lead;
            teacher.gender = data.gender;
            teacher.birth = data.birth;
            db.SaveChanges();
            return View();
        }
        public ActionResult Delete(string id)
        {
            QuanLyDeTaiEntities db = new QuanLyDeTaiEntities();
            Models.Teacher teacher = db.Teachers.Where(row => row.teacherId == id).FirstOrDefault();
            db.Teachers.Remove(teacher);
            db.SaveChanges();
            return View();
        }
    }
}