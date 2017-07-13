using System.Linq;
using System.Threading.Tasks;
using System.Web.Http;
using System.Web.Http.Controllers;
using System.Web.Http.OData;
using Microsoft.Azure.Mobile.Server;
using SmartHikeService.DataObjects;
using SmartHikeService.Models;

namespace SmartHikeService.Controllers
{
    public class HikeController : TableController<Hike>
    {
        protected override void Initialize(HttpControllerContext controllerContext)
        {
            base.Initialize(controllerContext);
            SmartHikeContext context = new SmartHikeContext();
            DomainManager = new EntityDomainManager<Hike>(context, Request);
        }

        // GET tables/Hike
        public IQueryable<Hike> GetAllHike()
        {
            return Query(); 
        }

        // GET tables/Hike/48D68C86-6EA6-4C25-AA33-223FC9A27959
        public SingleResult<Hike> GetHike(string id)
        {
            return Lookup(id);
        }

        // PATCH tables/Hike/48D68C86-6EA6-4C25-AA33-223FC9A27959
        public Task<Hike> PatchHike(string id, Delta<Hike> patch)
        {
             return UpdateAsync(id, patch);
        }

        // POST tables/Hike
        public async Task<IHttpActionResult> PostHike(Hike item)
        {
            Hike current = await InsertAsync(item);
            return CreatedAtRoute("Tables", new { id = current.Id }, current);
        }

        // DELETE tables/Hike/48D68C86-6EA6-4C25-AA33-223FC9A27959
        public Task DeleteHike(string id)
        {
             return DeleteAsync(id);
        }
    }
}
