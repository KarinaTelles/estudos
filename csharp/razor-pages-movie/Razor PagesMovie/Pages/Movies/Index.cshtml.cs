using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.EntityFrameworkCore;
using Razor_PagesMovie.Data;
using Razor_PagesMovie.Modelos;

namespace Razor_PagesMovie.Pages.Movies
{
    public class IndexModel : PageModel
    {
        private readonly Razor_PagesMovie.Data.Razor_PagesMovieContext _context;

        public IndexModel(Razor_PagesMovie.Data.Razor_PagesMovieContext context)
        {
            _context = context;
        }

        public IList<Movie> Movie { get;set; }

        public async Task OnGetAsync()
        {
            Movie = await _context.Movie.ToListAsync();
        }
    }
}
