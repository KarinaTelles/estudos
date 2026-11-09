using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using Razor_PagesMovie.Modelos;

namespace Razor_PagesMovie.Data
{
    public class Razor_PagesMovieContext : DbContext
    {
        public Razor_PagesMovieContext (DbContextOptions<Razor_PagesMovieContext> options)
            : base(options)
        {
        }

        public DbSet<Razor_PagesMovie.Modelos.Movie> Movie { get; set; }
    }
}
