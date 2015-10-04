package com.y29.appexperiments.data.model;

import java.util.List;

/**
 * Created by ANI on 03-10-2015.
 */
public class Movie {
    /**
     * status : ok
     * status_message : Query was successful
     * data : {"movie_count":4497,"limit":20,"page_number":1,"movies":[{"id":4530,"url":"https://yts.to/movie/narcopolis-2015","imdb_code":"tt1957938","title":"Narcopolis","title_long":"Narcopolis (2015)","slug":"narcopolis-2015","year":2015,"rating":4.6,"runtime":96,"genres":["Mystery","Sci-Fi"],"language":"English","mpa_rating":"18","background_image":"https://s.ynet.io/assets/images/movies/narcopolis_2015/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/narcopolis_2015/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/narcopolis_2015/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/6BE9B33D85CB338C4577AEC855DD6A372ABA56BD.torrent","hash":"6BE9B33D85CB338C4577AEC855DD6A372ABA56BD","quality":"1080p","seeds":584,"peers":1433,"size":"1.44 GB","size_bytes":1549135222,"date_uploaded":"2015-10-04 13:23:56","date_uploaded_unix":1443918236}],"date_uploaded":"2015-10-04 13:23:43","date_uploaded_unix":1443918223},{"id":4529,"url":"https://yts.to/movie/presidents-day-2010","imdb_code":"tt1581336","title":"President's Day","title_long":"President's Day (2010)","slug":"presidents-day-2010","year":2010,"rating":5.9,"runtime":80,"genres":["Comedy","Horror"],"language":"English","mpa_rating":"18","background_image":"https://s.ynet.io/assets/images/movies/presidents_day_2010/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/presidents_day_2010/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/presidents_day_2010/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/68A7B57E38F1323CA6A1B36619FAA9AB690250FB.torrent","hash":"68A7B57E38F1323CA6A1B36619FAA9AB690250FB","quality":"720p","seeds":344,"peers":341,"size":"697.25 MB","size_bytes":731121670,"date_uploaded":"2015-10-04 12:15:50","date_uploaded_unix":1443914150},{"url":"https://yts.to/torrent/download/57B7031F2BA81FCBA6F6A248A59FCD40B639337C.torrent","hash":"57B7031F2BA81FCBA6F6A248A59FCD40B639337C","quality":"1080p","seeds":71,"peers":259,"size":"1.24 GB","size_bytes":1329419979,"date_uploaded":"2015-10-04 16:10:04","date_uploaded_unix":1443928204}],"date_uploaded":"2015-10-04 12:15:47","date_uploaded_unix":1443914147},{"id":4528,"url":"https://yts.to/movie/the-search-for-freedom-2015","imdb_code":"tt4943594","title":"The Search for Freedom","title_long":"The Search for Freedom (2015)","slug":"the-search-for-freedom-2015","year":2015,"rating":6.5,"runtime":92,"genres":["Documentary"],"language":"N/A","mpa_rating":"Unknown","background_image":"https://s.ynet.io/assets/images/movies/the_search_for_freedom_2015/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/the_search_for_freedom_2015/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/the_search_for_freedom_2015/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/1EACA54D8CC3DB59420D618C89B962F7FBFB276A.torrent","hash":"1EACA54D8CC3DB59420D618C89B962F7FBFB276A","quality":"720p","seeds":1109,"peers":877,"size":"749.07 MB","size_bytes":785461660,"date_uploaded":"2015-10-04 04:50:52","date_uploaded_unix":1443887452}],"date_uploaded":"2015-10-04 04:50:46","date_uploaded_unix":1443887446},{"id":4527,"url":"https://yts.to/movie/the-gallows-2015","imdb_code":"tt2309260","title":"The Gallows","title_long":"The Gallows (2015)","slug":"the-gallows-2015","year":2015,"rating":4.3,"runtime":81,"genres":["Horror","Thriller"],"language":"English","mpa_rating":"R","background_image":"https://s.ynet.io/assets/images/movies/the_gallows_2015/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/the_gallows_2015/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/the_gallows_2015/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/9434289D5092BCF21DF6A7A0CECB85D72ECF4B5A.torrent","hash":"9434289D5092BCF21DF6A7A0CECB85D72ECF4B5A","quality":"720p","seeds":2095,"peers":1297,"size":"697.22 MB","size_bytes":731083295,"date_uploaded":"2015-10-03 16:30:38","date_uploaded_unix":1443843038},{"url":"https://yts.to/torrent/download/BC2A4805C54D64870A6BCC47C8314300BD1F9C1B.torrent","hash":"BC2A4805C54D64870A6BCC47C8314300BD1F9C1B","quality":"1080p","seeds":1682,"peers":1078,"size":"1.24 GB","size_bytes":1329426755,"date_uploaded":"2015-10-03 19:33:50","date_uploaded_unix":1443854030}],"date_uploaded":"2015-10-03 16:30:25","date_uploaded_unix":1443843025},{"id":4526,"url":"https://yts.to/movie/southpaw-2015","imdb_code":"tt1798684","title":"Southpaw","title_long":"Southpaw (2015)","slug":"southpaw-2015","year":2015,"rating":7.6,"runtime":124,"genres":["Action","Drama"],"language":"English","mpa_rating":"R","background_image":"https://s.ynet.io/assets/images/movies/southpaw_2015/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/southpaw_2015/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/southpaw_2015/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/5DCD101A75D4EA015656CACE713054BF8063F362.torrent","hash":"5DCD101A75D4EA015656CACE713054BF8063F362","quality":"720p","seeds":18132,"peers":14307,"size":"873.20 MB","size_bytes":915617785,"date_uploaded":"2015-10-03 12:30:33","date_uploaded_unix":1443828633},{"url":"https://yts.to/torrent/download/8A8AED41A51E422CFD4300B1C453BB3066E58746.torrent","hash":"8A8AED41A51E422CFD4300B1C453BB3066E58746","quality":"1080p","seeds":8276,"peers":12327,"size":"1.85 GB","size_bytes":1990243111,"date_uploaded":"2015-10-03 17:10:41","date_uploaded_unix":1443845441}],"date_uploaded":"2015-10-03 12:30:20","date_uploaded_unix":1443828620},{"id":4525,"url":"https://yts.to/movie/into-the-grizzly-maze-2015","imdb_code":"tt1694021","title":"Into the Grizzly Maze","title_long":"Into the Grizzly Maze (2015)","slug":"into-the-grizzly-maze-2015","year":2015,"rating":5.3,"runtime":94,"genres":["Action","Horror"],"language":"English","mpa_rating":"R","background_image":"https://s.ynet.io/assets/images/movies/into_the_grizzly_maze_2015/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/into_the_grizzly_maze_2015/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/into_the_grizzly_maze_2015/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/8FDA5407ABA998957944685CB41CD6B66694E86A.torrent","hash":"8FDA5407ABA998957944685CB41CD6B66694E86A","quality":"720p","seeds":5568,"peers":2331,"size":"703.52 MB","size_bytes":737696945,"date_uploaded":"2015-10-02 06:34:03","date_uploaded_unix":1443720843}],"date_uploaded":"2015-10-02 06:33:58","date_uploaded_unix":1443720838},{"id":4524,"url":"https://yts.to/movie/my-own-private-idaho-1991","imdb_code":"tt0102494","title":"My Own Private Idaho","title_long":"My Own Private Idaho (1991)","slug":"my-own-private-idaho-1991","year":1991,"rating":7.1,"runtime":104,"genres":["Drama"],"language":"English","mpa_rating":"R","background_image":"https://s.ynet.io/assets/images/movies/my_own_private_idaho_1991/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/my_own_private_idaho_1991/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/my_own_private_idaho_1991/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/BB33D7347695D073C626FC298694D3980EE9F8F7.torrent","hash":"BB33D7347695D073C626FC298694D3980EE9F8F7","quality":"720p","seeds":624,"peers":300,"size":"806.98 MB","size_bytes":846178088,"date_uploaded":"2015-10-02 03:39:37","date_uploaded_unix":1443710377},{"url":"https://yts.to/torrent/download/B89BB90C050CF533E732AE65D589AD3E21F26721.torrent","hash":"B89BB90C050CF533E732AE65D589AD3E21F26721","quality":"1080p","seeds":763,"peers":319,"size":"1.64 GB","size_bytes":1757080824,"date_uploaded":"2015-10-02 04:48:39","date_uploaded_unix":1443714519}],"date_uploaded":"2015-10-02 03:39:28","date_uploaded_unix":1443710368},{"id":4523,"url":"https://yts.to/movie/haunting-of-cellblock-11-2014","imdb_code":"tt2544472","title":"Haunting of Cellblock 11","title_long":"Haunting of Cellblock 11 (2014)","slug":"haunting-of-cellblock-11-2014","year":2014,"rating":4.3,"runtime":85,"genres":["Horror","Thriller"],"language":"English","mpa_rating":"R","background_image":"https://s.ynet.io/assets/images/movies/haunting_of_cellblock_11_2014/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/haunting_of_cellblock_11_2014/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/haunting_of_cellblock_11_2014/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/5025DA3246D55A4F9E9D92786C52024468634B01.torrent","hash":"5025DA3246D55A4F9E9D92786C52024468634B01","quality":"720p","seeds":577,"peers":183,"size":"698.77 MB","size_bytes":732718185,"date_uploaded":"2015-10-02 00:57:07","date_uploaded_unix":1443700627},{"url":"https://yts.to/torrent/download/F9CB6542AF90D7B0647A1B935F0FAB6DDA5B88C8.torrent","hash":"F9CB6542AF90D7B0647A1B935F0FAB6DDA5B88C8","quality":"1080p","seeds":423,"peers":202,"size":"1.24 GB","size_bytes":1328513219,"date_uploaded":"2015-10-02 23:22:29","date_uploaded_unix":1443781349}],"date_uploaded":"2015-10-02 00:57:01","date_uploaded_unix":1443700621},{"id":4522,"url":"https://yts.to/movie/the-nail-gun-massacre-1985","imdb_code":"tt0089665","title":"The Nail Gun Massacre","title_long":"The Nail Gun Massacre (1985)","slug":"the-nail-gun-massacre-1985","year":1985,"rating":4,"runtime":85,"genres":["Horror","Thriller"],"language":"English","mpa_rating":"Not Rated","background_image":"https://s.ynet.io/assets/images/movies/the_nail_gun_massacre_1985/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/the_nail_gun_massacre_1985/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/the_nail_gun_massacre_1985/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/97D527054A5D6E5D5D5FBF56C198626FD8F41863.torrent","hash":"97D527054A5D6E5D5D5FBF56C198626FD8F41863","quality":"720p","seeds":114,"peers":56,"size":"697.97 MB","size_bytes":731872419,"date_uploaded":"2015-10-01 20:11:30","date_uploaded_unix":1443683490},{"url":"https://yts.to/torrent/download/DFFCFDA9A26479394EB1845409B3079DDC15D62C.torrent","hash":"DFFCFDA9A26479394EB1845409B3079DDC15D62C","quality":"1080p","seeds":120,"peers":57,"size":"1.24 GB","size_bytes":1327717752,"date_uploaded":"2015-10-02 03:45:07","date_uploaded_unix":1443710707}],"date_uploaded":"2015-10-01 20:11:29","date_uploaded_unix":1443683489},{"id":4521,"url":"https://yts.to/movie/beyond-the-mask-2015","imdb_code":"tt2433040","title":"Beyond the Mask","title_long":"Beyond the Mask (2015)","slug":"beyond-the-mask-2015","year":2015,"rating":5.5,"runtime":103,"genres":["Action","Drama"],"language":"English","mpa_rating":"PG","background_image":"https://s.ynet.io/assets/images/movies/beyond_the_mask_2015/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/beyond_the_mask_2015/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/beyond_the_mask_2015/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/70819F7DE81A683C4D7C1F86D78AB08E4C460467.torrent","hash":"70819F7DE81A683C4D7C1F86D78AB08E4C460467","quality":"720p","seeds":6358,"peers":3156,"size":"811.72 MB","size_bytes":851153304,"date_uploaded":"2015-10-01 18:13:25","date_uploaded_unix":1443676405}],"date_uploaded":"2015-10-01 18:13:12","date_uploaded_unix":1443676392},{"id":4520,"url":"https://yts.to/movie/night-and-the-city-1950","imdb_code":"tt0042788","title":"Night and the City","title_long":"Night and the City (1950)","slug":"night-and-the-city-1950","year":1950,"rating":8,"runtime":96,"genres":["Crime","Film-Noir"],"language":"English","mpa_rating":"Approved","background_image":"https://s.ynet.io/assets/images/movies/night_and_the_city_1950/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/night_and_the_city_1950/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/night_and_the_city_1950/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/52AF412F75CF61D174CD16985D35F78BB466FE81.torrent","hash":"52AF412F75CF61D174CD16985D35F78BB466FE81","quality":"1080p","seeds":260,"peers":132,"size":"1.45 GB","size_bytes":1555155466,"date_uploaded":"2015-10-01 09:43:34","date_uploaded_unix":1443645814}],"date_uploaded":"2015-10-01 09:43:24","date_uploaded_unix":1443645804},{"id":4519,"url":"https://yts.to/movie/where-the-sidewalk-ends-1950","imdb_code":"tt0043132","title":"Where the Sidewalk Ends","title_long":"Where the Sidewalk Ends (1950)","slug":"where-the-sidewalk-ends-1950","year":1950,"rating":7.7,"runtime":95,"genres":["Crime","Film-Noir"],"language":"English","mpa_rating":"Not Rated","background_image":"https://s.ynet.io/assets/images/movies/where_the_sidewalk_ends_1950/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/where_the_sidewalk_ends_1950/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/where_the_sidewalk_ends_1950/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/7EB34B4F47B055CDAD57425A77C2A4C927AF865F.torrent","hash":"7EB34B4F47B055CDAD57425A77C2A4C927AF865F","quality":"720p","seeds":115,"peers":49,"size":"756.35 MB","size_bytes":793091317,"date_uploaded":"2015-10-01 05:14:59","date_uploaded_unix":1443629699},{"url":"https://yts.to/torrent/download/E5FED09D984DA5AD4BBA175B23DB2F459554ABF5.torrent","hash":"E5FED09D984DA5AD4BBA175B23DB2F459554ABF5","quality":"1080p","seeds":177,"peers":61,"size":"1.44 GB","size_bytes":1550360306,"date_uploaded":"2015-10-01 06:40:04","date_uploaded_unix":1443634804}],"date_uploaded":"2015-10-01 05:14:56","date_uploaded_unix":1443629696},{"id":4518,"url":"https://yts.to/movie/the-stranger-2014","imdb_code":"tt2238470","title":"The Stranger","title_long":"The Stranger (2014)","slug":"the-stranger-2014","year":2014,"rating":4.9,"runtime":93,"genres":["Drama","Horror"],"language":"English","mpa_rating":"Not Rated","background_image":"https://s.ynet.io/assets/images/movies/the_stranger_2014/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/the_stranger_2014/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/the_stranger_2014/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/D1D1A794992B4280A93F8A73E88B40B29136C089.torrent","hash":"D1D1A794992B4280A93F8A73E88B40B29136C089","quality":"1080p","seeds":720,"peers":402,"size":"1.44 GB","size_bytes":1548861240,"date_uploaded":"2015-10-01 02:51:38","date_uploaded_unix":1443621098}],"date_uploaded":"2015-10-01 02:51:23","date_uploaded_unix":1443621083},{"id":4517,"url":"https://yts.to/movie/mr-blue-sky-the-story-of-jeff-lynne-elo-2012","imdb_code":"tt2440214","title":"Mr Blue Sky: The Story of Jeff Lynne & ELO","title_long":"Mr Blue Sky: The Story of Jeff Lynne & ELO (2012)","slug":"mr-blue-sky-the-story-of-jeff-lynne-elo-2012","year":2012,"rating":8.1,"runtime":60,"genres":["Documentary","Music"],"language":"English","mpa_rating":"Unknown","background_image":"https://s.ynet.io/assets/images/movies/mr_blue_sky_the_story_of_jeff_lynne_elo_2012/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/mr_blue_sky_the_story_of_jeff_lynne_elo_2012/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/mr_blue_sky_the_story_of_jeff_lynne_elo_2012/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/32B90BFD4385DF171557B4ACA27E1023E5DD0CC3.torrent","hash":"32B90BFD4385DF171557B4ACA27E1023E5DD0CC3","quality":"720p","seeds":598,"peers":128,"size":"691.62 MB","size_bytes":725211154,"date_uploaded":"2015-10-01 00:57:37","date_uploaded_unix":1443614257}],"date_uploaded":"2015-10-01 00:57:35","date_uploaded_unix":1443614255},{"id":4516,"url":"https://yts.to/movie/4got10-2015","imdb_code":"tt4510398","title":"4Got10","title_long":"4Got10 (2015)","slug":"4got10-2015","year":2015,"rating":6.9,"runtime":84,"genres":["Action","Thriller"],"language":"English","mpa_rating":"18","background_image":"https://s.ynet.io/assets/images/movies/4got10_2015/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/4got10_2015/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/4got10_2015/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/4E33A72414B6E4B79853995ED91C960542B115D9.torrent","hash":"4E33A72414B6E4B79853995ED91C960542B115D9","quality":"1080p","seeds":7565,"peers":3795,"size":"1.23 GB","size_bytes":1322189494,"date_uploaded":"2015-09-30 23:45:24","date_uploaded_unix":1443609924}],"date_uploaded":"2015-09-30 22:45:18","date_uploaded_unix":1443606318},{"id":4515,"url":"https://yts.to/movie/whirlpool-1949","imdb_code":"tt0042039","title":"Whirlpool","title_long":"Whirlpool (1949)","slug":"whirlpool-1949","year":1949,"rating":6.9,"runtime":98,"genres":["Crime","Drama"],"language":"English","mpa_rating":"Approved","background_image":"https://s.ynet.io/assets/images/movies/whirlpool_1949/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/whirlpool_1949/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/whirlpool_1949/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/D573BA60A3D9D35306E0DB1618CDC26FDBFD3224.torrent","hash":"D573BA60A3D9D35306E0DB1618CDC26FDBFD3224","quality":"1080p","seeds":121,"peers":71,"size":"1.44 GB","size_bytes":1543716222,"date_uploaded":"2015-09-30 17:51:22","date_uploaded_unix":1443588682}],"date_uploaded":"2015-09-30 17:51:17","date_uploaded_unix":1443588677},{"id":4514,"url":"https://yts.to/movie/catch-me-daddy-2014","imdb_code":"tt2626964","title":"Catch Me Daddy","title_long":"Catch Me Daddy (2014)","slug":"catch-me-daddy-2014","year":2014,"rating":6.7,"runtime":112,"genres":["Thriller"],"language":"English","mpa_rating":"15","background_image":"https://s.ynet.io/assets/images/movies/catch_me_daddy_2014/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/catch_me_daddy_2014/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/catch_me_daddy_2014/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/256AF43E601BE757F96BD0C1DC7483FD1BDD33FC.torrent","hash":"256AF43E601BE757F96BD0C1DC7483FD1BDD33FC","quality":"720p","seeds":508,"peers":157,"size":"814.87 MB","size_bytes":854455068,"date_uploaded":"2015-09-30 15:47:41","date_uploaded_unix":1443581261},{"url":"https://yts.to/torrent/download/0A368068C6FB7EC04FDE724CB221BE59E950EFAA.torrent","hash":"0A368068C6FB7EC04FDE724CB221BE59E950EFAA","quality":"1080p","seeds":343,"peers":139,"size":"1.65 GB","size_bytes":1768107499,"date_uploaded":"2015-10-01 04:16:09","date_uploaded_unix":1443626169}],"date_uploaded":"2015-09-30 15:47:40","date_uploaded_unix":1443581260},{"id":4513,"url":"https://yts.to/movie/the-little-girl-who-lives-down-the-lane-1976","imdb_code":"tt0074806","title":"The Little Girl Who Lives Down the Lane","title_long":"The Little Girl Who Lives Down the Lane (1976)","slug":"the-little-girl-who-lives-down-the-lane-1976","year":1976,"rating":7.1,"runtime":91,"genres":["Drama","Mystery"],"language":"English","mpa_rating":"PG","background_image":"https://s.ynet.io/assets/images/movies/the_little_girl_who_lives_down_the_lane_1976/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/the_little_girl_who_lives_down_the_lane_1976/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/the_little_girl_who_lives_down_the_lane_1976/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/086DDD46A667C25C723B434366B82684FFC96F48.torrent","hash":"086DDD46A667C25C723B434366B82684FFC96F48","quality":"720p","seeds":242,"peers":86,"size":"754.91 MB","size_bytes":791584909,"date_uploaded":"2015-09-30 13:20:28","date_uploaded_unix":1443572428},{"url":"https://yts.to/torrent/download/937911745A8FAB1859ACE7B3D1259FB62045F118.torrent","hash":"937911745A8FAB1859ACE7B3D1259FB62045F118","quality":"1080p","seeds":239,"peers":99,"size":"1.44 GB","size_bytes":1550021898,"date_uploaded":"2015-09-30 15:11:07","date_uploaded_unix":1443579067}],"date_uploaded":"2015-09-30 13:20:22","date_uploaded_unix":1443572422},{"id":4512,"url":"https://yts.to/movie/for-love-or-money-1993","imdb_code":"tt0106941","title":"For Love or Money","title_long":"For Love or Money (1993)","slug":"for-love-or-money-1993","year":1993,"rating":6.1,"runtime":96,"genres":["Comedy","Drama"],"language":"English","mpa_rating":"PG","background_image":"https://s.ynet.io/assets/images/movies/for_love_or_money_1993/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/for_love_or_money_1993/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/for_love_or_money_1993/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/C676DC8DE980B5BF6D5312D7FF173912C0282851.torrent","hash":"C676DC8DE980B5BF6D5312D7FF173912C0282851","quality":"720p","seeds":531,"peers":185,"size":"751.15 MB","size_bytes":787641717,"date_uploaded":"2015-09-30 02:11:03","date_uploaded_unix":1443532263}],"date_uploaded":"2015-09-30 02:10:58","date_uploaded_unix":1443532258},{"id":4511,"url":"https://yts.to/movie/the-neanderthal-man-1953","imdb_code":"tt0046121","title":"The Neanderthal Man","title_long":"The Neanderthal Man (1953)","slug":"the-neanderthal-man-1953","year":1953,"rating":4.6,"runtime":78,"genres":["Horror","Sci-Fi"],"language":"English","mpa_rating":"Not Rated","background_image":"https://s.ynet.io/assets/images/movies/the_neanderthal_man_1953/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/the_neanderthal_man_1953/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/the_neanderthal_man_1953/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/56510CA4AA92E6F17EE6DDD4298A77032A09C39A.torrent","hash":"56510CA4AA92E6F17EE6DDD4298A77032A09C39A","quality":"720p","seeds":77,"peers":24,"size":"689.90 MB","size_bytes":723415904,"date_uploaded":"2015-09-29 15:12:49","date_uploaded_unix":1443492769}],"date_uploaded":"2015-09-29 15:12:11","date_uploaded_unix":1443492731}]}
     * @meta : {"server_time":1443932732,"server_timezone":"Pacific/Auckland","api_version":2,"execution_time":"55.56 ms"}
     */

    private String status;
    private String status_message;
    private DataEntity data;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStatus_message(String status_message) {
        this.status_message = status_message;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public String getStatus_message() {
        return status_message;
    }

    public DataEntity getData() {
        return data;
    }

    public static class DataEntity {
        /**
         * movie_count : 4497
         * limit : 20
         * page_number : 1
         * movies : [{"id":4530,"url":"https://yts.to/movie/narcopolis-2015","imdb_code":"tt1957938","title":"Narcopolis","title_long":"Narcopolis (2015)","slug":"narcopolis-2015","year":2015,"rating":4.6,"runtime":96,"genres":["Mystery","Sci-Fi"],"language":"English","mpa_rating":"18","background_image":"https://s.ynet.io/assets/images/movies/narcopolis_2015/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/narcopolis_2015/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/narcopolis_2015/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/6BE9B33D85CB338C4577AEC855DD6A372ABA56BD.torrent","hash":"6BE9B33D85CB338C4577AEC855DD6A372ABA56BD","quality":"1080p","seeds":584,"peers":1433,"size":"1.44 GB","size_bytes":1549135222,"date_uploaded":"2015-10-04 13:23:56","date_uploaded_unix":1443918236}],"date_uploaded":"2015-10-04 13:23:43","date_uploaded_unix":1443918223},{"id":4529,"url":"https://yts.to/movie/presidents-day-2010","imdb_code":"tt1581336","title":"President's Day","title_long":"President's Day (2010)","slug":"presidents-day-2010","year":2010,"rating":5.9,"runtime":80,"genres":["Comedy","Horror"],"language":"English","mpa_rating":"18","background_image":"https://s.ynet.io/assets/images/movies/presidents_day_2010/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/presidents_day_2010/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/presidents_day_2010/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/68A7B57E38F1323CA6A1B36619FAA9AB690250FB.torrent","hash":"68A7B57E38F1323CA6A1B36619FAA9AB690250FB","quality":"720p","seeds":344,"peers":341,"size":"697.25 MB","size_bytes":731121670,"date_uploaded":"2015-10-04 12:15:50","date_uploaded_unix":1443914150},{"url":"https://yts.to/torrent/download/57B7031F2BA81FCBA6F6A248A59FCD40B639337C.torrent","hash":"57B7031F2BA81FCBA6F6A248A59FCD40B639337C","quality":"1080p","seeds":71,"peers":259,"size":"1.24 GB","size_bytes":1329419979,"date_uploaded":"2015-10-04 16:10:04","date_uploaded_unix":1443928204}],"date_uploaded":"2015-10-04 12:15:47","date_uploaded_unix":1443914147},{"id":4528,"url":"https://yts.to/movie/the-search-for-freedom-2015","imdb_code":"tt4943594","title":"The Search for Freedom","title_long":"The Search for Freedom (2015)","slug":"the-search-for-freedom-2015","year":2015,"rating":6.5,"runtime":92,"genres":["Documentary"],"language":"N/A","mpa_rating":"Unknown","background_image":"https://s.ynet.io/assets/images/movies/the_search_for_freedom_2015/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/the_search_for_freedom_2015/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/the_search_for_freedom_2015/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/1EACA54D8CC3DB59420D618C89B962F7FBFB276A.torrent","hash":"1EACA54D8CC3DB59420D618C89B962F7FBFB276A","quality":"720p","seeds":1109,"peers":877,"size":"749.07 MB","size_bytes":785461660,"date_uploaded":"2015-10-04 04:50:52","date_uploaded_unix":1443887452}],"date_uploaded":"2015-10-04 04:50:46","date_uploaded_unix":1443887446},{"id":4527,"url":"https://yts.to/movie/the-gallows-2015","imdb_code":"tt2309260","title":"The Gallows","title_long":"The Gallows (2015)","slug":"the-gallows-2015","year":2015,"rating":4.3,"runtime":81,"genres":["Horror","Thriller"],"language":"English","mpa_rating":"R","background_image":"https://s.ynet.io/assets/images/movies/the_gallows_2015/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/the_gallows_2015/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/the_gallows_2015/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/9434289D5092BCF21DF6A7A0CECB85D72ECF4B5A.torrent","hash":"9434289D5092BCF21DF6A7A0CECB85D72ECF4B5A","quality":"720p","seeds":2095,"peers":1297,"size":"697.22 MB","size_bytes":731083295,"date_uploaded":"2015-10-03 16:30:38","date_uploaded_unix":1443843038},{"url":"https://yts.to/torrent/download/BC2A4805C54D64870A6BCC47C8314300BD1F9C1B.torrent","hash":"BC2A4805C54D64870A6BCC47C8314300BD1F9C1B","quality":"1080p","seeds":1682,"peers":1078,"size":"1.24 GB","size_bytes":1329426755,"date_uploaded":"2015-10-03 19:33:50","date_uploaded_unix":1443854030}],"date_uploaded":"2015-10-03 16:30:25","date_uploaded_unix":1443843025},{"id":4526,"url":"https://yts.to/movie/southpaw-2015","imdb_code":"tt1798684","title":"Southpaw","title_long":"Southpaw (2015)","slug":"southpaw-2015","year":2015,"rating":7.6,"runtime":124,"genres":["Action","Drama"],"language":"English","mpa_rating":"R","background_image":"https://s.ynet.io/assets/images/movies/southpaw_2015/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/southpaw_2015/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/southpaw_2015/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/5DCD101A75D4EA015656CACE713054BF8063F362.torrent","hash":"5DCD101A75D4EA015656CACE713054BF8063F362","quality":"720p","seeds":18132,"peers":14307,"size":"873.20 MB","size_bytes":915617785,"date_uploaded":"2015-10-03 12:30:33","date_uploaded_unix":1443828633},{"url":"https://yts.to/torrent/download/8A8AED41A51E422CFD4300B1C453BB3066E58746.torrent","hash":"8A8AED41A51E422CFD4300B1C453BB3066E58746","quality":"1080p","seeds":8276,"peers":12327,"size":"1.85 GB","size_bytes":1990243111,"date_uploaded":"2015-10-03 17:10:41","date_uploaded_unix":1443845441}],"date_uploaded":"2015-10-03 12:30:20","date_uploaded_unix":1443828620},{"id":4525,"url":"https://yts.to/movie/into-the-grizzly-maze-2015","imdb_code":"tt1694021","title":"Into the Grizzly Maze","title_long":"Into the Grizzly Maze (2015)","slug":"into-the-grizzly-maze-2015","year":2015,"rating":5.3,"runtime":94,"genres":["Action","Horror"],"language":"English","mpa_rating":"R","background_image":"https://s.ynet.io/assets/images/movies/into_the_grizzly_maze_2015/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/into_the_grizzly_maze_2015/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/into_the_grizzly_maze_2015/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/8FDA5407ABA998957944685CB41CD6B66694E86A.torrent","hash":"8FDA5407ABA998957944685CB41CD6B66694E86A","quality":"720p","seeds":5568,"peers":2331,"size":"703.52 MB","size_bytes":737696945,"date_uploaded":"2015-10-02 06:34:03","date_uploaded_unix":1443720843}],"date_uploaded":"2015-10-02 06:33:58","date_uploaded_unix":1443720838},{"id":4524,"url":"https://yts.to/movie/my-own-private-idaho-1991","imdb_code":"tt0102494","title":"My Own Private Idaho","title_long":"My Own Private Idaho (1991)","slug":"my-own-private-idaho-1991","year":1991,"rating":7.1,"runtime":104,"genres":["Drama"],"language":"English","mpa_rating":"R","background_image":"https://s.ynet.io/assets/images/movies/my_own_private_idaho_1991/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/my_own_private_idaho_1991/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/my_own_private_idaho_1991/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/BB33D7347695D073C626FC298694D3980EE9F8F7.torrent","hash":"BB33D7347695D073C626FC298694D3980EE9F8F7","quality":"720p","seeds":624,"peers":300,"size":"806.98 MB","size_bytes":846178088,"date_uploaded":"2015-10-02 03:39:37","date_uploaded_unix":1443710377},{"url":"https://yts.to/torrent/download/B89BB90C050CF533E732AE65D589AD3E21F26721.torrent","hash":"B89BB90C050CF533E732AE65D589AD3E21F26721","quality":"1080p","seeds":763,"peers":319,"size":"1.64 GB","size_bytes":1757080824,"date_uploaded":"2015-10-02 04:48:39","date_uploaded_unix":1443714519}],"date_uploaded":"2015-10-02 03:39:28","date_uploaded_unix":1443710368},{"id":4523,"url":"https://yts.to/movie/haunting-of-cellblock-11-2014","imdb_code":"tt2544472","title":"Haunting of Cellblock 11","title_long":"Haunting of Cellblock 11 (2014)","slug":"haunting-of-cellblock-11-2014","year":2014,"rating":4.3,"runtime":85,"genres":["Horror","Thriller"],"language":"English","mpa_rating":"R","background_image":"https://s.ynet.io/assets/images/movies/haunting_of_cellblock_11_2014/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/haunting_of_cellblock_11_2014/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/haunting_of_cellblock_11_2014/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/5025DA3246D55A4F9E9D92786C52024468634B01.torrent","hash":"5025DA3246D55A4F9E9D92786C52024468634B01","quality":"720p","seeds":577,"peers":183,"size":"698.77 MB","size_bytes":732718185,"date_uploaded":"2015-10-02 00:57:07","date_uploaded_unix":1443700627},{"url":"https://yts.to/torrent/download/F9CB6542AF90D7B0647A1B935F0FAB6DDA5B88C8.torrent","hash":"F9CB6542AF90D7B0647A1B935F0FAB6DDA5B88C8","quality":"1080p","seeds":423,"peers":202,"size":"1.24 GB","size_bytes":1328513219,"date_uploaded":"2015-10-02 23:22:29","date_uploaded_unix":1443781349}],"date_uploaded":"2015-10-02 00:57:01","date_uploaded_unix":1443700621},{"id":4522,"url":"https://yts.to/movie/the-nail-gun-massacre-1985","imdb_code":"tt0089665","title":"The Nail Gun Massacre","title_long":"The Nail Gun Massacre (1985)","slug":"the-nail-gun-massacre-1985","year":1985,"rating":4,"runtime":85,"genres":["Horror","Thriller"],"language":"English","mpa_rating":"Not Rated","background_image":"https://s.ynet.io/assets/images/movies/the_nail_gun_massacre_1985/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/the_nail_gun_massacre_1985/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/the_nail_gun_massacre_1985/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/97D527054A5D6E5D5D5FBF56C198626FD8F41863.torrent","hash":"97D527054A5D6E5D5D5FBF56C198626FD8F41863","quality":"720p","seeds":114,"peers":56,"size":"697.97 MB","size_bytes":731872419,"date_uploaded":"2015-10-01 20:11:30","date_uploaded_unix":1443683490},{"url":"https://yts.to/torrent/download/DFFCFDA9A26479394EB1845409B3079DDC15D62C.torrent","hash":"DFFCFDA9A26479394EB1845409B3079DDC15D62C","quality":"1080p","seeds":120,"peers":57,"size":"1.24 GB","size_bytes":1327717752,"date_uploaded":"2015-10-02 03:45:07","date_uploaded_unix":1443710707}],"date_uploaded":"2015-10-01 20:11:29","date_uploaded_unix":1443683489},{"id":4521,"url":"https://yts.to/movie/beyond-the-mask-2015","imdb_code":"tt2433040","title":"Beyond the Mask","title_long":"Beyond the Mask (2015)","slug":"beyond-the-mask-2015","year":2015,"rating":5.5,"runtime":103,"genres":["Action","Drama"],"language":"English","mpa_rating":"PG","background_image":"https://s.ynet.io/assets/images/movies/beyond_the_mask_2015/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/beyond_the_mask_2015/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/beyond_the_mask_2015/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/70819F7DE81A683C4D7C1F86D78AB08E4C460467.torrent","hash":"70819F7DE81A683C4D7C1F86D78AB08E4C460467","quality":"720p","seeds":6358,"peers":3156,"size":"811.72 MB","size_bytes":851153304,"date_uploaded":"2015-10-01 18:13:25","date_uploaded_unix":1443676405}],"date_uploaded":"2015-10-01 18:13:12","date_uploaded_unix":1443676392},{"id":4520,"url":"https://yts.to/movie/night-and-the-city-1950","imdb_code":"tt0042788","title":"Night and the City","title_long":"Night and the City (1950)","slug":"night-and-the-city-1950","year":1950,"rating":8,"runtime":96,"genres":["Crime","Film-Noir"],"language":"English","mpa_rating":"Approved","background_image":"https://s.ynet.io/assets/images/movies/night_and_the_city_1950/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/night_and_the_city_1950/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/night_and_the_city_1950/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/52AF412F75CF61D174CD16985D35F78BB466FE81.torrent","hash":"52AF412F75CF61D174CD16985D35F78BB466FE81","quality":"1080p","seeds":260,"peers":132,"size":"1.45 GB","size_bytes":1555155466,"date_uploaded":"2015-10-01 09:43:34","date_uploaded_unix":1443645814}],"date_uploaded":"2015-10-01 09:43:24","date_uploaded_unix":1443645804},{"id":4519,"url":"https://yts.to/movie/where-the-sidewalk-ends-1950","imdb_code":"tt0043132","title":"Where the Sidewalk Ends","title_long":"Where the Sidewalk Ends (1950)","slug":"where-the-sidewalk-ends-1950","year":1950,"rating":7.7,"runtime":95,"genres":["Crime","Film-Noir"],"language":"English","mpa_rating":"Not Rated","background_image":"https://s.ynet.io/assets/images/movies/where_the_sidewalk_ends_1950/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/where_the_sidewalk_ends_1950/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/where_the_sidewalk_ends_1950/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/7EB34B4F47B055CDAD57425A77C2A4C927AF865F.torrent","hash":"7EB34B4F47B055CDAD57425A77C2A4C927AF865F","quality":"720p","seeds":115,"peers":49,"size":"756.35 MB","size_bytes":793091317,"date_uploaded":"2015-10-01 05:14:59","date_uploaded_unix":1443629699},{"url":"https://yts.to/torrent/download/E5FED09D984DA5AD4BBA175B23DB2F459554ABF5.torrent","hash":"E5FED09D984DA5AD4BBA175B23DB2F459554ABF5","quality":"1080p","seeds":177,"peers":61,"size":"1.44 GB","size_bytes":1550360306,"date_uploaded":"2015-10-01 06:40:04","date_uploaded_unix":1443634804}],"date_uploaded":"2015-10-01 05:14:56","date_uploaded_unix":1443629696},{"id":4518,"url":"https://yts.to/movie/the-stranger-2014","imdb_code":"tt2238470","title":"The Stranger","title_long":"The Stranger (2014)","slug":"the-stranger-2014","year":2014,"rating":4.9,"runtime":93,"genres":["Drama","Horror"],"language":"English","mpa_rating":"Not Rated","background_image":"https://s.ynet.io/assets/images/movies/the_stranger_2014/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/the_stranger_2014/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/the_stranger_2014/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/D1D1A794992B4280A93F8A73E88B40B29136C089.torrent","hash":"D1D1A794992B4280A93F8A73E88B40B29136C089","quality":"1080p","seeds":720,"peers":402,"size":"1.44 GB","size_bytes":1548861240,"date_uploaded":"2015-10-01 02:51:38","date_uploaded_unix":1443621098}],"date_uploaded":"2015-10-01 02:51:23","date_uploaded_unix":1443621083},{"id":4517,"url":"https://yts.to/movie/mr-blue-sky-the-story-of-jeff-lynne-elo-2012","imdb_code":"tt2440214","title":"Mr Blue Sky: The Story of Jeff Lynne & ELO","title_long":"Mr Blue Sky: The Story of Jeff Lynne & ELO (2012)","slug":"mr-blue-sky-the-story-of-jeff-lynne-elo-2012","year":2012,"rating":8.1,"runtime":60,"genres":["Documentary","Music"],"language":"English","mpa_rating":"Unknown","background_image":"https://s.ynet.io/assets/images/movies/mr_blue_sky_the_story_of_jeff_lynne_elo_2012/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/mr_blue_sky_the_story_of_jeff_lynne_elo_2012/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/mr_blue_sky_the_story_of_jeff_lynne_elo_2012/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/32B90BFD4385DF171557B4ACA27E1023E5DD0CC3.torrent","hash":"32B90BFD4385DF171557B4ACA27E1023E5DD0CC3","quality":"720p","seeds":598,"peers":128,"size":"691.62 MB","size_bytes":725211154,"date_uploaded":"2015-10-01 00:57:37","date_uploaded_unix":1443614257}],"date_uploaded":"2015-10-01 00:57:35","date_uploaded_unix":1443614255},{"id":4516,"url":"https://yts.to/movie/4got10-2015","imdb_code":"tt4510398","title":"4Got10","title_long":"4Got10 (2015)","slug":"4got10-2015","year":2015,"rating":6.9,"runtime":84,"genres":["Action","Thriller"],"language":"English","mpa_rating":"18","background_image":"https://s.ynet.io/assets/images/movies/4got10_2015/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/4got10_2015/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/4got10_2015/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/4E33A72414B6E4B79853995ED91C960542B115D9.torrent","hash":"4E33A72414B6E4B79853995ED91C960542B115D9","quality":"1080p","seeds":7565,"peers":3795,"size":"1.23 GB","size_bytes":1322189494,"date_uploaded":"2015-09-30 23:45:24","date_uploaded_unix":1443609924}],"date_uploaded":"2015-09-30 22:45:18","date_uploaded_unix":1443606318},{"id":4515,"url":"https://yts.to/movie/whirlpool-1949","imdb_code":"tt0042039","title":"Whirlpool","title_long":"Whirlpool (1949)","slug":"whirlpool-1949","year":1949,"rating":6.9,"runtime":98,"genres":["Crime","Drama"],"language":"English","mpa_rating":"Approved","background_image":"https://s.ynet.io/assets/images/movies/whirlpool_1949/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/whirlpool_1949/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/whirlpool_1949/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/D573BA60A3D9D35306E0DB1618CDC26FDBFD3224.torrent","hash":"D573BA60A3D9D35306E0DB1618CDC26FDBFD3224","quality":"1080p","seeds":121,"peers":71,"size":"1.44 GB","size_bytes":1543716222,"date_uploaded":"2015-09-30 17:51:22","date_uploaded_unix":1443588682}],"date_uploaded":"2015-09-30 17:51:17","date_uploaded_unix":1443588677},{"id":4514,"url":"https://yts.to/movie/catch-me-daddy-2014","imdb_code":"tt2626964","title":"Catch Me Daddy","title_long":"Catch Me Daddy (2014)","slug":"catch-me-daddy-2014","year":2014,"rating":6.7,"runtime":112,"genres":["Thriller"],"language":"English","mpa_rating":"15","background_image":"https://s.ynet.io/assets/images/movies/catch_me_daddy_2014/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/catch_me_daddy_2014/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/catch_me_daddy_2014/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/256AF43E601BE757F96BD0C1DC7483FD1BDD33FC.torrent","hash":"256AF43E601BE757F96BD0C1DC7483FD1BDD33FC","quality":"720p","seeds":508,"peers":157,"size":"814.87 MB","size_bytes":854455068,"date_uploaded":"2015-09-30 15:47:41","date_uploaded_unix":1443581261},{"url":"https://yts.to/torrent/download/0A368068C6FB7EC04FDE724CB221BE59E950EFAA.torrent","hash":"0A368068C6FB7EC04FDE724CB221BE59E950EFAA","quality":"1080p","seeds":343,"peers":139,"size":"1.65 GB","size_bytes":1768107499,"date_uploaded":"2015-10-01 04:16:09","date_uploaded_unix":1443626169}],"date_uploaded":"2015-09-30 15:47:40","date_uploaded_unix":1443581260},{"id":4513,"url":"https://yts.to/movie/the-little-girl-who-lives-down-the-lane-1976","imdb_code":"tt0074806","title":"The Little Girl Who Lives Down the Lane","title_long":"The Little Girl Who Lives Down the Lane (1976)","slug":"the-little-girl-who-lives-down-the-lane-1976","year":1976,"rating":7.1,"runtime":91,"genres":["Drama","Mystery"],"language":"English","mpa_rating":"PG","background_image":"https://s.ynet.io/assets/images/movies/the_little_girl_who_lives_down_the_lane_1976/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/the_little_girl_who_lives_down_the_lane_1976/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/the_little_girl_who_lives_down_the_lane_1976/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/086DDD46A667C25C723B434366B82684FFC96F48.torrent","hash":"086DDD46A667C25C723B434366B82684FFC96F48","quality":"720p","seeds":242,"peers":86,"size":"754.91 MB","size_bytes":791584909,"date_uploaded":"2015-09-30 13:20:28","date_uploaded_unix":1443572428},{"url":"https://yts.to/torrent/download/937911745A8FAB1859ACE7B3D1259FB62045F118.torrent","hash":"937911745A8FAB1859ACE7B3D1259FB62045F118","quality":"1080p","seeds":239,"peers":99,"size":"1.44 GB","size_bytes":1550021898,"date_uploaded":"2015-09-30 15:11:07","date_uploaded_unix":1443579067}],"date_uploaded":"2015-09-30 13:20:22","date_uploaded_unix":1443572422},{"id":4512,"url":"https://yts.to/movie/for-love-or-money-1993","imdb_code":"tt0106941","title":"For Love or Money","title_long":"For Love or Money (1993)","slug":"for-love-or-money-1993","year":1993,"rating":6.1,"runtime":96,"genres":["Comedy","Drama"],"language":"English","mpa_rating":"PG","background_image":"https://s.ynet.io/assets/images/movies/for_love_or_money_1993/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/for_love_or_money_1993/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/for_love_or_money_1993/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/C676DC8DE980B5BF6D5312D7FF173912C0282851.torrent","hash":"C676DC8DE980B5BF6D5312D7FF173912C0282851","quality":"720p","seeds":531,"peers":185,"size":"751.15 MB","size_bytes":787641717,"date_uploaded":"2015-09-30 02:11:03","date_uploaded_unix":1443532263}],"date_uploaded":"2015-09-30 02:10:58","date_uploaded_unix":1443532258},{"id":4511,"url":"https://yts.to/movie/the-neanderthal-man-1953","imdb_code":"tt0046121","title":"The Neanderthal Man","title_long":"The Neanderthal Man (1953)","slug":"the-neanderthal-man-1953","year":1953,"rating":4.6,"runtime":78,"genres":["Horror","Sci-Fi"],"language":"English","mpa_rating":"Not Rated","background_image":"https://s.ynet.io/assets/images/movies/the_neanderthal_man_1953/background.jpg","small_cover_image":"https://s.ynet.io/assets/images/movies/the_neanderthal_man_1953/small-cover.jpg","medium_cover_image":"https://s.ynet.io/assets/images/movies/the_neanderthal_man_1953/medium-cover.jpg","state":"ok","torrents":[{"url":"https://yts.to/torrent/download/56510CA4AA92E6F17EE6DDD4298A77032A09C39A.torrent","hash":"56510CA4AA92E6F17EE6DDD4298A77032A09C39A","quality":"720p","seeds":77,"peers":24,"size":"689.90 MB","size_bytes":723415904,"date_uploaded":"2015-09-29 15:12:49","date_uploaded_unix":1443492769}],"date_uploaded":"2015-09-29 15:12:11","date_uploaded_unix":1443492731}]
         */

        private int movie_count;
        private int limit;
        private int page_number;
        private List<MoviesEntity> movies;

        public void setMovie_count(int movie_count) {
            this.movie_count = movie_count;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public void setPage_number(int page_number) {
            this.page_number = page_number;
        }

        public void setMovies(List<MoviesEntity> movies) {
            this.movies = movies;
        }

        public int getMovie_count() {
            return movie_count;
        }

        public int getLimit() {
            return limit;
        }

        public int getPage_number() {
            return page_number;
        }

        public List<MoviesEntity> getMovies() {
            return movies;
        }

        public static class MoviesEntity {
            /**
             * id : 4530
             * url : https://yts.to/movie/narcopolis-2015
             * imdb_code : tt1957938
             * title : Narcopolis
             * title_long : Narcopolis (2015)
             * slug : narcopolis-2015
             * year : 2015
             * rating : 4.6
             * runtime : 96
             * genres : ["Mystery","Sci-Fi"]
             * language : English
             * mpa_rating : 18
             * background_image : https://s.ynet.io/assets/images/movies/narcopolis_2015/background.jpg
             * small_cover_image : https://s.ynet.io/assets/images/movies/narcopolis_2015/small-cover.jpg
             * medium_cover_image : https://s.ynet.io/assets/images/movies/narcopolis_2015/medium-cover.jpg
             * state : ok
             * torrents : [{"url":"https://yts.to/torrent/download/6BE9B33D85CB338C4577AEC855DD6A372ABA56BD.torrent","hash":"6BE9B33D85CB338C4577AEC855DD6A372ABA56BD","quality":"1080p","seeds":584,"peers":1433,"size":"1.44 GB","size_bytes":1549135222,"date_uploaded":"2015-10-04 13:23:56","date_uploaded_unix":1443918236}]
             * date_uploaded : 2015-10-04 13:23:43
             * date_uploaded_unix : 1443918223
             */

            private int id;
            private String url;
            private String imdb_code;
            private String title;
            private String title_long;
            private String slug;
            private int year;
            private double rating;
            private int runtime;
            private String language;
            private String mpa_rating;
            private String background_image;
            private String small_cover_image;
            private String medium_cover_image;
            private String state;
            private String date_uploaded;
            private int date_uploaded_unix;
            private List<String> genres;

            public void setId(int id) {
                this.id = id;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public void setImdb_code(String imdb_code) {
                this.imdb_code = imdb_code;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setTitle_long(String title_long) {
                this.title_long = title_long;
            }

            public void setSlug(String slug) {
                this.slug = slug;
            }

            public void setYear(int year) {
                this.year = year;
            }

            public void setRating(double rating) {
                this.rating = rating;
            }

            public void setRuntime(int runtime) {
                this.runtime = runtime;
            }

            public void setLanguage(String language) {
                this.language = language;
            }

            public void setMpa_rating(String mpa_rating) {
                this.mpa_rating = mpa_rating;
            }

            public void setBackground_image(String background_image) {
                this.background_image = background_image;
            }

            public void setSmall_cover_image(String small_cover_image) {
                this.small_cover_image = small_cover_image;
            }

            public void setMedium_cover_image(String medium_cover_image) {
                this.medium_cover_image = medium_cover_image;
            }

            public void setState(String state) {
                this.state = state;
            }

            public void setDate_uploaded(String date_uploaded) {
                this.date_uploaded = date_uploaded;
            }

            public void setDate_uploaded_unix(int date_uploaded_unix) {
                this.date_uploaded_unix = date_uploaded_unix;
            }

            public void setGenres(List<String> genres) {
                this.genres = genres;
            }

            public int getId() {
                return id;
            }

            public String getUrl() {
                return url;
            }

            public String getImdb_code() {
                return imdb_code;
            }

            public String getTitle() {
                return title;
            }

            public String getTitle_long() {
                return title_long;
            }

            public String getSlug() {
                return slug;
            }

            public int getYear() {
                return year;
            }

            public double getRating() {
                return rating;
            }

            public int getRuntime() {
                return runtime;
            }

            public String getLanguage() {
                return language;
            }

            public String getMpa_rating() {
                return mpa_rating;
            }

            public String getBackground_image() {
                return background_image;
            }

            public String getSmall_cover_image() {
                return small_cover_image;
            }

            public String getMedium_cover_image() {
                return medium_cover_image;
            }

            public String getState() {
                return state;
            }

            public String getDate_uploaded() {
                return date_uploaded;
            }

            public int getDate_uploaded_unix() {
                return date_uploaded_unix;
            }

            public List<String> getGenres() {
                return genres;
            }
        }
    }
}
