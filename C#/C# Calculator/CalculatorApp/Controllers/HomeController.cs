using CalculatorApp.Models;
using Microsoft.AspNetCore.Mvc;
using System;

namespace CalculatorApp.Controllers
{
    public class HomeController : Controller
    {
        public ActionResult Index(Calculator calculator)
        {
            return View(calculator);
        }

        [HttpPost]
        public IActionResult Calculate(Calculator calculator)
        {
            calculator.CalculateResult();

            return RedirectToAction("Index", calculator);
        }

    }
}
