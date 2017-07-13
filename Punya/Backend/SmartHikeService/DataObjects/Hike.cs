using Microsoft.Azure.Mobile.Server;

namespace SmartHikeService.DataObjects
{
    public class Hike : EntityData
    {
        public string hike_name { get; set;  }

        public string hike_description { get; set; }

        public string hike_destination { get; set; }
    }
}