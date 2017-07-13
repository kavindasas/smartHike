using Microsoft.Azure.Mobile.Server;

namespace SmartHikeService.DataObjects
{
    public class Route : EntityData
    {
        public string route_start_point { get; set; }

        public string route_name { get; set; }

        public string route_description { get; set; }
    }
}