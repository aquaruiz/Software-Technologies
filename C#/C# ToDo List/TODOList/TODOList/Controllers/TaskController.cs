using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using TODOList.Models;
using Microsoft.AspNetCore.Mvc;

namespace TODOList.Controllers
{
    public class TaskController : Controller
    {
        private readonly TaskDbContext context;

        public TaskController(TaskDbContext context)
        {
            this.context = context;
        }

        [HttpPost]
        public IActionResult Create(Models.Task task)
        {
            if(task == null)
            {
                return RedirectToAction("Index", "Home");
            }

            using (var db = new TaskDbContext())
            {
                db.Tasks.Add(task);
                db.SaveChanges();
            }

            return RedirectToAction("Index", "Home");
        }

        [HttpGet]
        public ActionResult Delete(int? id)
        {
            if(id == null)
            {
                return RedirectToAction("Index", "Home");
            }

            using (var db = new TaskDbContext())
            {
                var task = db.Tasks.Find(id);
                if(task == null)
                {
                    return RedirectToAction("Index", "Home");
                }

                db.Tasks.Remove(task);
                db.SaveChanges();
            }

            return RedirectToAction("Index", "Home");
        }

        [HttpGet]
        public IActionResult Edit(int id, Models.Task taskModel)
        {
            var task = context.Tasks.Find(id);
            return View(task);
        }

        [HttpPost]
        [ValidateAntiForgeryToken]
        public IActionResult Edit(Models.Task task)
        {
            this.context.Tasks.Update(task);
            this.context.SaveChanges();
            return Redirect("/");
        }

        [HttpGet]
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return RedirectToAction("Index", "Home");
            }

            var task = context.Tasks.Find(id);
            return View(task);
        }
    }
}