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
    public class RouteController : TableController<Route>
    {
        protected override void Initialize(HttpControllerContext controllerContext)
        {
            base.Initialize(controllerContext);
            SmartHikeContext context = new SmartHikeContext();
            DomainManager = new EntityDomainManager<Route>(context, Request);
        }

        // GET tables/Route
        public IQueryable<Route> GetAllRoute()
        {
            return Query(); 
        }

        // GET tables/Route/48D68C86-6EA6-4C25-AA33-223FC9A27959
        public SingleResult<Route> GetRoute(string id)
        {
            return Lookup(id);
        }

        // PATCH tables/Route/48D68C86-6EA6-4C25-AA33-223FC9A27959
        public Task<Route> PatchRoute(string id, Delta<Route> patch)
        {
             return UpdateAsync(id, patch);
        }

        // POST tables/Route
        public async Task<IHttpActionResult> PostRoute(Route item)
        {
            Route current = await InsertAsync(item);
            return CreatedAtRoute("Tables", new { id = current.Id }, current);
        }

        // DELETE tables/Route/48D68C86-6EA6-4C25-AA33-223FC9A27959
        public Task DeleteRoute(string id)
        {
             return DeleteAsync(id);
        }
    }
}
