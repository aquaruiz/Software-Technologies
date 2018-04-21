using Microsoft.AspNetCore.Identity.EntityFrameworkCore;

namespace BookLibrary.Models
{
    using Microsoft.EntityFrameworkCore;

    public class ApplicationDbContext : IdentityDbContext<ApplicationUser>
    {
        public DbSet<Book> Books { get; set; }

        public ApplicationDbContext()
        {
            this.Database.EnsureCreated();
            //this.Database.EnsureCreated();
        }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseMySQL("server=localhost;database=library;SslMode=none;user = root;");
        }

        //protected override void OnModelCreating(ModelBuilder builder)
        //{
        //    base.OnModelCreating(builder);
        //    //Customize the ASP.NET Identity model and override the defaults if needed.
        //    //For example, you can rename the ASP.NET Identity table names and more.
        //    //Add your customizations after calling base.OnModelCreating(builder);
        //}
    }
}

