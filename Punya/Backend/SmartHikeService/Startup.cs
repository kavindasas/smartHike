using Microsoft.Owin;
using Owin;

[assembly: OwinStartup(typeof(SmartHikeService.Startup))]

namespace SmartHikeService
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureMobileApp(app);
        }
    }
}