package com.example.models

sealed class Endpoints(val path: String){
     object Root: Endpoints(path = "/")
     object GetAllHeroesAlternative: Endpoints(path = "/lol/heroes")
     object GetAllHeroes: Endpoints(path = "/lol/heroes")
     object SearchHeroes: Endpoints(path = "lol/heroes/search")

     object GetAllComics: Endpoints(path = "/lol/comics")

     object TokenVerification: Endpoints(path = "/token_verification")
     object GetUserInfo: Endpoints(path = "/get_user")
     object UpdateUserInfo: Endpoints(path = "/update_user")
     object DeleteUser: Endpoints(path = "/delete_user")
     object SingOut: Endpoints(path = "/sign_out")
     object Unauthorized: Endpoints(path = "/unauthorized")
     object Authorized: Endpoints(path = "/authorized")



}
